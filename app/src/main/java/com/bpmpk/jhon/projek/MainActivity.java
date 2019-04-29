package com.bpmpk.jhon.projek;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton start;

        @Override
    protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            start = (ImageButton) findViewById(R.id.image_Start);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(l);
            }
        });


    }
}
