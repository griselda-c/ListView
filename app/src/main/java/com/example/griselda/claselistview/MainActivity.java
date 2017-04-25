package com.example.griselda.claselistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity {

    private List<Contacto> contactos;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lista_contactos);
        inicializarContactos();
        listView.setAdapter(new ContactoAdapter());

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Contacto contacto = (Contacto) listView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,"Nombre "+contacto.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void inicializarContactos() {
        contactos = new ArrayList<>();
        contactos.add(new Contacto(15324747,"Juan","Perez"));
        contactos.add(new Contacto(15897854,"Maria","Garcia"));
        contactos.add(new Contacto(15324747,"Mariano","Gonzales"));
        contactos.add(new Contacto(15897854,"Jorge","Bustos"));
        contactos.add(new Contacto(15324747,"Juan","Perez"));
        contactos.add(new Contacto(15897854,"Maria","Garcia"));
        contactos.add(new Contacto(15324747,"Juan","Perez"));
        contactos.add(new Contacto(15897854,"Maria","Garcia"));
        contactos.add(new Contacto(15324747,"Juan","Perez"));
        contactos.add(new Contacto(15897854,"Maria","Garcia"));contactos.add(new Contacto(15324747,"Juan","Perez"));
        contactos.add(new Contacto(15897854,"Maria","Garcia"));

    }


    class ContactoAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return contactos.size();
        }

        @Override
        public Contacto getItem(int i) {
            return contactos.get(i);
        }

        @Override
        public long getItemId(int i) {
            return getItem(i).getTelefono();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View raiz = LayoutInflater.from(MainActivity.this).inflate(R.layout.adapter_contacto, viewGroup, false);

            Contacto contacto = getItem(i);

            TextView nombre = (TextView) raiz.findViewById(R.id.nombre);
            TextView apellido = (TextView) raiz.findViewById(R.id.apellido);
            TextView telefono = (TextView) raiz.findViewById(R.id.telefono);

            nombre.setText(contacto.getNombre());
            apellido.setText(contacto.getApellido());
            telefono.setText(String.valueOf(contacto.getTelefono()));

            return raiz;


        }
    }
}
