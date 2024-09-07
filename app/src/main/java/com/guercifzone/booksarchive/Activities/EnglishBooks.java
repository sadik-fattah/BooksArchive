package com.guercifzone.booksarchive.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.guercifzone.booksarchive.Adapters.GrideviewAdapter;
import com.guercifzone.booksarchive.Models.GridFeed;
import com.guercifzone.booksarchive.R;

import java.util.ArrayList;
import java.util.List;

public class EnglishBooks extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.english_books);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        List<GridFeed> itemlist = new ArrayList<>();
        itemlist.add(new GridFeed("Children books", R.drawable.book));
        itemlist.add(new GridFeed("Cooking books", R.drawable.book));
        itemlist.add(new GridFeed("Dictionary Language books", R.drawable.book));
        itemlist.add(new GridFeed("Engineering  Technology books", R.drawable.book));
        itemlist.add(new GridFeed("Fitnees books", R.drawable.book));
        itemlist.add(new GridFeed(" health books", R.drawable.book));
        itemlist.add(new GridFeed("History books", R.drawable.book));
        itemlist.add(new GridFeed("Human devloing books", R.drawable.book));
        itemlist.add(new GridFeed("It books", R.drawable.book));
        itemlist.add(new GridFeed(" religien books", R.drawable.book));
        itemlist.add(new GridFeed("Science books", R.drawable.book));
        itemlist.add(new GridFeed("Tutariel books", R.drawable.book));

        GridView gridView = findViewById(R.id.griview_en);
        GrideviewAdapter adapter = new GrideviewAdapter(this,R.layout.gridview_listitem,itemlist);
        gridView.setAdapter(adapter);

gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:

        }
    }
});
    }
}