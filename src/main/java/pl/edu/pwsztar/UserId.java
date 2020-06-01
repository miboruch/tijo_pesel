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
        return Optional.empty();
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
