package com.rizalfadiaalfikri.a08_glidelibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Model> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(getApplicationContext(), myList);
        addData();
        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        myList.add(new Model("Diablo","Demon God","SS",R.drawable.diablo));
        myList.add(new Model("Zegion","Mist Lord","S",R.drawable.zegion));
        myList.add(new Model("Benimaru","Flare Lord","S",R.drawable.benimaru));
        myList.add(new Model("Testarossa","Killer Lord","S",R.drawable.testarossa));
        myList.add(new Model("Carrera","Manace Lord","S",R.drawable.carrera));
        myList.add(new Model("Ultima","Pain Lord","S",R.drawable.ultima));
        myList.add(new Model("Shion","War Lord","S",R.drawable.shion));
        myList.add(new Model("Ranga","Star Lord","S",R.drawable.ranga));
        myList.add(new Model("Kumara","Chimeric Lord","S",R.drawable.kumara));
        myList.add(new Model("Adalman","Gehenna Lord","S",R.drawable.adalman));
        myList.add(new Model("Gabiru","Dragon Lord","S",R.drawable.gabiru));
        myList.add(new Model("Gerudo","Barier Lord","A+",R.drawable.gerudo));

        adapter.notifyDataSetChanged();
    }
}