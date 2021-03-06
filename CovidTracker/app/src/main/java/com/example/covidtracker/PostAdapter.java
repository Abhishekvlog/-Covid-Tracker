package com.example.covidtracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
    private List<ResponseModel> postModelList;
    public PostAdapter(List<ResponseModel> postModelList){
        this.postModelList = postModelList;
    }


    @Override
    public PostViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PostViewHolder holder, int position) {
        ResponseModel responseModel = postModelList.get(position);
        holder.setData(responseModel);
    }

    @Override
    public int getItemCount() {
        return postModelList.size();
    }
}
