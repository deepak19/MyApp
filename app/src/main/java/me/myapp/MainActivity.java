package me.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import android.util.Log;

public class MainActivity extends AppCompatActivity {
//    public static final String MY_TAG = "custom_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.i(MY_TAG,"onCreate");
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(this,AddActivity.class);
        startActivity(intent);
    }

    public void onButton2Click(View v) {
        Intent intent = new Intent(this,ButtonListenerActivity.class);
        startActivity(intent);
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i(MY_TAG, "onStart");
//    }
//
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i(MY_TAG, "onResume");
//    }
//
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i(MY_TAG, "onPause");
//    }
//
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i(MY_TAG, "onStop");
//    }
//
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i(MY_TAG, "onRestart");
//    }
//
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i(MY_TAG, "onDestroy");
//    }
}
