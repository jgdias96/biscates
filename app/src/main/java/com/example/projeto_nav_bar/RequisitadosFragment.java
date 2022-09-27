package com.example.projeto_nav_bar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RequisitadosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RequisitadosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RequisitadosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RequisitadosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RequisitadosFragment newInstance(String param1, String param2) {
        RequisitadosFragment fragment = new RequisitadosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_requisitados,container,false);
        ImageView botao = (ImageView) view.findViewById(R.id.imageView136);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FavoritosFragment proximo = new FavoritosFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao2 = (ImageView) view.findViewById(R.id.imageView138);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        ImageView botao3 = (ImageView) view.findViewById(R.id.imageView139);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        ImageView botao4 = (ImageView) view.findViewById(R.id.imageView140);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        ImageView botao5 = (ImageView) view.findViewById(R.id.imageView141);
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao6 = (ImageView) view.findViewById(R.id.imageView142);
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PerfilprofissionalFragment proximo = new PerfilprofissionalFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}