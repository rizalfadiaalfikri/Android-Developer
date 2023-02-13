package com.rizalfadiaalfikri.livedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    // Data
    private MutableLiveData<Integer> pushUpCount = new MutableLiveData<>();
    private Integer initialPushUp = 0;

    // Event
    public void onPushUpCount() {
        initialPushUp = initialPushUp + 1;
        pushUpCount.setValue(initialPushUp);
    }
    // Event
    public void startCount() {
        pushUpCount.setValue(initialPushUp);
    }
    // Getter
    public LiveData<Integer> getPushUpCount() {
        return pushUpCount;
    }
}
