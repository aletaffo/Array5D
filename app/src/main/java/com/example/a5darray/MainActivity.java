package com.example.a5darray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String nazioni[]={"Italia","Germania","Spagna"};
    ListView listaStati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaStati = (ListView)findViewById(R.id.lisArray);
        ArrayAdapter<String>aaStati = new ArrayAdapter<String>(this,R.layout.activity_main,nazioni);
        listaStati.setAdapter(aaStati);
    }
}