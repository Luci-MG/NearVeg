package com.iitbbs.nearveg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText username_login ;
     private EditText username_password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

   /* View.OnClickListener editTextClickListener = new View.OnClickListener()

    {

        public void onClick(View v)
        {
            if (v.getId() == username_login.getId())
            {
                username_login.setCursorVisible(true);
            }

        }
    };*/

    public void onClickusernamelogin(View view) {
        username_login = findViewById(R.id.username_login);
        username_password = findViewById(R.id.password_login);
        username_password.setCursorVisible(false);
        username_login.setCursorVisible(true);
    }
    public void onClicktoback(View view) {
        Intent intent = new Intent(getApplicationContext(),welcome.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(intent);
    }

    public void onClicktoosignup(View view) {
        Intent intent = new Intent(getApplicationContext(),signup.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(intent);
    }

    public void onClickusernamepassword(View view) {
        username_login = findViewById(R.id.username_login);
        username_password = findViewById(R.id.password_login);
        username_login.setCursorVisible(false);
        username_password.setCursorVisible(true);
    }
}
