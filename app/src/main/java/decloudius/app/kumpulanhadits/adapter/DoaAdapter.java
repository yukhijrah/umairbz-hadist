package decloudius.app.kumpulanhadits.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import decloudius.app.kumpulanhadits.DetailActivity;
import decloudius.app.kumpulanhadits.R;
import decloudius.app.kumpulanhadits.model.Doa;
import decloudius.app.kumpulanhadits.viewholder.DoaHolder;

/**
 * Created by Umair
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas = new ArrayList<>();
    public DoaAdapter(List<Doa> doas){
        this.doas = doas;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemVew = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, parent, false);
        //return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent, false));
        final DoaHolder doaHolder = new DoaHolder(itemVew);

        doaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = doaHolder.getAdapterPosition();
                Intent intent = new Intent(doaHolder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", doas.get(position));

                doaHolder.itemView.getContext().startActivity(intent);
            }
        });
        return doaHolder;
    }

    //holder
    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        final Doa doa = doas.get(position);
        holder.namaDoa.setText(doa.getNama());
        holder.artiDoa.setText(doa.getArti());
    }

    //deteksi jumlah item yg dimiliki
    @Override
    public int getItemCount() {

        return doas.size();
    }
}
