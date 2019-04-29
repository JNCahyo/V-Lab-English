package com.bpmpk.jhon.projek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    ImageButton listening, quiz, help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        help = (ImageButton) findViewById(R.id.help);
        listening = (ImageButton)findViewById(R.id.image_Listening);
        quiz = (ImageButton)findViewById(R.id.image_qna);

        listening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(MenuActivity.this, ListeningActivity.class);
                startActivity (l);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(MenuActivity.this, QuizActivity.class);
                startActivity (q);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(MenuActivity.this, HelpActivity.class);
                startActivity(h);
            }
        });
    }

    public void onBackPressed() {

        Toast.makeText(this, "Let's Go !!!", Toast.LENGTH_SHORT).show();
    }
}
