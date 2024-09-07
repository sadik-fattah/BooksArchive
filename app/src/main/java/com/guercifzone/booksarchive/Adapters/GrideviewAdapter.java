package com.guercifzone.booksarchive.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.guercifzone.booksarchive.Models.GridFeed;
import com.guercifzone.booksarchive.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;


public class GrideviewAdapter extends ArrayAdapter<GridFeed> {
List<GridFeed> feedList;
int custom_id;
    public GrideviewAdapter(@NonNull @NotNull Context context, int resource, @NonNull List<GridFeed> objects) {
        super(context, resource, objects);
        this.feedList = objects ;
        this.custom_id = resource;

    }
public int getCount() {
        return feedList.size();
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View v = convertView;
      if (v == null){
          LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          v = inflater.inflate(custom_id, null);
      }
        ImageView imageView = v.findViewById(R.id.selectedImage);
        TextView textView = v.findViewById(R.id.selectedtext);
        GridFeed feed = feedList.get(position);
        imageView.setImageResource(feed.getImage_id());
        textView.setText(feed.getTitle());
      return v;
    }
}
