package com.example.fragmentdinamico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentUno fragmentUno;
    FragmentDos fragmentDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentUno = new FragmentUno();
        fragmentDos = new FragmentDos();

        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor, fragmentUno).commit();
    }

    public void onClick(View view){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch(view.getId()){
            case R.id.btnFragmentUno:
                transaction.replace(R.id.frlContenedor, fragmentUno);
                transaction.addToBackStack(null);
                break;
            case R.id.btnFragmentDos:
                transaction.replace(R.id.frlContenedor, fragmentDos);
                transaction.addToBackStack(null);
                break;
        }
        transaction.commit();
    }
}