package com.example.actividadd19.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.actividadd19.R;
import com.example.actividadd19.entidades.libros;

import java.util.ArrayList;

public class ListaLibrosAdapter extends RecyclerView.Adapter<ListaLibrosAdapter.LibrosViewHolder> {

    ArrayList<libros> listalibros;

    public ListaLibrosAdapter (ArrayList<libros> listalibros){
        this.listalibros = listalibros;
    }

    @NonNull
    @Override
    public LibrosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.libro_view,null,false);
        return new LibrosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibrosViewHolder holder, int position) {
        holder.textid.setText(listalibros.get(position).getId().toString());
        holder.texttitulo.setText(listalibros.get(position).getTitulo());
        holder.textautor.setText(listalibros.get(position).getAutor());
        holder.texteditorial.setText(listalibros.get(position).getEditorial());
        holder.textanio.setText(listalibros.get(position).getAnio());
        holder.imagenLibro.setImageResource(listalibros.indexOf(position));
    }

    @Override
    public int getItemCount() { return listalibros.size();
    }

    public class LibrosViewHolder extends RecyclerView.ViewHolder {

        TextView texttitulo,textautor,texteditorial,textanio,textid;
        ImageView imagenLibro;

        public LibrosViewHolder(@NonNull View itemView) {
            super(itemView);
            textid = (TextView) itemView.findViewById(R.id.textView5);
            texttitulo = (TextView) itemView.findViewById(R.id.texttitulo);
            textautor = (TextView) itemView.findViewById(R.id.textautor);
            texteditorial = (TextView) itemView.findViewById(R.id.texteditorial);
            textanio = (TextView) itemView.findViewById(R.id.textanio);
            imagenLibro = (ImageView) itemView.findViewById(R.id.imv_libro);
        }
    }
}
