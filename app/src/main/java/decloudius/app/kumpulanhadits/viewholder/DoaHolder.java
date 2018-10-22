package decloudius.app.kumpulanhadits.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import decloudius.app.kumpulanhadits.R;

/**
 * Created by Umair
 */

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView namaDoa;
    public TextView arabDoa;
    public TextView artiDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        namaDoa = (TextView) itemView.findViewById(R.id.namaDoa);
        arabDoa = (TextView) itemView.findViewById(R.id.arabDoa);
        artiDoa = (TextView) itemView.findViewById(R.id.artiDoa);
    }
}
