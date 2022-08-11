package com.example.actividadd19;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.actividadd19.utilidades.utilidades;

import java.io.ByteArrayOutputStream;

public class AddLibro extends AppCompatActivity {

    EditText et_titulo,et_autor,et_editorial,et_anio;
    ImageView imv_libro;
    Button bt_guardar, bt_cargarImg;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_libro);

        et_titulo = (EditText) findViewById(R.id.et_titulo);
        et_autor = (EditText) findViewById(R.id.et_autor);
        et_editorial = (EditText) findViewById(R.id.et_editorial);
        et_anio = (EditText) findViewById(R.id.et_anio);
        imv_libro = (ImageView) findViewById(R.id.imv_libro);


    }

    public void EventoRegistrar(View view) {
        RegistrarLibros();
    }

    public void RegistrarLibros() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_libros",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(utilidades.CAMPO_TITULO,et_titulo.getText().toString());
        values.put(utilidades.CAMPO_AUTOR,et_autor.getText().toString());
        values.put(utilidades.CAMPO_EDITORIAL,et_editorial.getText().toString());
        values.put(utilidades.CAMPO_ANIO,et_anio.getText().toString());
//        values.put(utilidades.CAMPO_IMG,bArray);

        Long id_resultante=db.insert(utilidades.TABLA_LIBROS,utilidades.CAMPO_ID, values);

        Toast.makeText(getApplicationContext(),"Id registro: "+id_resultante,Toast.LENGTH_SHORT).show();
        db.close();

    }
}