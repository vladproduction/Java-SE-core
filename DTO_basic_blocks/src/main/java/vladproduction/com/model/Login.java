package vladproduction.com.model;

import java.util.Objects;

//Standard class with classic blocks;
public class Login {

    private String username;
    private String pass;
    private int id;

    public Login(){};

    public Login(String username, String pass, int id) {
        this.username = username;
        this.pass = pass;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Login login = (Login) object;
        return Objects.equals(username, login.username) &&
                Objects.equals(pass, login.pass)&&
                Objects.equals(id, login.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, pass, id);
    }
}
