package com.example.tugas_praktikum_mobile_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.FloatBuffer;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPahlawan;
    private ArrayList<PahlawanModel> listPahlawan       =   new ArrayList<>();
    private  Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPahlawan              =   findViewById(R.id.rv_heroes);
        rvPahlawan.setHasFixedSize(true);
        listPahlawan.addAll(PahlawanData.getListData());
        showRecyclerList();



//        share                   =   findViewById(R.id.btn_share);
//        share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent shareIntent      =   new Intent();
//                shareIntent.setAction(Intent.ACTION_DIAL);
//                startActivity(shareIntent);
//            }
//        });

    }

    private void showRecyclerList() {
        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter         =   new PahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(listPahlawan);
        rvPahlawan.setAdapter(pahlawanAdapter);
    }


}
