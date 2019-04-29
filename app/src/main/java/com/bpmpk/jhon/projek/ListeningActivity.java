package com.bpmpk.jhon.projek;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ZoomControls;

import br.com.felix.imagezoom.ImageZoom;

public class ListeningActivity extends AppCompatActivity {
    RadioGroup radioG;
    RadioButton radioA, radioB, radioC, radioD, radioE;
    ImageButton play, pause;
    ImageZoom ImageQuiz;
    TextView TextQuiz;
    Button next;
    MediaPlayer mPlayer;
    int skor=0;
    int arr;
    int x;
    String answere;

    BankListening quistionBS = new BankListening();

    @SuppressLint({"WrongViewCast", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

        radioG = (RadioGroup)findViewById(R.id.GroupAnswere);
        radioA = (RadioButton) findViewById(R.id.radio_a);
        radioB = (RadioButton) findViewById(R.id.radio_b);
        radioC = (RadioButton) findViewById(R.id.radio_c);
        radioD = (RadioButton) findViewById(R.id.radio_d);
        radioE = (RadioButton) findViewById(R.id.radio_e);
        ImageQuiz = (ImageZoom) findViewById(R.id.imageQuiz);
        TextQuiz = (TextView) findViewById(R.id.textQuiz);
        play = (ImageButton) findViewById(R.id.imgplay);
        pause = (ImageButton) findViewById(R.id.imgpause);
        next = (Button) findViewById(R.id.next);

        setConten();

        play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                play();
                play.setEnabled(false);
                pause.setEnabled(true);
            }

        });

        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                pause();
                play.setEnabled(true);
                pause.setEnabled(false);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer.isPlaying()) {
                    Toast.makeText(ListeningActivity.this, "please pause quistion", Toast.LENGTH_SHORT).show();
                }
                else {
                    cekAnswere();
                }
            }
        });
    }

    public void setConten() {
        play.setEnabled(true);
        pause.setEnabled(false);
        radioG.clearCheck();
        arr = quistionBS.quistion.length;
        if (x >= arr) {
            String allSkor = String.valueOf(skor);
            Intent i = new Intent(this, EndActivity.class);
            i.putExtra("SkorListening",allSkor);
            i.putExtra("activity","ListeningActivity");
            startActivity(i);
        }
        else {
            mPlayer = MediaPlayer.create(this, quistionBS.getQuistion(x));
            changeImage();
            TextQuiz.setText(quistionBS.getTextQuiz(x));
            radioA.setText(quistionBS.getAnswere1(x));
            radioB.setText(quistionBS.getAnswere2(x));
            radioC.setText(quistionBS.getAnswere3(x));
            radioD.setText(quistionBS.getAnswere4(x));
            radioE.setText(quistionBS.getAnswere5(x));
            answere = quistionBS.getGoodAnswere(x);
        }
        x++;
    }

    public void changeImage() {
        Resources res = getResources();
        String Image = quistionBS.getImageQuiz(x);
        int resID = res.getIdentifier(Image, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        ImageQuiz.setImageDrawable(drawable);
    }

    public void cekAnswere() {
        if (radioA.isChecked()) {
            if (radioA.getText().toString().equals(answere)) {
                skor = skor + 10;
                setConten();
            }
            else {
                setConten();
            }
        } else if (radioB.isChecked()) {
            if (radioB.getText().toString().equals(answere)) {
                skor = skor + 10;
                setConten();
            }
            else {
                setConten();
            }
        } else if (radioC.isChecked()) {
            if (radioC.getText().toString().equals(answere)) {
                skor = skor + 10;
                setConten();
            }
            else {
                setConten();
            }
        } else if (radioD.isChecked()) {
            if (radioD.getText().toString().equals(answere)) {
                skor = skor + 10;
                setConten();
            } else {
                setConten();
            }
        } else if (radioE.isChecked()) {
            if (radioE.getText().toString().equals(answere)) {
                skor = skor + 10;
                setConten();
            } else {
                setConten();
            }
        }
        else {
            Toast.makeText(this, "select the answere", Toast.LENGTH_SHORT).show();
        }
    }

    public void play() {
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
            }
        });
        mPlayer.start();
    }
    public void pause() {
        if (mPlayer.isPlaying())
            if (mPlayer!=null) {
                mPlayer.pause();
            } else {
                if (mPlayer!=null) {
                    mPlayer.start();
                }
            }
    }

    public void onBackPressed() {
        Toast.makeText(this, "please complete the quiz", Toast.LENGTH_SHORT).show();
    }
}