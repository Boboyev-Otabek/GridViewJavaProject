package com.example.gridviewjavaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gridviewjavaproject.adapter.AdapterMember;
import com.example.gridviewjavaproject.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    void initView() {

        recyclerview=findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new GridLayoutManager(this, 3));

        List<Member> members=MemberAdd();

        refreshAdapter(members);

    }
    void refreshAdapter(List<Member> members){
        AdapterMember  adapterMember=new AdapterMember(members);
        recyclerview.setAdapter(adapterMember);
    }

    List<Member> MemberAdd(){
        List<Member> members=new ArrayList<>();

        for (int i=0 ; i<21; i++){
            members.add(new Member("Otabek "+i , "Boboyev "+i));
        }
        return members;

    }

}