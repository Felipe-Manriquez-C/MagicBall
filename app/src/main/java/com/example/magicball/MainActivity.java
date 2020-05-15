package com.example.magicball;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ballI;
    private TextView respuesta;

    private String[] respuestaArray ={"Solo no puedes, con amigos sí", "Dile al coco que piense un poco", "Puede confiar en él", "El error no importa, siempre y cuando sepas corregirlo",
            "Cuanto más grande la dificultad, mayor la gloria", "No son tus años de vida lo que cuenta, sino la vida en tus años", "Tener éxito no es aleatorio, es una variable dependiente del esfuerzo.",
            "Levántate, suspira, sonríe, y sigue adelante", "¡Nunca te acostarás sin saber una cosa más!", "Si te caes diez veces levántate once", "Si quieres darlo todo en esta vida, piensa en positivo.",
            "Todo lo que puedas imaginar es real", "Deja que el mundo te sorprenda", "Eres suficiente tal y como eres", " Las cosas más simples pueden traer la mayor felicidad",
            "Si el plan no funciona, cambia el plan, pero no cambies la meta", "No sueñes tu vida, vive tu sueño", "Tienes que esperar cosas de ti mismo antes de poder hacerlas",
            "La preocupación nos debería llevar a la acción y no a la depresión", "Sólo una cosa vuelve un sueño imposible: el miedo a fracasar"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballI = findViewById(R.id.boton);
        respuesta = findViewById(R.id.respuesta);

        ballI.setOnClickListener((View.OnClickListener) this);

        Toast.makeText(MainActivity.this, "Consejero", Toast.LENGTH_SHORT).show();
    }



    @Override
        public void onClick(View v){

            switch (v.getId()){
                case R.id.boton:
                    int ramdom = new Random().nextInt(respuestaArray.length);
                    respuesta.setText(respuestaArray[ramdom]);

                    break;
            }

        }
}
