package com.example.gboo_.zodiaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText pass;
    Button button;
    String contra;
    String nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText3);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre=usuario.getText().toString();
                contra=pass.getText().toString();
                int Validador =0;

                Persona p1= new Persona("Gabo","1234");
                Persona p2= new Persona("Pedro","pedro");
                Persona p3= new Persona("Luis","luis");
                Persona p4= new Persona("Jose","jose");
                Persona p5= new Persona("Pochi","pochi");
                ArrayList <Persona> Personas = new ArrayList<>();
                Personas.add(p1);
                Personas.add(p2);
                Personas.add(p3);
                Personas.add(p4);
                Personas.add(p5);

                if (nombre.trim().equals("") && contra.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Campos vacios!!",Toast.LENGTH_SHORT).show();
                }
                else{
                    for (int i=0; i<Personas.size();i++){

                        if (Objects.equals(Personas.get(i).getName(), nombre)){
                            Toast.makeText(getApplicationContext(),"" + Personas.get(i).getName(),Toast.LENGTH_SHORT).show();
                            Validador=1;
                            if(Objects.equals(Personas.get(i).getPassword(), contra)){
                                Intent a= new Intent(MainActivity.this,Main2Activity.class);
                                a.putExtra("nombre",usuario.getText().toString());
                                startActivity(a);
                                Toast.makeText(getApplicationContext(),"Bienvenido" ,Toast.LENGTH_SHORT).show();
                                break;
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Tu clave es Incorrecta",Toast.LENGTH_SHORT).show();

                            }

                        }

                    }
                    if (Validador==0){
                        Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecta",Toast.LENGTH_SHORT).show();

                    }


                }


            }
        });
    }
}