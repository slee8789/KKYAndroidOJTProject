package com.geunyoung.kkyandroidojtproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.geunyoung.kkyandroidojtproject.lifecycle.LifeCycleFirstActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLifecycle).setOnClickListener(this);
        findViewById(R.id.btnTaskBackstack).setOnClickListener(this);
        findViewById(R.id.btnIntent).setOnClickListener(this);
        findViewById(R.id.btnAlram).setOnClickListener(this);
        findViewById(R.id.btnThread).setOnClickListener(this);
        findViewById(R.id.btnService).setOnClickListener(this);
        findViewById(R.id.btnBroadcast).setOnClickListener(this);
        findViewById(R.id.btnSharedPreference).setOnClickListener(this);
        findViewById(R.id.btnStorage).setOnClickListener(this);
        findViewById(R.id.btnDb).setOnClickListener(this);
        findViewById(R.id.btnDataProvide).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLifecycle:
                startActivity(new Intent(this, LifeCycleFirstActivity.class));
                break;

            case R.id.btnTaskBackstack:
                break;

            case R.id.btnIntent:
                break;

            case R.id.btnAlram:
                break;

            case R.id.btnThread:
                break;

            case R.id.btnService:
                break;

            case R.id.btnBroadcast:
                break;

            case R.id.btnSharedPreference:
                break;

            case R.id.btnStorage:
                break;

            case R.id.btnDb:
                break;

            case R.id.btnDataProvide:
                break;



        }
    }
}
