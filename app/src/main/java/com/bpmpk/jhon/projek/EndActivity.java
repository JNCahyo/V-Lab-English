package com.bpmpk.jhon.projek;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EndActivity extends AppCompatActivity {

    TextView TvSkor;
    Button Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        TvSkor = (TextView) findViewById(R.id.tvSkorAkhir);
        Home = (Button) findViewById(R.id.btnMenu);

        setSkor();

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent (EndActivity.this, MenuActivity.class);
                startActivity(b);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void setSkor(){
        String activity = getIntent().getStringExtra("activity");
        String skorlistening = getIntent().getStringExtra("SkorListening");

        if(activity.equals("ListeningActivity")) {
            TvSkor.setText("SKOR : " + skorlistening);
        }
        else {
            TvSkor.setText("Please Answere");
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Please click home button", Toast.LENGTH_SHORT).show();
    }
}