package com.example.acitivi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado1, textResultado2, textResultado3,textResultado4,textResultado5,textResultado6,textResultado7,textResultado8,textResultado9,textResultado10,textResultado11,textResultado12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias de TextViews desde el layout
        textResultado1 = findViewById(R.id.textView1);
        textResultado2 = findViewById(R.id.textView2);
        textResultado3 = findViewById(R.id.textView3);
        textResultado4 = findViewById(R.id.textView4);
        textResultado5 = findViewById(R.id.textView5);
        textResultado6 = findViewById(R.id.textView6);
        textResultado7 = findViewById(R.id.textView7);
        textResultado8 = findViewById(R.id.textView8);
        textResultado9 = findViewById(R.id.textView9);
        textResultado10 = findViewById(R.id.textView10);
        textResultado11 = findViewById(R.id.textView11);
        textResultado12 = findViewById(R.id.textView12);




        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Ejemplos de uso de los métodos sobrecargados de suma
        int resultadoSuma1 = calculadora.sumar(5, 48);
        int resultadoSuma2 = calculadora.sumar(20, 15, 56);
        int[] numerosSuma = {1, 2, 3, 48, 5};
        int resultadoSuma3 = calculadora.sumar(numerosSuma);

        // Ejemplos de uso de los métodos de resta
        int resultadoResta1 = calculadora.restar(10, 5); // Resta 10 - 5
        int resultadoResta2 = calculadora.restar(new int[]{20, 10, 5}); // Resta 20 - 10 - 5
        int resultadoResta3 = calculadora.restar(100,50);


        // ejemplos de uso en los metodos de multiplicacion

        int resultadoMultiplicacion1 = calculadora.multiplicar(10, 5);
        int resultadoMultiplicacion2 = calculadora.multiplicar(5, 7, 2);
        int resultadoMultiplicacion3 = calculadora.multiplicar(2, 3, 4, 5);


        // ejemplos de uso en los metodos de division


        double resultadoDivision1 = calculadora.dividir(10, 5);
        double resultadoDivision2 = calculadora.dividir(5, 7);
        double resultadoDivision3 = calculadora.dividir(2, 3);


        // Mostrar resultados en los TextViews
        textResultado1.setText("Resultado de la suma 1: " + resultadoSuma1);
        textResultado2.setText("Resultado de la suma 2: " + resultadoSuma2);
        textResultado3.setText("Resultado de la suma 3: " + resultadoSuma3);

        // resultados restas
        textResultado4.setText("Resultado de la resta 1: " + resultadoResta1);
        textResultado5.setText("Resultado de la resta 2: " + resultadoResta2);
         textResultado6.setText("Resultado de la resta 3: " + resultadoResta3 );

        // resultados de multiplicacion
        textResultado7.setText("Resultado de la multiplicación 1: " + resultadoMultiplicacion1);
        textResultado8.setText("Resultado de la multiplicación 2: " + resultadoMultiplicacion2);
        textResultado9.setText("Resultado de la multiplicación 3: " + resultadoMultiplicacion3);


        // resultados de la division

        textResultado10.setText("Resultado de la division 1: " + resultadoDivision1);
        textResultado11.setText("Resultado de la division 2: " + resultadoDivision2);
        textResultado12.setText("Resultado de la division 3: " + resultadoDivision3);
    }


    }

