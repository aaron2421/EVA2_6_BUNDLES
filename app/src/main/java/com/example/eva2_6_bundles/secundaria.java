package com.example.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secundaria extends AppCompatActivity {

    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtv = findViewById(R.id.recibido);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtv.append(bundle.getString("nombre") + "\n");
        txtv.append(bundle.getString("apellidos") + "\n");
        txtv.append(bundle.getInt("edad") + "\n");

        switch (bundle.getInt("sexo")){
            case 0:
                txtv.append("Masculino");
                break;
            case 1:
                txtv.append("Femenino");
                break;
        }
    }
}
