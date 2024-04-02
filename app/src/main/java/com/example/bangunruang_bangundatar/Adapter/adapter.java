package com.example.bangunruang_bangundatar.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import com.example.bangunruang_bangundatar.R;
import com.example.bangunruang_bangundatar.ModelClass.moduleObject;


public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
        Context context;
        ArrayList<moduleObject> modelbangundatar;

        ItemClickListener mClickListener;

        public adapter(Context context, ArrayList<moduleObject> modelbangundatar) {
            this.context = context;
            this.modelbangundatar = modelbangundatar;
        }

        @NonNull
        @Override
        public adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.item, parent, false);
            return new adapter.MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull adapter.MyViewHolder holder, int position) {
            final moduleObject object = this.modelbangundatar.get(position);
            holder.tvBangunDatar.setText(object.getTitle());
            holder.tvRumus.setText(object.getRumus());
            Glide.with(holder.itemView.getContext()).load(object.getImage()).into(holder.ivBangunDatar);
        }

        @Override
        public int getItemCount() {
            return modelbangundatar.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


            ImageView ivBangunDatar;

            TextView tvBangunDatar;

            TextView tvRumus;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                ivBangunDatar = itemView.findViewById(R.id.ivItem);
                tvBangunDatar = itemView.findViewById(R.id.tvNamaObject);
                tvRumus = itemView.findViewById(R.id.tvRumus);

                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
            }
        }
             moduleObject getItem(int id) {return modelbangundatar.get(id);
        }
        public void setClickListener(ItemClickListener itemClickListener){
            this.mClickListener = itemClickListener;
        }
        public interface ItemClickListener{
            void onItemClick(View view,int position);
        }
        }


