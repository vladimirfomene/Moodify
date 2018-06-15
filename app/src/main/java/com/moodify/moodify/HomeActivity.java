package com.moodify.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         Button Red = (Button) findViewById(R.id.red);
         Button Orange = (Button) findViewById(R.id.orange);
         Button Yellow = (Button) findViewById(R.id.yellow);
         Button Lgreen = (Button) findViewById(R.id.lgreen);
         Button Dgreen = (Button) findViewById(R.id.dgreen);

        Red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent next = new Intent(HomeActivity.this,Activity1_2.class);
                startActivity(next);

            }
        });

        Orange.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent next = new Intent(HomeActivity.this,Activity1_2.class);
                startActivity(next);
            }
        });

        Yellow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent next = new Intent(HomeActivity.this,Activity3.class);
                startActivity(next);
            }
        });

        Lgreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent next = new Intent(HomeActivity.this,Activity_4_5.class);
                startActivity(next);
            }
        });

        Dgreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent next = new Intent(HomeActivity.this,Activity_4_5.class);
                startActivity(next);
            }
        });









    }

}
