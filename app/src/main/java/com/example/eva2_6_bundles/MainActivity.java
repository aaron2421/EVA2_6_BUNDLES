package com.example.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nom, ape, age;
    RadioGroup rg;
    Intent int1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nombre);
        ape = findViewById(R.id.apellidos);
        age = findViewById(R.id.edad);
        rg = findViewById(R.id.rgs);
        int1 = new Intent(this, secundaria.class);
    }

    public void onClick(View v){
        Bundle bundle = new Bundle();
        bundle.putString("nombre", nom.getText().toString());
        bundle.putString("apellidos", ape.getText().toString());
        int edad = Integer.parseInt(age.getText().toString());
        bundle.putInt("edad", edad);

        int aux=0;
        if (rg.getCheckedRadioButtonId() == R.id.masc){
            aux = 0;
        } else if (rg.getCheckedRadioButtonId() == R.id.fem) {
            aux = 1;
        }
        bundle.putInt("sexo", aux);
        int1.putExtras(bundle);
        startActivity(int1);
    }
}
