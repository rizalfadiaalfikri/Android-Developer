package com.rizalfadiaalfikri.a06_gridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> list = new ArrayList<>();

    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new Adapter(list);
        addData();
        recyclerView.setAdapter(adapter);

    }

    private void addData() {

        list.add(new Model("Diablo", R.drawable.diablo));
        list.add(new Model("Zegion", R.drawable.zegion));
        list.add(new Model("Benimaru", R.drawable.benimaru));
        list.add(new Model("Testarossa", R.drawable.testarossa));
        list.add(new Model("Carrera", R.drawable.carrera));
        list.add(new Model("Ultima", R.drawable.ultima));
        list.add(new Model("Shion", R.drawable.shion));
        list.add(new Model("Ranga", R.drawable.ranga));
        list.add(new Model("Kumara", R.drawable.kumara));
        list.add(new Model("Adalman", R.drawable.adalman));
        list.add(new Model("Gabiru", R.drawable.gabiru));
        list.add(new Model("Gerudo", R.drawable.gerudo));

        adapter.notifyDataSetChanged();
    }
}