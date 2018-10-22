package decloudius.app.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import decloudius.app.kumpulanhadits.model.Doa;

/**
 * Created by Umair
 */

public class DetailActivity extends AppCompatActivity{
    TextView namaDoa, artiDoa, arabDoa;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namaDoa = (TextView) findViewById(R.id.namaDoa);
        artiDoa = (TextView) findViewById(R.id.artiDoa);
        arabDoa = (TextView) findViewById(R.id.arabDoa);

        Doa doa = (Doa) getIntent().getSerializableExtra("id_doa");

        namaDoa.setText(doa.getNama());
        artiDoa.setText(doa.getArti());
        arabDoa.setText(doa.getSurah());
    }
}
