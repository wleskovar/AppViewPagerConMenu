package com.example.appviewpagerconmenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;


/**
 * A simple {@link Fragment} subclass.
 */
public class CentroFragment extends Fragment implements PeliculaAdapter.InformarSeleccion{


    public CentroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_centro, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.listaRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), VERTICAL, false);


        recyclerView.setLayoutManager(layoutManager);
        List<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(new Pelicula("Batman","Accion",R.drawable.batman));
        peliculas.add(new Pelicula("Damages", "Drama", R.drawable.damages));
        peliculas.add(new Pelicula("Destroyer", "Drama", R.drawable.destroyer));
        peliculas.add(new Pelicula("El Juicio", "Drama", R.drawable.eljuicio));
        peliculas.add(new Pelicula("Inocente", "Drama", R.drawable.inocente));
        peliculas.add(new Pelicula("Intern", "Drama", R.drawable.intern));
        peliculas.add(new Pelicula("Jhon Wick 2", "Accion", R.drawable.johnwick2));
        peliculas.add(new Pelicula("King Kong", "Accion", R.drawable.kong));
        peliculas.add(new Pelicula("La Boda de mi Amigo", "Comedia", R.drawable.labodademi));
        peliculas.add(new Pelicula("Prometo", "Drama", R.drawable.prometo));
        peliculas.add(new Pelicula("Second", "Drama", R.drawable.second));
        peliculas.add(new Pelicula("The Good Doctor", "Drama", R.drawable.thegoogdoctor));

        PeliculaAdapter peliculaAdapter = new PeliculaAdapter(peliculas, this);
        recyclerView.setAdapter(peliculaAdapter);


        return view;
    }

    @Override
    public void informarSeleccion(Pelicula pelicula) {
        Toast.makeText(getContext(), "Hicieron click en "+pelicula.getTituloPelicula(), Toast.LENGTH_SHORT).show();


    }
}

