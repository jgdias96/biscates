package com.example.projeto_nav_bar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerfilsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilsFragment newInstance(String param1, String param2) {
        PerfilsFragment fragment = new PerfilsFragment();
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

        ImageView botao2 = (ImageView) view.findViewById(R.id.imageView45);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment proximo = new HomeFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, proximo, "lastFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        /*// ++++++++++++++++++NAO CONSIGO DAR RETURN DESTA VIEW (AJUDA)+++++++++++++++++++
        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);

        Intent intent = new Intent(getActivity(), EmailActivity.class);
        ImageView button = (ImageView) rootView.findViewById(R.id.imageView132);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });*/


        return view;
    }
}