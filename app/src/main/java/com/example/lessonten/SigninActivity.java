package com.example.lessonten;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {
    static final String TAG = SigninActivity.class.toString();
    EditText et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        initViews();
    }

    void initViews(){
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);
        Button b_signin=findViewById(R.id.b_signin);
        b_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            callMainActivity();
            }
        });

        TextView tv_signup=findViewById(R.id.tv_signup);
        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callSignUpActivity();
            }
        });

    }
    void callSignUpActivity(){
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
    void callMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}