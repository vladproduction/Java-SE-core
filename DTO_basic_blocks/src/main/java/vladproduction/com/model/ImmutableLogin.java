package vladproduction.com.model;

public final class ImmutableLogin {
    private final String name;
    private final String passwordCode;
    private final Long number;

    public ImmutableLogin(final String name, final String passwordCode, final Long number) {
        this.name = name;
        this.passwordCode = passwordCode;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getPasswordCode() {
        return passwordCode;
    }

    public Long getNumber() {
        return number;
    }
}
