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

public class PerfilFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil,container,false);
        ImageView botao = (ImageView) view.findViewById(R.id.imageView33);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ChatsFragment proximo = new ChatsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });



        /*// ++++++++++++++++++NAO CONSIGO DAR RETURN DESTA VIEW (AJUDA)+++++++++++++++++++*/

        Intent intent = new Intent(getActivity(), EmailActivity.class);
        ImageView button = (ImageView) view.findViewById(R.id.imageView39);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        Intent intent2 = new Intent(getActivity(), SenhaActivity.class);
        ImageView button2 = (ImageView) view.findViewById(R.id.imageView35);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

        Intent intent3 = new Intent(getActivity(), MoradaActivity.class);
        ImageView button3 = (ImageView) view.findViewById(R.id.imageView38);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent3);
            }
        });

        Intent intent4 = new Intent(getActivity(), PagamentoActivity.class);
        ImageView button4 = (ImageView) view.findViewById(R.id.imageView36);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent4);
            }
        });
        Intent intent5 = new Intent(getActivity(), IntroActivity.class);
        ImageView button5 = (ImageView) view.findViewById(R.id.imageView45);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent5);
            }
        });
        Intent intent6 = new Intent(getActivity(), PromocaoActivity.class);
        ImageView button6 = (ImageView) view.findViewById(R.id.imageView43);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent6);
            }
        });





        return view;
    }

}

