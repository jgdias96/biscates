package com.example.projeto_nav_bar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContratarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContratarFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContratarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContratarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContratarFragment newInstance(String param1, String param2) {
        ContratarFragment fragment = new ContratarFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contratar,container,false);
        ImageView botao = (ImageView) view.findViewById(R.id.imageView160);
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

        ImageView botao2 = (ImageView) view.findViewById(R.id.imageView185);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfissionaisFragment proximo = new ProfissionaisFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView botao3 = (ImageView) view.findViewById(R.id.imageView186);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ServicoFragment proximo = new ServicoFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}