package com.pachecocarpio.xpressmusicui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView card_am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_am=(CardView)findViewById(R.id.card_am);

        card_am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launcher=new Intent(MainActivity.this,ListaCanciones.class);
                startActivity(launcher);
            }
        });

    }
}
