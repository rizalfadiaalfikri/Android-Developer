package com.rizalfadiaalfikri.a02_viewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int pushup = 0;

    public void doPushup() {
        this.pushup = this.pushup + 1;
    }

    public int getPushup() {
        return this.pushup;
    }

}
