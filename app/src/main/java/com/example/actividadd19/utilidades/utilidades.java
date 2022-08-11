package com.example.actividadd19.utilidades;

public class utilidades {
    //Constantes campos tabla libros

    public static final String TABLA_LIBROS="libros";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_TITULO="titulo";
    public static final String CAMPO_AUTOR="autor";
    public static final String CAMPO_EDITORIAL="editorial";
    public static final String CAMPO_ANIO="anio";
    public static final String CAMPO_IMG="img";


    public static final String CREAR_TABLA_LIBROS="CREATE TABLE " +
            ""+TABLA_LIBROS+" ("+CAMPO_ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+CAMPO_TITULO+" TEXT, "+CAMPO_AUTOR+" TEXT, "+CAMPO_EDITORIAL+" TEXT, " +
            ""+CAMPO_ANIO+" TEXT, "+CAMPO_IMG+" BLOP)";


}
