package com.rizalfadiaalfikri.databinding;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<Mahasiswa> mahasiswaMutableLiveData = new MutableLiveData<>();

    public void updateNamaMahasiswa() {
        Mahasiswa mahasiswa = new Mahasiswa("Cid Kagenou", "19402091");
        mahasiswaMutableLiveData.setValue(mahasiswa);
    }

    public LiveData<Mahasiswa> getMahasiswaLiveData() {
        return mahasiswaMutableLiveData;
    }
}
