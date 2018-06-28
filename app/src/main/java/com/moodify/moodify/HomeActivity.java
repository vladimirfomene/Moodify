package com.moodify.moodify;

import android.content.Intent;
import android.os.Bundle;
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
                Intent whatsappIntent = new Intent();
                whatsappIntent.setAction(Intent.ACTION_SEND);
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I need your help");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.setType("text/plain");
                startActivity(whatsappIntent);

            }
        });

        Orange.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent whatsappIntent = new Intent();
                whatsappIntent.setAction(Intent.ACTION_SEND);
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I need your help");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.setType("text/plain");
                startActivity(whatsappIntent);
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
                Intent next = new Intent(HomeActivity.this,PlayerActivity.class);
                next.putExtra("asset", "four");
                startActivity(next);
            }
        });

        Dgreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent next = new Intent(HomeActivity.this,PlayerActivity.class);
                next.putExtra("asset", "five");
                startActivity(next);
            }
        });

    }

}
