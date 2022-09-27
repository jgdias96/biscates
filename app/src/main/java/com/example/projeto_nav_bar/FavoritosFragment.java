package com.example.projeto_nav_bar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FavoritosFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_favoritos,container,false);
        ImageView botao = (ImageView) view.findViewById(R.id.imageView22);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao2 = (ImageView) view.findViewById(R.id.imageView24);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo2 = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo2, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao3 = (ImageView) view.findViewById(R.id.imageView25);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo3 = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo3, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao4 = (ImageView) view.findViewById(R.id.imageView26);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo4 = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo4, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao5 = (ImageView) view.findViewById(R.id.imageView27);
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo5 = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo5, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao6 = (ImageView) view.findViewById(R.id.imageView21);
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RequisitadosFragment proximo6 = new RequisitadosFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo6, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
