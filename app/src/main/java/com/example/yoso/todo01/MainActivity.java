package com.example.yoso.todo01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import javax.sql.*;

public class MainActivity extends AppCompatActivity  {

    // Declarar las instancias de la lista y el adaptador:
    ListView lista;
    TareaArrayAdapter<Tarea> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Obtener programáticamente una referencia de la lista:
        lista = (ListView) findViewById(R.id.lista);

        // Inicializar el adaptador con la fuente de datos
        // adaptador = new TareaArrayAdapter<Tarea>(
        adaptador = new TareaArrayAdapter<Tarea>(this, DataSource.TAREAS);


        // Relacionando la lista con el adaptador
        lista.setAdapter(adaptador);

        // Estableciendo la escucha
        // La idead del Metodo es proyectar un aviso que nos informe en pantalla los datos
        // del elemento que se presionó.
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Tarea tareaActual = (Tarea) adaptador.getItem(position);
                String msg = "Elegiste la tarea:n"+tareaActual.getNombre()+"-"+tareaActual.getHora();
                Context context = getApplicationContext();
                CharSequence text = msg;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // Limpiar todos los elementos
            adaptador.clear();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }







}
