package com.example.happybirthdaytoamber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

        int response = input(5);

    public int input (int test) {
        try {
            int[] myList = {1, 2, 3, 4};
         int response = myList[test];
        } catch (ArrayIndexOutOfBoundsException e) {
            Log.e("MYAPP", "ArrayIndexOutOfBoundsException", e);
        }
        return response;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}