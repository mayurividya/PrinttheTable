package com.example.printthetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input=editText.getText().toString();
                if(input.isEmpty()) {
                    Scanner sc=new Scanner(System.in);
                    int num=sc.nextInt();
                    for(int i=1;i<=10;i++){
                        Toast.makeText(MainActivity.this, "number+\"*\"+i+\"=\"+number*i", Toast.LENGTH_SHORT).show();
                    }
                }
                }


        });

    }
}