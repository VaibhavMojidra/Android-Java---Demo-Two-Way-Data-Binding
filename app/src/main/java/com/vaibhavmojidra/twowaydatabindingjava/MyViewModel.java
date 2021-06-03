package com.vaibhavmojidra.twowaydatabindingjava;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public MutableLiveData<String> text = new MutableLiveData("");

}
