package com.udacity.stockhawk.ui;

import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udacity.stockhawk.R;

public class StockDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_detail);
        if(savedInstanceState == null){
            Bundle arguments=new Bundle();
            arguments.putParcelable(StockDetailFragment.DETAIL_URI,getIntent().getData());
            StockDetailFragment fragment= new StockDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().
                    add(R.id.stock_detail_container,fragment).commit();
        }
    }
}
