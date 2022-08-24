package com.rizalfadiaalfikri.a08_glidelibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    ArrayList<Model> myList = new ArrayList<>();

    public Adapter(Context context, ArrayList<Model> myList) {
        this.context = context;
        this.myList = myList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(myList.get(position).name);
        holder.title.setText(myList.get(position).title);
        holder.rank.setText(myList.get(position).rank);

        Glide.with(holder.imageView.getContext())
                .load(myList.get(position).image)
                .apply(new RequestOptions().centerCrop())
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, title, rank;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txt_name);
            title = itemView.findViewById(R.id.txt_title);
            rank = itemView.findViewById(R.id.txt_rank);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
