package com.example.ifc.aula_1306;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bota = (Button) findViewById(R.id.button);
        bota.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                EditText text = (EditText) findViewById(R.id.nome);
                String tex = text.getText().toString();
                SharedPreferences sharedPref = getSharedPreferences("nome",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(getString(R.string.palavra),tex);
                editor.commit();

                SharedPreferences sf = getSharedPreferences("nome", Context.MODE_PRIVATE);
                String name = sf.getString(getString(R.string.palavra)," ");
                TextView re = (TextView) findViewById(R.id.resultado);
                re.setText(name);
            }
        });
    }
    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences sf = getSharedPreferences("nome",Context.MODE_PRIVATE);
        String name = sf.getString(getString(R.string.palavra), "");
        TextView re = (TextView) findViewById(R.id.resultado);
        re.setText(name);
    }
}
