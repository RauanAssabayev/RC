package com.ce.sdu.rc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private List<Message> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        MyAdapter myAdapter = new MyAdapter(initData());
        recyclerView.setAdapter(myAdapter);
    }
    private List<Message> initData() {
        list = new ArrayList<>();
        list.add(new Message("Like","Very cool!",R.mipmap.ic_launcher,R.string.main_message));
        list.add(new Message("Like1","Very cool!",R.mipmap.ic_launcher,R.string.app_name));
        list.add(new Message("Like2","Very cool!",R.mipmap.ic_launcher,R.string.main_message));
        return list;
    }
}