package com.example.junior.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText peso1;
    private EditText peso2;
    private EditText peso3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View b){
        Intent result = new Intent(MainActivity.this,Resultado.class);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        peso1 = (EditText) findViewById(R.id.peso1);
        peso2 = (EditText) findViewById(R.id.peso2);
        peso3 = (EditText) findViewById(R.id.peso3);
        String n1 = this.nota1.getText().toString();
        String n2 = this.nota2.getText().toString();
        String n3 = this.nota3.getText().toString();
        String p1 = this.peso1.getText().toString();
        String p2 = this.peso2.getText().toString();
        String p3 = this.peso3.getText().toString();
        result.putExtra("nota1",n1);
        result.putExtra("nota2",n2);
        result.putExtra("nota3",n3);
        result.putExtra("peso1",p1);
        result.putExtra("peso2",p2);
        result.putExtra("peso3",p3);
        startActivity(result);

    }
}
