package com.example.tiendav1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button boton_tienda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton_tienda=findViewById(R.id.boton_tienda);
        boton_tienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Comp.class);
                startActivity(intent);
            }
        });
    }
}