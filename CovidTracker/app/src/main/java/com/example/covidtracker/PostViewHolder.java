package com.example.covidtracker;

import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvDate;
    private TextView mtvPositive;
    private TextView mtvNegative;
    private TextView mtvHospitalizedCurrently;
    private TextView mtvOnVentilatorCurrently;
    private TextView mtvDeath;
    private TextView mtvDateChecked;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvDate=itemView.findViewById(R.id.tvdate);
        mtvPositive = itemView.findViewById(R.id.tvpositive);
        mtvNegative =itemView.findViewById(R.id.tvnegative);
        mtvHospitalizedCurrently =itemView.findViewById(R.id.tvhospitalizedCurrently);
        mtvOnVentilatorCurrently = itemView.findViewById(R.id.tvonVentilatorCurrently);
        mtvDeath = itemView.findViewById(R.id.tvdeath);
        mtvDateChecked =itemView.findViewById(R.id.tvdateChecked);
    }
    public void setData(ResponseModel responseModel){
        mtvDate.setText(responseModel.getDate());
        mtvPositive.setText(responseModel.getPositive());
        mtvNegative.setText(responseModel.getNegative());
        mtvHospitalizedCurrently.setText(responseModel.getHospitalizedCurrently());
        mtvOnVentilatorCurrently.setText(responseModel.getOnVentilatorCurrently());
        mtvDeath.setText(responseModel.getDeath());
        mtvDateChecked.setText(responseModel.getDateChecked());
    }
}