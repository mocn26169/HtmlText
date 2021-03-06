package com.example.hj.siderbar;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    public static Map<String,Integer> index_map=new HashMap<String, Integer>();
    AlphabetView view;
    AlertDialog alertDialog;
    TextView text;
    TextView group_text;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    boolean scrollToPosition=false;
    ArrayList<SortModel> list1=new ArrayList<SortModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        view=findViewById(R.id.alpha);
        text=findViewById(R.id.alert_text_main);
        view.setText(text);
        recyclerView=findViewById(R.id.recycler);
        group_text=findViewById(R.id.group_text_main);
        view.setOnClickListener(new AlphabetView.OnClickListener() {
            @Override
            public void onClick(String alpha) {
                Iterator<SortModel>iterator=list1.iterator();
                int i=0;
                SortModel sortModel=null;
                while(iterator.hasNext()){
                    sortModel=iterator.next();
                    if(sortModel.getName().equals(alpha)){
                        moveToPosition((LinearLayoutManager) recyclerView.getLayoutManager(),i);

                    }
                    i++;
                }
            }
        });
        SortModel sortModel=null;
        ArrayList<SortModel> list=new ArrayList<SortModel>();
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????");
        sortModel.setCode("?????????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("??????");
        sortModel.setCode("??????");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????1");
        sortModel.setCode("?????????1");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????2");
        sortModel.setCode("?????????2");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????3");
        sortModel.setCode("?????????3");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????4");
        sortModel.setCode("?????????4");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????5");
        sortModel.setCode("?????????5");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????6");
        sortModel.setCode("?????????6");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????7");
        sortModel.setCode("?????????7");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????8");
        sortModel.setCode("?????????8");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("?????????9");
        sortModel.setCode("?????????9");
        list.add(sortModel);
        list1= new PinyinUtils().getSortedListByAlpha(list);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter myAdapter=new MyAdapter(list1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }
    /*
    ??????????????????????????????????????????
     */
    public void moveToPosition(LinearLayoutManager manager, int n) {
        manager.scrollToPositionWithOffset(n, 0);
        manager.setStackFromEnd(true);
    }
}
