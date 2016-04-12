package com.example.yoso.todo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoso on 11/09/15.
 * clase estática que represente el ambiente de intercambio de datos entre el adaptador
 * y los objetos tipo Tarea:
 */
public class DataSource {

    static List TAREAS = new ArrayList<Tarea>();

    static {
        TAREAS.add(new Tarea("Trotar 30 minutos", "08:00",R.drawable.ic_health));
        TAREAS.add(new Tarea("Estudiar análisis técnico", "10:00",R.drawable.ic_money));
        TAREAS.add(new Tarea("Comer 4 rebanadas de manzana", "10:30",R.drawable.ic_health));
        TAREAS.add(new Tarea("Asistir al taller de programación gráfica", "15:45",R.drawable.ic_carreer));
        TAREAS.add(new Tarea("Consignarle a Marta", "18:00",R.drawable.ic_money));
    }


}
