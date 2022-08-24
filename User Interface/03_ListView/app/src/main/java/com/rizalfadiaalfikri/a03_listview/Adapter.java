package com.rizalfadiaalfikri.a03_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<User> {
    public Adapter(@NonNull Context context, ArrayList<User> userList) {
        super(context, R.layout.list_item, userList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.name);
        TextView title = convertView.findViewById(R.id.title);
        TextView rank = convertView.findViewById(R.id.rank);

        imageView.setImageResource(user.image);
        name.setText(user.name);
        title.setText(user.title);
        rank.setText(user.rank);

        return convertView;
    }
}
