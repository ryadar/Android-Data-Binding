package com.example.ryadar.android_data_binding;

import android.arch.lifecycle.ViewModel;

public class Student extends ViewModel {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String firstName;

    public Student(String firstName){
        this.firstName=firstName;
    }

}
