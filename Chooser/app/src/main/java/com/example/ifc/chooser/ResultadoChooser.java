package com.example.ifc.chooser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoChooser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_chooser);

        TextView mediaview = (TextView) findViewById(R.id.media);
        Intent notas = getIntent();
        Bundle bd = notas.getExtras();
        try {
            double n1 = Double.parseDouble(bd.getString("nota1"));
            double n2 = Double.parseDouble(bd.getString("nota2"));
            double n3 = Double.parseDouble(bd.getString("nota3"));
            int p1 = Integer.parseInt(bd.getString("peso1"));
            int p2 = Integer.parseInt(bd.getString("peso2"));
            int p3 = Integer.parseInt(bd.getString("peso3"));
            double media1 = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
            mediaview.setText("" + (media1));
        }catch(java.lang.NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Nota ou peso não informado", Toast.LENGTH_SHORT).show();
        }
    }
}
