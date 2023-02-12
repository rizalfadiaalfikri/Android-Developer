package com.rizalfadiaalfikri.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rizalfadiaalfikri.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Mahasiswa mahasiswa = new Mahasiswa("Rizal Fadia Al Fikri", "19402092");
        binding.setMahasiswa(mahasiswa);
    }
}