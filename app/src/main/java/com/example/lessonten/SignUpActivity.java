package com.example.lessonten;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
static final String TAG=SignUpActivity.class.toString();
EditText et_full_name,et_email,et_password,et_confirm_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initViews();
    }

    void initViews(){
        et_full_name=findViewById(R.id.et_full_name);
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);
        et_confirm_password=findViewById(R.id.et_confirm_password);
        Button b_singup=findViewById(R.id.b_signup);
        b_singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView tv_signin=findViewById(R.id.tv_signin);
        tv_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        
    }
}