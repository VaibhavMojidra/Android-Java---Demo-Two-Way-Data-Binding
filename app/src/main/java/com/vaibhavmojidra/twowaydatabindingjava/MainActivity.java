package com.vaibhavmojidra.twowaydatabindingjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.vaibhavmojidra.twowaydatabindingjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel= new ViewModelProvider(this).get(MyViewModel.class);
        binding.setMyViewModel(viewModel);
        binding.setLifecycleOwner(this);
    }
}