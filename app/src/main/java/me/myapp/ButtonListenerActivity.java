package me.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonListenerActivity extends AppCompatActivity {

    private EditText pass_word;
    private Button button_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_listener);
        addListenerOnButton();
    }

    public void onHomeButtonClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void addListenerOnButton() {
        pass_word = (EditText)findViewById(R.id.password1);
        button_submit = (Button) findViewById(R.id.button10);
        button_submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                ButtonListenerActivity.this, pass_word.getText(), Toast.LENGTH_SHORT
                        ).show();
            }
        });
    }
}
