package com.rizalfadiaalfikri.a05_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {
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

        String[] names = {
                "Diablo", "Zegion", "Benimaru", "Testarossa", "Carrera", "Ultima", "Shion", "Ranga", "Kumara", "Adalman", "Gabiru", "Gerudo",
        };

        viewPagerItems = new ArrayList<>();
        for(int i = 0; i < images.length; i++) {
            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i], names[i]);
            viewPagerItems.add(viewPagerItem);
        }

        VPAdapter adapter = new VPAdapter(viewPagerItems);
        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
    }
}