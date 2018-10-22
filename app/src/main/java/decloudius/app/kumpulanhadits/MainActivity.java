package decloudius.app.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import decloudius.app.kumpulanhadits.adapter.DoaAdapter;
import decloudius.app.kumpulanhadits.model.Doa;

/**
 * Created by Umair
 */

public class MainActivity extends AppCompatActivity{

    private List<Doa> doas = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.lst_doa);

        doaCollection();

        DoaAdapter adapter = new DoaAdapter(doas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void doaCollection(){
        doas.add(new Doa("Masuk Masjid", "Arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "Arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "Arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "Arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "Arti dari doa masuk masjid", "Cari di google"));
    }
}