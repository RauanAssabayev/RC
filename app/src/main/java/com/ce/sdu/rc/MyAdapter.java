package com.ce.sdu.rc;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by rauan on 31.01.2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Message> list;
    public MyAdapter(List<Message> list) {
        this.list = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message message = list.get(position);
        holder.imgMsg.setImageResource(message.getResId());
        holder.txtMsg.setText(message.getMsg());
        holder.txtDesc.setText(message.getDesc());
        holder.text.setText(message.getDescId());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgMsg;
        TextView txtMsg;
        TextView txtDesc;
        TextView text;
        CardView cv;
        public ViewHolder(View itemView){
            super(itemView);
            imgMsg = (ImageView) itemView.findViewById(R.id.imgMsg);
            txtMsg = (TextView) itemView.findViewById(R.id.txtMesg);
            txtDesc = (TextView) itemView.findViewById(R.id.txtDesc);
            text = (TextView) itemView.findViewById(R.id.text);
            cv = (CardView) itemView.findViewById(R.id.cv);
        }
    }
}