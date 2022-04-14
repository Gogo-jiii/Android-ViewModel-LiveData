package com.example.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<MyModelClass> model = new MutableLiveData<>();

    public void setModel(MyModelClass item) {
        model.setValue(item);
    }

    public MutableLiveData<MyModelClass> getModel() {
        return model;
    }

    void doTask(String name) {
        MyModelClass model = new MyModelClass();
        model.setName(name);
        setModel(model);
    }
}
