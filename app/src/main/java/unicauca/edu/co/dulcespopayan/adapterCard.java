package unicauca.edu.co.dulcespopayan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterCard extends RecyclerView.Adapter<adapterCard.viewHolderCard> {

    ArrayList<listDulces> listDulcesArrayList;

    public adapterCard(ArrayList<listDulces> listDulcesArrayList) {
        this.listDulcesArrayList = listDulcesArrayList;
    }

    @NonNull
    @Override
    public viewHolderCard onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_dulces,null,false);
        return new  viewHolderCard(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderCard holder, int position) {

        holder.titulo.setText(listDulcesArrayList.get(position).getTitulo());
        holder.descripcion.setText(listDulcesArrayList.get(position).getDescripcion());
        holder.imagenDulce.setImageResource(listDulcesArrayList.get(position).getImagenDulce());
    }

    @Override
    public int getItemCount() {
        return listDulcesArrayList.size();
    }

    public class viewHolderCard extends RecyclerView.ViewHolder {

        TextView titulo, descripcion;
        ImageView imagenDulce;

        public viewHolderCard(@NonNull View itemView) {
            super(itemView);

            titulo = (TextView) itemView.findViewById(R.id.tituloCard);
            descripcion = (TextView) itemView.findViewById(R.id.descripcionCard);
            imagenDulce = (ImageView) itemView.findViewById(R.id.imagenDulce);
        }
    }
}
