package com.example.projeto_nav_bar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ChatsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChatsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChatsFragment newInstance(String param1, String param2) {
        ChatsFragment fragment = new ChatsFragment();
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
        View view = inflater.inflate(R.layout.fragment_chats,container,false);
        //fragment para activity
        View rootView = inflater.inflate(R.layout.fragment_chats, container, false);

        Intent intent = new Intent(getActivity(), ChatActivity.class);
        ImageView button = (ImageView) rootView.findViewById(R.id.imageView132);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Intent intent2 = new Intent(getActivity(), ChatActivity.class);
        ImageView button2 = (ImageView) rootView.findViewById(R.id.imageView);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
        Intent intent3 = new Intent(getActivity(), ChatActivity.class);
        ImageView button3 = (ImageView) rootView.findViewById(R.id.imageView888);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent3);
            }
        });
        Intent intent4 = new Intent(getActivity(), ChatActivity.class);
        ImageView button4 = (ImageView) rootView.findViewById(R.id.imageView887);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent4);
            }
        });




        return rootView;
    }
}