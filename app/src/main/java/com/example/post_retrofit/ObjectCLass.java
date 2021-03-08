package com.example.post_retrofit;

public class ObjectCLass {
    private String token;
     private PostClass data;

    public ObjectCLass(String token, PostClass data) {
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PostClass getData() {
        return data;
    }

    public void setData(PostClass data) {
        this.data = data;
    }
}
