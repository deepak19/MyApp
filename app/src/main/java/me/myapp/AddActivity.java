package me.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void onHomeButtonClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onButton1aClick(View v) {
        EditText e1 = (EditText)findViewById(R.id.nOne);
        EditText e2 = (EditText)findViewById(R.id.nTwo);
        TextView t1 = (TextView)findViewById(R.id.result);
        int number1 = Integer.parseInt(e1.getText().toString());
        int number2 = Integer.parseInt(e2.getText().toString());
        int sum = number1 + number2;
        t1.setText(Integer.toString(sum));
    }
}
