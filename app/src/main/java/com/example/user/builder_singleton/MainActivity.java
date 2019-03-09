package com.example.user.builder_singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person = Person.newBuilder("Jane", 1995)
                .setHeight(172)
                .setHaveChildren(false)
                .build();
        ApiService apiService1 = ApiService.getInstance("Something");
        ApiService apiService2 = ApiService.getInstance("Text");

    }


}
