package com.example.a15128015.myapplication;

import android.hardware.Camera;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = (Button) findViewById(R.id.camera);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = (ImageView) findViewById( R.id.image);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivity(intent);

                String arquivo = Environment.getExternalStorageDirectory() + "/" + System.currentTimeMillis() + ".jpg";

                File file = new File(arquivo);
                Uri outputFileUri = Uri.fromFile(file);

                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
            }
        });
    }
}
