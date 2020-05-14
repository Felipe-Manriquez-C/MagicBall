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

    private String[] respuestaArray ={"Solo no puedes, con amigos sí", "Definitivamente es así", "Dile al coco que piense un poco", "Sí definitivamente", "Puede confiar en él",
            "Como yo lo veo, sí", "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Levántate, suspira, sonríe, y sigue adelante", "No cuentes con eso", "¡Nunca te acostarás sin saber una cosa más!",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso", "Deja que el mundo te sorprenda", "Eres suficiente tal y como eres",
            "Si el plan no funciona, cambia el plan, pero no cambies la meta", "No sueñes tu vida, vive tu sueño"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballI = findViewById(R.id.boton);
        respuesta = findViewById(R.id.respuesta);

        ballI.setOnClickListener((View.OnClickListener) this);

        Toast.makeText(MainActivity.this, "Buscando tu destino", Toast.LENGTH_SHORT).show();
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
