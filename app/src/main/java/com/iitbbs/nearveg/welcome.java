package com.iitbbs.nearveg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
      /*  FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void onClickgotomain(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(i);

    }

    public void onClicktologin(View view){
        Intent i = new Intent(getApplicationContext(),login.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(i);
    }

    public void onClicktosignup(View view) {
        Intent i = new Intent(getApplicationContext(),sign.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(i);
    }
}
