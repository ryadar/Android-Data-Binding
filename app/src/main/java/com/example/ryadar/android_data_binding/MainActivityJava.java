package com.example.ryadar.android_data_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.ryadar.android_data_binding.databinding.ActivityMainBinding;

public class MainActivityJava extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=  DataBindingUtil.setContentView(this,R.layout.activity_main);
        Student student= new Student("Raja Shekar Ryada");
        student.setFirstName("Raja SHekar ryada");
        binding.setStudent(student);

    }
}
