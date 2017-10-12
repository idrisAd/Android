package com.example.idrisadrien.tp7b2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private String resultat = "result";
    private int point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Intent intent = getIntent();

        int point = intent.getIntExtra("point",0);
        String reponseCalcul="Votre score est de : " +point + "/10";


        TextView vueResultat = (TextView)findViewById(R.id.textScore);

        if(vueResultat != null){
            vueResultat.setText(reponseCalcul);
        }

    }
}
