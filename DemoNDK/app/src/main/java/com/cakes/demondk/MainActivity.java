package com.cakes.demondk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Intent intent = new Intent();

    public void mainBtnClick(View view) {
        switch (view.getId()) {
            case R.id.base_type:
                intent.setClass(this, BaseTypeActivity.class);
                break;

            case R.id.string_type:
                intent.setClass(this, BaseTypeActivity.class);
                break;
        }

        startActivity(intent);
    }
}