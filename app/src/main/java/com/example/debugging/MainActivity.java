package com.example.debugging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private String text = "5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        Log.d("TAG", "Debug message"); // Debug
        Log.e("TAG", "Error message"); // Error
        Log.v("TAG", "Verbose message"); // Verbose
        Log.i("TAG", "Info message"); // Info
        Log.w("TAG", "Warning message"); // Warning

//        //Null
//        try {
//            textView = null;
//            textView.setText("Hello");
//        }catch (NullPointerException e){
//            Log.e("MainActivity", "NullPointerException occurred: "+e.getMessage());
//        }
//
//        //Class cast
//        try {
//            Object obj ="Hello";
//            Integer num = (Integer) obj;
//        }catch (ClassCastException e){
//            Log.e("MainActivity", "ClassCastException occurred: "+e.getMessage());
//        }
//
//        //Array
//        try {
//            int[] numbers = {1,2,3};
//            int fourth = numbers[3];
//        }catch (ArrayIndexOutOfBoundsException e){
//            Log.e("MainActivity", "ArrayIndexOutOfBoundsException: "+e.getMessage());
//        }

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Object obj ="Hello";
            Integer num = (Integer) obj;
                textView.setText(num);
            }
        });

    }
}