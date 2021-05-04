package unicauca.edu.co.dulcespopayan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import unicauca.edu.co.dulcespopayan.R;
import unicauca.edu.co.dulcespopayan.listDulces;

public class adapterCard extends RecyclerView.Adapter<adapterCard.RecyclerHolder> {

    private List<listDulces>items;

    public adapterCard(List<listDulces> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_dulces,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        listDulces item = items.get(position);
        holder.imagenDulce.setImageResource(item.getImagenDulce());
        holder.titulo.setText(item.getTitulo());
        holder.descripcion.setText(item.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class RecyclerHolder extends RecyclerView.ViewHolder {
        private TextView titulo;
        private TextView descripcion;
        private ImageView imagenDulce;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tituloCard);
            descripcion = itemView.findViewById(R.id.descripcionCard);
            imagenDulce = itemView.findViewById(R.id.imagenDulce);
        }
    }
}
