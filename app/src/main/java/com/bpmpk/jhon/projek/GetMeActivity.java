package com.bpmpk.jhon.projek;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class GetMeActivity extends AppCompatActivity {

    TextView name, instansi, nisn, date;
    String S_name;
    String S_instansi;
    String S_nisn;

    String S_date;

    boolean doubleBackToExitPressedOnce = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_me);

        Calendar calendar = Calendar.getInstance();
        S_date = DateFormat.getDateInstance().format(calendar.getTime());

        name = (TextView) findViewById(R.id.name);
        instansi = (TextView) findViewById(R.id.instansi);
        nisn = (TextView) findViewById(R.id.nisn);
        date = (TextView) findViewById(R.id.date);

        S_name = getIntent().getExtras().getString("s_name");
        S_instansi = getIntent().getExtras().getString("s_instansi");
        S_nisn = getIntent().getExtras().getString("s_nisn");

        name.setText(S_name);
        instansi.setText(S_instansi);
        nisn.setText(S_nisn);
        date.setText(S_date);

    }

    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            Intent i = new Intent(GetMeActivity.this, MenuActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Screenshot Me", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
