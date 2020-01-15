package com.tuvm.mylib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tuvm.testliblayout.CustomLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomLayout customLayout = findViewById(R.id.idBtn);
    }
}
