package com.example.linked_itm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    Button btn1,btn2;
    public Fragment3(){


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);
        btn1=view.findViewById(R.id.btn_yes);
        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://pf.kakao.com/_ExlGid"));
                startActivity(i);
            }
        });
        btn2=view.findViewById(R.id.btn_cancel);
        return view;
    }
}
