package com.example.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<String> name = new MutableLiveData<>();

    public void setName(String item) {
        name.setValue(item);
    }

    public MutableLiveData<String> getName() {
        return name;
    }
}
