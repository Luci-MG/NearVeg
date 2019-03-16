package com.iitbbs.nearveg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class sign extends AppCompatActivity {

    private EditText username_signup ;
    private EditText name_signup ;
    private EditText phno_signup ;
    private EditText password_signup ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void onClicktoback(View view) {
        Intent intent = new Intent(getApplicationContext(),welcome.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(intent);
    }

    public void onClicknamesignup(View view) {
        username_signup = findViewById(R.id.username_signup);
        name_signup  = findViewById(R.id.name_signup);
        phno_signup = findViewById(R.id.phno_signup);
        password_signup = findViewById(R.id.password_signup);
        username_signup.setCursorVisible(true);
        name_signup.setCursorVisible(false);
        phno_signup.setCursorVisible(false);
        password_signup.setCursorVisible(false);
    }

    public void onClickusernamesignup(View view) {
        username_signup = findViewById(R.id.username_signup);
        name_signup  = findViewById(R.id.name_signup);
        phno_signup = findViewById(R.id.phno_signup);
        password_signup = findViewById(R.id.password_signup);
        username_signup.setCursorVisible(false);
        name_signup.setCursorVisible(true);
        phno_signup.setCursorVisible(false);
        password_signup.setCursorVisible(false);
    }

    public void onClickusernamepassword(View view) {
        username_signup = findViewById(R.id.username_signup);
        name_signup  = findViewById(R.id.name_signup);
        phno_signup = findViewById(R.id.phno_signup);
        password_signup = findViewById(R.id.password_signup);
        username_signup.setCursorVisible(false);
        name_signup.setCursorVisible(false);
        phno_signup.setCursorVisible(false);
        password_signup.setCursorVisible(true);
    }

    public void onClickphonenosignup(View view) {
        username_signup = findViewById(R.id.username_signup);
        name_signup  = findViewById(R.id.name_signup);
        phno_signup = findViewById(R.id.phno_signup);
        password_signup = findViewById(R.id.password_signup);
        username_signup.setCursorVisible(false);
        name_signup.setCursorVisible(false);
        phno_signup.setCursorVisible(true);
        password_signup.setCursorVisible(false);
    }

    public void onClicktoologin(View view) {
        Intent intent = new Intent(getApplicationContext(),login.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(intent);
    }
}
