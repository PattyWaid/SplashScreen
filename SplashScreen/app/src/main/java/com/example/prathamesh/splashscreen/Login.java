package com.example.prathamesh.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private ImageView img_login;
    private EditText txt_login;
    private EditText pass_login;
    private Button btn_login;
    private String  name;
    private String  pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img_login = (ImageView) findViewById(R.id.img_login);
        txt_login = (EditText) findViewById(R.id.email);
        pass_login = (EditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.sign_in);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = txt_login.getText().toString();
                pass = pass_login.getText().toString();
                if (name.equals("Patty") && pass.equals("123456")){
                    Toast.makeText(Login.this, "Succesfully Logged In", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Login.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
