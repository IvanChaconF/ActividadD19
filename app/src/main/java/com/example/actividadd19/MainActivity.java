package com.example.actividadd19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.actividadd19.adaptadores.ListaLibrosAdapter;
import com.example.actividadd19.entidades.libros;
import com.example.actividadd19.utilidades.utilidades;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button bt_agregar;
    RecyclerView recyclerView;
    ArrayList<libros> listaLibros;

    ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"db",null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"db",null,1);

        bt_agregar = (Button) findViewById(R.id.bt_agregar);
        bt_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AddLibro.class);
                startActivity(intent);
            }
        });

        listaLibros = new ArrayList<>();
        recyclerView =(RecyclerView) findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ConsultarListaLibros();
        ListaLibrosAdapter adapter = new ListaLibrosAdapter(listaLibros);
        recyclerView.setAdapter(adapter);
    }

    private void ConsultarListaLibros() {
        SQLiteDatabase db=conn.getWritableDatabase();

        libros libro = null;

        Cursor cursor=db.rawQuery("SELECT * FROM "+ utilidades.TABLA_LIBROS,null );

        while (cursor.moveToNext()){
            libro.getTitulo();
            libro.getAutor();
            libro.getEditorial();
            libro.getAnio();
            libro.getImg(cursor.getBlob(5));

            listaLibros.add(libro);


        }

    }
}