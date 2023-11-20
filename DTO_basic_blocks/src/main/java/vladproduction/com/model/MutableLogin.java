package vladproduction.com.model;

public class MutableLogin {
    private String name;
    private String passwordCode;
    private Long number;

    //could be changed...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswordCode() {
        return passwordCode;
    }

    public void setPasswordCode(String passwordCode) {
        this.passwordCode = passwordCode;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
