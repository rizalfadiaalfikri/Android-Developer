package com.rizalfadiaalfikri.a05_viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class VPAdapter extends RecyclerView.Adapter<VPAdapter.MyViewHolder> {

    ArrayList<ViewPagerItem> viewPagerItems = new ArrayList<>();

    public VPAdapter(ArrayList<ViewPagerItem> viewPagerItems) {
        this.viewPagerItems = viewPagerItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ViewPagerItem viewPagerItem = viewPagerItems.get(position);

        holder.imageView.setImageResource(viewPagerItem.imageId);
        holder.name.setText(viewPagerItem.name);
    }

    @Override
    public int getItemCount() {
        return viewPagerItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.txt_name);
        }
    }
}
