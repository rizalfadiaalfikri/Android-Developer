package com.rizalfadiaalfikri.a04_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> models = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        adapter = new Adapter(MainActivity.this, models);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        insertData();
        recyclerView.setAdapter(adapter);
    }

    private void insertData() {
        models.add(new Model("Diablo","Demon God","SS",R.drawable.diablo));
        models.add(new Model("Zegion","Mist Lord","S",R.drawable.zegion));
        models.add(new Model("Benimaru","Flare Lord","S",R.drawable.benimaru));
        models.add(new Model("Testarossa","Killer Lord","S",R.drawable.testarossa));
        models.add(new Model("Carrera","Manace Lord","S",R.drawable.carrera));
        models.add(new Model("Ultima","Pain Lord","S",R.drawable.ultima));
        models.add(new Model("Shion","War Lord","S",R.drawable.shion));
        models.add(new Model("Ranga","Star Lord","S",R.drawable.ranga));
        models.add(new Model("Kumara","Chimeric Lord","S",R.drawable.kumara));
        models.add(new Model("Adalman","Gehenna Lord","S",R.drawable.adalman));
        models.add(new Model("Gabiru","Dragon Lord","S",R.drawable.gabiru));
        models.add(new Model("Gerudo","Barier Lord","A+",R.drawable.gerudo));

        adapter.notifyDataSetChanged();
    }
}