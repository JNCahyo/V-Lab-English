package com.bpmpk.jhon.projek;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name, instansi, nisn;
    ImageButton submite;
    String S_name;
    String S_instansi;
    String S_nisn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (EditText)findViewById(R.id.txtname);
        instansi = (EditText)findViewById(R.id.txtinstansi);
        nisn = (EditText)findViewById(R.id.txtnisn);
        submite = (ImageButton)findViewById(R.id.image_Submite);


        submite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().length()==0){
                    name.setError("Masukan Nama");
                }
                else if (instansi.getText().toString().length()==0){
                    instansi.setError("Masukan Instansi");
                }
                else if (nisn.getText().toString().length()==0){
                    nisn.setError("Masukan NISN");
                }
                else {
                    login();
                }
            }
        });
    };

    public void login() {
        S_name = name.getText().toString();
        S_instansi = instansi.getText().toString();
        S_nisn = nisn.getText().toString();

        Intent l = new Intent(LoginActivity.this, GetMeActivity.class);
        l.putExtra("s_name", S_name);
        l.putExtra("s_instansi", S_instansi);
        l.putExtra("s_nisn", S_nisn);
        startActivity(l);
    }

}
