package com.example.post_retrofit;

public class PostClass {


    private String id;
    private String email;
    private String gendar;
    private Last_login last_login;

    public PostClass(String id, String email, String gendar, Last_login last_login) {
        this.id = id;
        this.email = email;
        this.gendar = gendar;
        this.last_login = last_login;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public Last_login getLast_login() {
        return last_login;
    }

    public void setLast_login(Last_login last_login) {
        this.last_login = last_login;
    }
}
