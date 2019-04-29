package com.bpmpk.jhon.projek;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SertifikatActivity extends AppCompatActivity {

    TextView TvSkorSertifikat;
    Button Home;
    Button Serticate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sertifikat);

        TvSkorSertifikat = (TextView) findViewById(R.id.tvSkorSertifikat);
        Home = (Button) findViewById(R.id.btnMenu);
        Serticate = (Button) findViewById(R.id.Getme);

        setSkor();

        int skors = getIntent().getIntExtra("scores",80);
        if(skors>=80) {
            Serticate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent s = new Intent(SertifikatActivity.this, LoginActivity.class);
                    startActivity(s);
                }
            });
        }else{
            Serticate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(SertifikatActivity.this,"Sorry! You can't get the certificate. Please try again!",Toast.LENGTH_LONG).show();
                }
            });
        }
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent (SertifikatActivity.this, MenuActivity.class);
                startActivity(b);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void setSkor(){
        String activity = getIntent().getStringExtra("activity");
        String skorquiz = getIntent().getStringExtra("SkorQuiz");

        if(activity.equals("QuizActivity")) {
            TvSkorSertifikat.setText("SKOR : " + skorquiz);
        }
        else {
            TvSkorSertifikat.setText("Please Answere");
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Please click home button", Toast.LENGTH_SHORT).show();
    }
}