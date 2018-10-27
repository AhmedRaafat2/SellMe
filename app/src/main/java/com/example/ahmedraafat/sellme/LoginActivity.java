package com.example.ahmedraafat.sellme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView_user, textView_pass;
    EditText editText_user, editText_pass;
    CheckBox checkBox_remember;
    Button button_login;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView = findViewById(R.id.imageapp);
        textView_user = findViewById(R.id.text_username);
        textView_pass = findViewById(R.id.text_password);
        editText_user = findViewById(R.id.edit_username);
        editText_pass = findViewById(R.id.edit_password);
        checkBox_remember = findViewById(R.id.remember_me);
        button_login = findViewById(R.id.loginbutton);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText_user.getText() != null && editText_pass.getText() != null){
                    Intent intent = new Intent(LoginActivity.this,ListActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
