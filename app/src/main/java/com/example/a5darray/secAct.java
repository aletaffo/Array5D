package com.example.a5darray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class secAct extends AppCompatActivity {

    String film[] = {"Batman","Segaman","Pippoman"};
    ListView listaFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilm = findViewById(R.id.lisArray);

        ArrayAdapter<String> aaStati = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, film);
        listaFilm.setAdapter(aaStati);

        listaFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nome = (String)listaFilm.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),nome,Toast.LENGTH_LONG).show();
            }
        });
    }
}