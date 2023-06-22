package com.example.nabung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.nabung.models.Transaction;
import com.example.nabung.presenter.TransactionAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

//    BottomNavigationView bottomNavigationView;
    private ArrayList<Transaction> transactions;
    TransactionAdapter transactionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transactions = new ArrayList<>();
        ListView listView = findViewById(R.id.customlistcard);
        transactionAdapter = new TransactionAdapter(MainActivity.this, transactions);
        listView.setAdapter(transactionAdapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)  {

    }

//    private void BottomNavigation() {
//        bottomNavigationView.setSelectedItemId(R.id.februari);
//
//        bottomNavigationView.setOnItemSelectedListener(item -> {
//            switch (item.getItemId()) {
//                case R.id.januari:
//                    return true;
//                case R.id.februari:
//                    return true;
//                case R.id.maret:
//                    return true;
//                case R.id.april:
//                    return true;
//            }
//            return false;
//        });
//    }
}