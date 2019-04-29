package com.bpmpk.jhon.projek;

        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.content.res.Resources;
        import android.graphics.drawable.Drawable;
        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;
        import android.widget.Toast;

        import br.com.felix.imagezoom.ImageZoom;

public class QuizActivity extends AppCompatActivity {
    RadioGroup radio_Group;
    RadioButton radio_A, radio_B, radio_C, radio_D, radio_E;
    ImageButton play_quiz, pause_quiz;
    ImageZoom image_quiz;
    Button Next;
    MediaPlayer mPlayerQuiz;
    int skor=0;
    int arr;
    int x;
    String answerequiz;

    BankQuiz quistionBQ = new BankQuiz();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        radio_Group = (RadioGroup) findViewById(R.id.group_Answere);
        radio_A = (RadioButton) findViewById(R.id.radio_A);
        radio_B = (RadioButton) findViewById(R.id.radio_B);
        radio_C = (RadioButton) findViewById (R.id.radio_C);
        radio_D = (RadioButton) findViewById (R.id.radio_D);
        radio_E = (RadioButton) findViewById (R.id.radio_E);
        image_quiz = (ImageZoom) findViewById(R.id.image_quiz);
        play_quiz = (ImageButton) findViewById(R.id.play_quiz);
        pause_quiz = (ImageButton) findViewById(R.id.pause_quiz);
        Next = (Button) findViewById(R.id.next_quiz);

        setQuiz();

        play_quiz.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                play();
                play_quiz.setEnabled(false);
                pause_quiz.setEnabled(true);
            }

        });

        pause_quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                pause();
                play_quiz.setEnabled(true);
                pause_quiz.setEnabled(false);
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayerQuiz.isPlaying()) {
                    Toast.makeText(QuizActivity.this, "please pause quistion", Toast.LENGTH_SHORT).show();
                }
                else {
                    cekAnswere();
                }
            }
        });
    }

    public void setQuiz() {
        play_quiz.setEnabled(true);
        pause_quiz.setEnabled(false);
        radio_Group.clearCheck();
        arr = quistionBQ.quistion_quiz.length;
        if (x >= arr) {
            String allSkor = String.valueOf(skor);
            int score = skor;
            Intent i = new Intent(this, SertifikatActivity.class);
            i.putExtra("scores",score);
            i.putExtra("SkorQuiz",allSkor);
            i.putExtra("activity","QuizActivity");
            startActivity(i);
        }
        else {
            mPlayerQuiz = MediaPlayer.create(this, quistionBQ.get_Quistion(x));
            changeImageQuiz();
            radio_A.setText(quistionBQ.get_Answere1(x));
            radio_B.setText(quistionBQ.get_Answere2(x));
            radio_C.setText(quistionBQ.get_Answere3(x));
            radio_D.setText(quistionBQ.get_Answere4(x));
            radio_E.setText(quistionBQ.get_Answere5(x));
            answerequiz = quistionBQ.get_GoodAnswere(x);
        }
        x++;
    }

    public void changeImageQuiz() {
        Resources res = getResources();
        String Image = quistionBQ.get_ImageQuiz(x);
        int resID = res.getIdentifier(Image, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        image_quiz.setImageDrawable(drawable);
    }

    public void cekAnswere() {
        if (radio_A.isChecked()) {
            if (radio_A.getText().toString().equals(answerequiz)) {
                skor = skor + 10;
                setQuiz();
            }
            else {
                setQuiz();
            }
        } else if (radio_B.isChecked()) {
            if (radio_B.getText().toString().equals(answerequiz)) {
                skor = skor + 10;
                setQuiz();
            }
            else {
                setQuiz();
            }
        } else if (radio_C.isChecked()) {
            if (radio_C.getText().toString().equals(answerequiz)) {
                skor = skor + 10;
                setQuiz();
            }
            else {
                setQuiz();
            }
        } else if (radio_D.isChecked()) {
            if (radio_D.getText().toString().equals(answerequiz)) {
                skor = skor + 10;
                setQuiz();
            } else {
                setQuiz();
            }
        } else if (radio_E.isChecked()) {
            if (radio_E.getText().toString().equals(answerequiz)) {
                skor = skor + 10;
                setQuiz();
            } else {
                setQuiz();
            }
        }
        else {
            Toast.makeText(this, "select the answere", Toast.LENGTH_SHORT).show();
        }
    }

    public void play() {
        mPlayerQuiz.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
            }
        });
        mPlayerQuiz.start();
    }
    public void pause() {
        if (mPlayerQuiz.isPlaying())
            if (mPlayerQuiz!=null) {
                mPlayerQuiz.pause();
            } else {
                if (mPlayerQuiz!=null) {
                    mPlayerQuiz.start();
                }
            }
    }

    public void onBackPressed() {
        Toast.makeText(this, "please complete the quiz", Toast.LENGTH_SHORT).show();
    }
}