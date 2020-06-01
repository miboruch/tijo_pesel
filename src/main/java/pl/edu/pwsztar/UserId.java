package pl.edu.pwsztar;

import java.net.SocketException;
import java.util.Optional;
import java.util.stream.IntStream;

final class UserId implements UserIdChecker {

    public String getId() {
        return id;
    }

    private final String id;    // NR. PESEL

    public UserId(final String id) {
        this.id = id;
    }

    @Override
    public boolean isCorrectSize() {
        return getId() != null && !getId().equals("") && getId().length() == 11;
    }

    @Override
    public Optional<Sex> getSex() {
        int value = Integer.parseInt(String.valueOf(getId().charAt(9)));

        return value % 2 == 0 ? Optional.of(Sex.WOMAN) : Optional.of(Sex.MAN);
    }

    @Override
    public boolean isCorrect() {
        String id = getId();
        String[] separatedNumbers = id.split("");
        int[] validationNumbers = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};

        int sum = IntStream.range(0, validationNumbers.length)
                .map(index -> validationNumbers[index] * Integer.parseInt(String.valueOf(separatedNumbers[index])))
                .sum();

        int lastChar = Integer.parseInt(String.valueOf(id.charAt(10)));

        return sum % 10 == lastChar;
    }

    @Override
    public Optional<String> getDate() {
        return Optional.empty();
    }
}
