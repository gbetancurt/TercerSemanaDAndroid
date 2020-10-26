package com.example.mascotas;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {
    private ArrayList<DatosMascota> mascotas;
    private RecyclerView ListaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar actionBar = findViewById(R.id.second_actionbar);
        setSupportActionBar(actionBar);
        setOnClick();

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        ListaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<DatosMascota>();
        mascotas.add(new DatosMascota("Rex",R.drawable.perro1));
        mascotas.add(new DatosMascota("Tiki",R.drawable.perro2));
        mascotas.add(new DatosMascota("Toreto",R.drawable.perro3));
        mascotas.add(new DatosMascota("Alighieri",R.drawable.perro4));
        mascotas.add(new DatosMascota("Bethoven",R.drawable.perro5));
    }

    private void setOnClick(){
        final ImageButton botonatras = (ImageButton) findViewById(R.id.botonatras);
        botonatras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}