package com.example.mascotas;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DatosMascota> mascotas;
    private RecyclerView ListaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar ActionBar = findViewById(R.id.actionbar);
        setSupportActionBar(ActionBar);

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
        mascotas.add(new DatosMascota("Joaquin",R.drawable.perro6));
        mascotas.add(new DatosMascota("Nagasaki",R.drawable.perro7));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.btFav:
                Intent intent = new Intent(this, MascotasFavoritas.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}