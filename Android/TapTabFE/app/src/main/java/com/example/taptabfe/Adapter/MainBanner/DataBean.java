package com.example.taptabfe.Adapter.MainBanner;

import com.example.taptabfe.R;

import java.util.ArrayList;
import java.util.List;

public class DataBean {

    public Integer imageRes;

    public DataBean(Integer imageRes){
        this.imageRes = imageRes;
    }

    public static List<DataBean> getTestData(){
        List<DataBean> list = new ArrayList<>();
        list.add(new DataBean(R.drawable.notice1));
        list.add(new DataBean(R.drawable.notice2));
        list.add(new DataBean(R.drawable.notice3));
        return list;
    }

}
