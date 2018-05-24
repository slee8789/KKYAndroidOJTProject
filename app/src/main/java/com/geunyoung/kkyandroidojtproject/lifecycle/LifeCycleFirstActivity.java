package com.geunyoung.kkyandroidojtproject.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.geunyoung.kkyandroidojtproject.R;

public class LifeCycleFirstActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle_first);
        findViewById(R.id.btnGoToSecondActivity).setOnClickListener(this);
        Toast.makeText(this,"LifeCycleFirstActivity onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"LifeCycleFirstActivity onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"LifeCycleFirstActivity onRestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"LifeCycleFirstActivity onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"LifeCycleFirstActivity onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"LifeCycleFirstActivity onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"LifeCycleFirstActivity onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, LifeCycleSecondActivity.class));
    }
}
