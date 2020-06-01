package pl.edu.pwsztar;

import java.util.Optional;

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
        return false;
    }

    @Override
    public Optional<String> getDate() {
        return Optional.empty();
    }
}
