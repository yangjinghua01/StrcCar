package com.rgsc.iot.mibanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.my_recy_view);
        list = new ArrayList<>();
        list.add(R.color.teal_700);
        list.add(R.color.purple_500);
        list.add(R.color.teal_200);
        list.add(R.color.black);
        list.add(R.color.purple_700);
        list.add(R.color.purple_200);
        //这里需要划重点，上图中是第一项在最下方，如果需要在最上方只能倒叙并翻转RecyclerView若需要的话
        //请将LinearLayoutManager第三个参数改为true并且setStackFromEnd也为true
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager.setStackFromEnd(false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new MyRecyViewAdapter(MainActivity.this,list));
    }
}