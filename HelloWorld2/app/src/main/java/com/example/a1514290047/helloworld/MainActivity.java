package com.example.a1514290047.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarMensagem(View parametro){
        Toast.makeText(this, "Teste de texto no toast", Toast.LENGTH_LONG).show();
    }
}
