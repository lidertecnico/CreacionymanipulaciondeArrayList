package unal.todosalau.ejemploarrays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear un ArrayList
        ArrayList<String> miArrayList = new ArrayList<>();

        // Agregar elementos al ArrayList
        miArrayList.add("Elemento 1");
        miArrayList.add("Elemento 2");
        miArrayList.add("Elemento 3");

        // Acceder a elementos del ArrayList
        Log.d(TAG, "Elemento en la posición 0: " + miArrayList.get(0));
        Log.d(TAG, "Elemento en la posición 1: " + miArrayList.get(1));
        Log.d(TAG, "Elemento en la posición 2: " + miArrayList.get(2));

        // Modificar elementos del ArrayList
        miArrayList.set(1, "Elemento modificado");
        Log.d(TAG, "Elemento en la posición 1 después de la modificación: " + miArrayList.get(1));

        // Eliminar elementos del ArrayList
        miArrayList.remove(0);
        Log.d(TAG, "Elemento en la posición 0 después de la eliminación: " + miArrayList.get(0));
    }
}
