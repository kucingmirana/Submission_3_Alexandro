package com.example.submission_3_alexandro;


import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment {

    private RecyclerView rvFilm;
    private ArrayList<Film> list = new ArrayList<>();

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_film, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_film);
        rvFilm = recyclerView.findViewById(R.id.rv_film);
        rvFilm.setHasFixedSize(true);

        list.addAll(FilmData.getListData());
        showRecyclerList();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void showRecyclerList() {
        rvFilm.setLayoutManager(new LinearLayoutManager(getActivity()));
        FilmAdapter filmAdapter = new FilmAdapter(list);
        rvFilm.setAdapter(filmAdapter);

    }

}
