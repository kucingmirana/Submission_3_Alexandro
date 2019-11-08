package com.example.submission_3_alexandro;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ListViewHolder> {
    private ArrayList<Film> listFilm;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public FilmAdapter(ArrayList<Film> list) {
        this.listFilm = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_film, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView filmName, filmDetail, filmDuration, filmRilis;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo);
            filmDuration = itemView.findViewById(R.id.txt_duration);
            filmRilis = itemView.findViewById(R.id.txt_release);
            filmName = itemView.findViewById(R.id.txt_name);
            filmDetail = itemView.findViewById(R.id.txt_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Film data);
    }
}
