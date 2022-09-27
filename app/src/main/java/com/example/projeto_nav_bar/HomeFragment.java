package com.example.projeto_nav_bar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override

        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_home,container,false);
            ImageView botao = (ImageView) view.findViewById(R.id.canalizador_home);
            botao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        ProfissionaisFragment proximo = new ProfissionaisFragment();
                        getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, proximo, "lastFragment")
                                .addToBackStack(null)
                                .commit();
                }
            });



        ImageView botao2 = (ImageView) view.findViewById(R.id.imageView6);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo2 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo2, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao3 = (ImageView) view.findViewById(R.id.imageView7);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo3 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo3, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao4 = (ImageView) view.findViewById(R.id.imageView9);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo3 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo3, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        Intent intent = new Intent(getActivity(), PromocaoActivity.class);
        ImageView button = (ImageView) view.findViewById(R.id.imageView13);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        /*

            ++++++++++    IMAGEM PARA PROMOÇAO ++++++

        ImageView botao5 = (ImageView) view.findViewById(R.id.imageView13);
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo5 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo5, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });*/

        ImageView botao6 = (ImageView) view.findViewById(R.id.imageView11);
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo6 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo6, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao7 = (ImageView) view.findViewById(R.id.imageView12);
        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo7 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo7, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao8 = (ImageView) view.findViewById(R.id.imageView15);
        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo7 = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo7, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;


        }
    }

