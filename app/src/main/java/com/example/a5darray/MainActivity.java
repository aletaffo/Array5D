package com.example.a5darray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String nazioni[]={"Italia","Germania","Spagna"};
    ListView listaStati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaStati = (ListView)findViewById(R.id.lisArray);
        ArrayAdapter<String>aaStati = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nazioni);
        listaStati.setAdapter(aaStati);



        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hai premuto il tasto",Toast.LENGTH_LONG).show();
            }
        });

    }
}