package com.example.a20030004_novanramdanusaputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button BtnInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
 /*       BtnInput = findViewById(R.id.BtnInput);

        BtnInput.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
           }
       });*/
    }
}