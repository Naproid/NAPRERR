package com.example.n01202455.cardview.SearchState;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.example.n01202455.cardview.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<Statement> statements;

    public Adapter(Context ctx, List<Statement> statements){
        this.inflater = LayoutInflater.from(ctx);
        this.statements = statements;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.stateAPP_STATUS.setText(statements.get(position).getAPP_STATUS());
        holder.stateREG_NUMBER.setText(statements.get(position).getREG_NUMBER());
        holder.stateAPP_REG_DATE.setText(statements.get(position).getAPP_REG_DATE());
        holder.stateFULL_TRANSACT.setText(statements.get(position).getFULL_TRANSACT());

    }

    @Override
    public int getItemCount() {
        return statements.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView stateAPP_STATUS, stateREG_NUMBER, stateAPP_REG_DATE, stateFULL_TRANSACT;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            stateAPP_STATUS = itemView.findViewById(R.id.stateAPP_STATUS);
            stateREG_NUMBER = itemView.findViewById(R.id.stateREG_NUMBER);
            stateAPP_REG_DATE = itemView.findViewById(R.id.stateAPP_REG_DATE);
            stateFULL_TRANSACT = itemView.findViewById(R.id.stateFULL_TRANSACT);

            itemView.setOnClickListener(v ->

                    Toast.makeText(v.getContext(), "It will open PDF", Toast.LENGTH_SHORT).show());
        }


    }
}