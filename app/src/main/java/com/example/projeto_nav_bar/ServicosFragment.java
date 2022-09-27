package com.example.projeto_nav_bar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ServicosFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_servicos,container,false);
        ImageView botao = (ImageView) view.findViewById(R.id.imageView18);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RealizadosFragment proximo = new RealizadosFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao2 = (ImageView) view.findViewById(R.id.imageView23);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ServicoFragment proximo2 = new ServicoFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo2, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao3 = (ImageView) view.findViewById(R.id.imageView19);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ServicoFragment proximo3 = new ServicoFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo3, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao4 = (ImageView) view.findViewById(R.id.imageView20);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ServicoFragment proximo3 = new ServicoFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo3, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });




        return view;
    }
}
