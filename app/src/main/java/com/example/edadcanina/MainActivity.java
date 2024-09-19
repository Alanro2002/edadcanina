package com.example.edadcanina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edadint = findViewById(R.id.age_id);
        TextView resulttext = findViewById(R.id.result_text);
        Button button = findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadint.getText().toString();

                if (!edad.isEmpty()){
                int edadint = Integer.parseInt(edad);
                int resultado = edadint * 7;

                String resulString = "Si fueras perro tu edad seria " + resultado + " años";
                resulttext.setText(resulString);
                }
                else
                {

                }
            }
        });
    }
}