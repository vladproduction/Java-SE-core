
package com.entity;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private Long timestamp;

    public User(){}

    public User(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return  Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(timestamp, user.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }

    @Override
    public String toString() {
        return String.format("login = %s, password = %s, timestamp = %d " , login, password, timestamp);
    }
}
