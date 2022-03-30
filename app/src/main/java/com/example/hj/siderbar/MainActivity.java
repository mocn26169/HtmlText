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
        sortModel.setName("韩杰");
        sortModel.setCode("韩杰");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵高");
        sortModel.setCode("赵高");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("王五");
        sortModel.setCode("王五");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("里斯");
        sortModel.setCode("里斯");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("刘子");
        sortModel.setCode("刘子");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("尔雅");
        sortModel.setCode("尔雅");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("刘三");
        sortModel.setCode("刘三");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("刘强");
        sortModel.setCode("刘强");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("郝梦龄");
        sortModel.setCode("郝梦龄");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("汉三军");
        sortModel.setCode("汉三军");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("唐国强");
        sortModel.setCode("唐国强");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("唐三藏");
        sortModel.setCode("唐三藏");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("王军");
        sortModel.setCode("王军");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("网上三");
        sortModel.setCode("网上三");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("简化军");
        sortModel.setCode("简化军");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("成龙");
        sortModel.setCode("成龙");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("陈三强");
        sortModel.setCode("陈三强");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("丁龙");
        sortModel.setCode("丁龙");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙1");
        sortModel.setCode("赵子龙1");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙2");
        sortModel.setCode("赵子龙2");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙3");
        sortModel.setCode("赵子龙3");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙4");
        sortModel.setCode("赵子龙4");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙5");
        sortModel.setCode("赵子龙5");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙6");
        sortModel.setCode("赵子龙6");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙7");
        sortModel.setCode("赵子龙7");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙8");
        sortModel.setCode("赵子龙8");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙9");
        sortModel.setCode("赵子龙9");
        list.add(sortModel);
        list1= new PinyinUtils().getSortedListByAlpha(list);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter myAdapter=new MyAdapter(list1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }
    /*
    将指定的列表项置顶显示的方法
     */
    public void moveToPosition(LinearLayoutManager manager, int n) {
        manager.scrollToPositionWithOffset(n, 0);
        manager.setStackFromEnd(true);
    }
}
