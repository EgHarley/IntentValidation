package com.project.intentandvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView viewId;
    TextView viewName;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.button);
        viewId = findViewById(R.id.viewId);
        viewName = findViewById(R.id.viewName);
        imageView = findViewById(R.id.imageView);


            Intent intents =getIntent();
        String id = getIntent().getStringExtra("NAME");
        String name = getIntent().getStringExtra("NAME");
        viewId.setText(id);
        viewName.setText(name);

        if(id.equals("mamitag.android")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.eg);
            viewId.setText(id = "20191091");
            viewName.setText(name = "Eg Harley Mamitag");
        }
        else if(id.equals("valdez.android")) {
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.deborah);
            viewId.setText(id = "20193478");
            viewName.setText(name = "Deborah Valdez");
        }
        else if(id.equals("ramos.android")) {
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.andrea);
            viewId.setText(id = "20190097");
            viewName.setText(name = "Andrea Ramos");
        }
        else if(id.equals("mabanglo.android")) {
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.monica);
            viewId.setText(id = "20194015");
            viewName.setText(name = "Monica Mabanglo");
        }





        }



    public void btnFunction (View view)
            {

                Intent exit = new Intent(this, MainActivity.class);
                startActivity(exit);
            }

}