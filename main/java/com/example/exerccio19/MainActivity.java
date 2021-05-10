package com.example.exerccio19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text_numero;
    TextView txt_semanas, txt_dias, txt_horas;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_numero=findViewById(R.id.txt_Thoras);
        txt_semanas=findViewById(R.id.txt_semanas);
        txt_dias=findViewById(R.id.txt_dias);
        txt_horas=findViewById(R.id.txt_horas);
        calcular=findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Total_horas= Integer.parseInt(text_numero.getText().toString());

                int n_Semanas= Total_horas/24/7;
                txt_semanas.setText(n_Semanas + "Semanas");

                int n_Dias=(Total_horas % (24*7))/24;
                int n_Horas=(Total_horas % (24*7))%24;

                txt_dias.setText(n_Dias+ "dias");
                txt_horas.setText(n_Horas+ "horas");

            }
        });
    }


}