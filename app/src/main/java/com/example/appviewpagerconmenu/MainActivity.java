package com.example.appviewpagerconmenu;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ContenedorFragment contenedorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedorFragment = new ContenedorFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.add(R.id.contenedorFragment, contenedorFragment);
        unfragmentTransaction.commit();


    }
}
