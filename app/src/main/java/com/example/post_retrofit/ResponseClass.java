package com.example.post_retrofit;

public class ResponseClass {

    private String email;
    private String gender;
    private String id;
    private Last_login last_login;

    public ResponseClass(String email, String gender, String id, Last_login last_login) {
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.last_login = last_login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Last_login getLast_login() {
        return last_login;
    }

    public void setLast_login(Last_login last_login) {
        this.last_login = last_login;
    }
}
