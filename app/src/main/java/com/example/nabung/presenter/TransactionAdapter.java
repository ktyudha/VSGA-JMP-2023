package com.example.nabung.presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nabung.models.Transaction;
import com.example.nabung.R;

import java.util.ArrayList;
public class TransactionAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<Transaction> transactions;

    public TransactionAdapter(Context context, ArrayList<Transaction> transactions) {
        this.context = context;
        this.transactions = transactions;
    }

    @Override
    public int getCount() {
        return transactions.size();
    }

    @Override
    public Object getItem(int position) {
        return transactions.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       HolderView holderView;
       if (convertView == null) {
           convertView = LayoutInflater.from(context).inflate(R.layout.card_transaction, parent, false);
           holderView = new HolderView(convertView);
           convertView.setTag(holderView);
       } else {
           holderView = (HolderView) convertView.getTag();
       }

        Transaction transaction = transactions.get(position);
        holderView.dateTr.setText(transaction.getDateTransaction());
        holderView.nameTr.setText(transaction.getNameTransaction());
        holderView.nominalTr.setText(transaction.getNominalTransaction());
        return convertView;
    }

    private class HolderView {
        private final TextView dateTr;
        private final TextView nameTr;
        private final TextView nominalTr;

        public HolderView(View view) {
            dateTr = view.findViewById(R.id.date);
            nameTr = view.findViewById(R.id.name_tr);
            nominalTr = view.findViewById(R.id.nom_tr);
        }
    }
}
