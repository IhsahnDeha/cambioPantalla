package com.example.cambiopantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button irANostros = findViewById(R.id.irANosotros);
        irANostros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MainActivity.this,
                        NosotrosActivity.class);
                startActivity(o);
            }
        });
        Button btnProductos = findViewById(R.id.btnProductos);
        btnProductos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MainActivity.this,
                        ProductosListaActivity.class);
                startActivity(o);

            }
        });
    }
}
