package com.ugb.miprimeraplicacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tempVal;
    RadioGroup rgo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btncalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempVal = findViewById(R.id.txtNum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = findViewById(R.id.txtNum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());
                rgo = findViewById(R.id.rgOpciones);
                        switch (rgo.getCheckedRadioButtonId()){
                            case R.id.optSuma:
                                respuesta = num1+num2;
                                break;
                            case R.id.optResta:
                                respuesta = num1-num2:
                                break;
                                case R.id

                        }

                double respuesta = num1 + num2;
                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("respuesta: "+respuesta);

            }
        });

    }
}