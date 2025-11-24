package com.example.controlesbasicos;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class Activity51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Ejercicio 5.1.1

        // setContentView(R.layout.activity_5_1);

        //Ejercicio 5.1.2

        /* setContentView(R.layout.activity_5_1);

        TextView tvContenido = findViewById(R.id.tvContenido);

        tvContenido.setText("Texto construido desde Java. \nTamaño 20dp, Italic y color Blue");
        tvContenido.setTextSize(20);
        tvContenido.setTypeface(null, Typeface.ITALIC);
        tvContenido.setTextColor(ContextCompat.getColor(this, R.color.custom_blue));
        */

        //Ejercicio 5.1.3

        /* setContentView(R.layout.activity_5_1);

        TextView tvContenido = findViewById(R.id.tvContenido);

        tvContenido.append("\n Texto añadido con Append desde Java");
        tvContenido.setTextColor(ContextCompat.getColor(this, R.color.custom_blue));
         */

        //Ejercicio 5.1.4

        /* setContentView(R.layout.activity_5_1);

        TextView tvContenido = findViewById(R.id.tvContenido);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.demo_coneriascript);

        tvContenido.setTypeface(typeface);
        */
    }


}
