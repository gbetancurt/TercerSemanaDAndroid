package com.example.mascotas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter <MascotaAdaptador.MascotasViewHolder>{
    ArrayList<DatosMascota> mascotas;

    public MascotaAdaptador(ArrayList<DatosMascota> mascotas){
        this.mascotas = mascotas;

    }

    @Override
    public MascotasViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotasViewHolder mascotasViewHolder, int position) {
        final DatosMascota mascota = mascotas.get(position);
        mascotasViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotasViewHolder.tvNombre.setText(mascota.getNombre());
        mascotasViewHolder.btLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fav = mascota.getFav();
                mascota.setFav(++fav);
                mascotasViewHolder.tvCont.setText(String.valueOf(fav));
            }
        });

    }
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private ImageButton btLike;
        private TextView tvNombre;
        private TextView tvCont;

        public MascotasViewHolder(View itemView) {
            super(itemView);

            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            btLike = (ImageButton) itemView.findViewById(R.id.btLike);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvCont = (TextView) itemView.findViewById(R.id.tvCont);

        }
    }

}
