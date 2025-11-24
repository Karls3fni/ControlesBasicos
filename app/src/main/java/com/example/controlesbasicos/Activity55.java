package com.example.controlesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity55 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroupNivel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_5);

        // Referencia del RadioGroup
        radioGroupNivel = findViewById(R.id.radioGroupDias);

        // Listener para este RadioGroup.
        // Como la clase implementa la interfaz, pasamos 'this' como el listener.
        radioGroupNivel.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        // RadioButton que fue seleccionado usando su ID
        RadioButton radioButtonSeleccionado = findViewById(checkedId);

        // Toast con el texto del RadioButton seleccionado
        Toast.makeText(this, "Selección cambiada a: " + radioButtonSeleccionado.getText(),
                Toast.LENGTH_SHORT).show();
    }

    public void confirmarSeleccion(View view) {
        // Obtenemos el ID del RadioButton seleccionado en el grupo
        int selectedId = radioGroupNivel.getCheckedRadioButtonId();

        // Verificamos si alguna opción ha sido seleccionada.
        // getCheckedRadioButtonId() devuelve -1 si no hay nada seleccionado.
        if (selectedId == -1) {
            Toast.makeText(this, "Por favor, selecciona un nivel de experiencia.",
                    Toast.LENGTH_LONG).show();
        } else {
            // Encontramos el RadioButton usando el ID que obtuvimos
            RadioButton radioButtonSeleccionado = findViewById(selectedId);
            String seleccion = radioButtonSeleccionado.getText().toString();

            // Mostramos un mensaje de confirmación
            Toast.makeText(this, "Nivel confirmado: " + seleccion, Toast.LENGTH_LONG).show();
        }
    }

}
