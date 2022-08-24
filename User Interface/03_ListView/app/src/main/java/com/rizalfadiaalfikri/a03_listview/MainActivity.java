package com.rizalfadiaalfikri.a03_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.rizalfadiaalfikri.a03_listview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {
                R.drawable.diablo,
                R.drawable.zegion,
                R.drawable.benimaru,
                R.drawable.testarossa,
                R.drawable.carrera,
                R.drawable.ultima,
                R.drawable.shion,
                R.drawable.ranga,
                R.drawable.kumara,
                R.drawable.adalman,
                R.drawable.gabiru,
                R.drawable.gerudo,
        };

        String[] name = {
                "Diablo",
                "Zegion",
                "Benimaru",
                "Testarossa",
                "Carrera",
                "Ultima",
                "Shion",
                "Ranga",
                "Kumara",
                "Adalman",
                "Gabiru",
                "Gerudo",
        };

        String[] title = {
                "Demon Lord",
                "Mist Lord",
                "Flare Lord",
                "Killer Lord",
                "Manace Lord",
                "Pain Lord",
                "War Lord",
                "Star Lord",
                "Chimeric Lord",
                "Gehenna Lord",
                "Dragon Lord",
                "Barrier Lord",
        };

        String[] rank = {"SS","S","S","S","S","S","S","S","S","S","S","A+",};

        ArrayList<User> userArrayList = new ArrayList<>();

        for (int i=0; i < imageId.length; i++) {
            User user = new User(name[i], title[i], rank[i], imageId[i]);
            userArrayList.add(user);
        }

        Adapter adapter = new Adapter(MainActivity.this, userArrayList);
        binding.listView.setAdapter(adapter);
        binding.listView.setClickable(true);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, name[i].toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}