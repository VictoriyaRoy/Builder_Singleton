package com.example.user.builder_singleton;

public class ApiService {
    private static ApiService instance;
    private String value;
    private static final Object object = new Object();

    private ApiService(String value) {
        this.value = value;
    }

    public static ApiService getInstance(String value) {
        if (instance == null)
            synchronized (object) {
            if (instance == null)
                instance = new ApiService(value);

        }
        return instance;
    }
}
