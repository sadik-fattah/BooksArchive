package com.guercifzone.booksarchive.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.number.ScientificNotation;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.guercifzone.booksarchive.Activities.Arabic.Ar_ChildrenBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_CookingBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_DictionariesLanguagesBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_EngineeringTechnologyBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_FitnessBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_HealthBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_HistoryBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_HumandeveBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_ITBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_NovelsBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_ReligienBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_ScienceBooks;
import com.guercifzone.booksarchive.Activities.Arabic.Ar_TutarielBooks;
import com.guercifzone.booksarchive.Adapters.GrideviewAdapter;
import com.guercifzone.booksarchive.Models.GridFeed;
import com.guercifzone.booksarchive.R;

import java.util.ArrayList;
import java.util.List;

public class Arabic_Books extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.arabic_books);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        List<GridFeed> itemlist = new ArrayList<>();
        //children books
        itemlist.add(new GridFeed("كتب للأطفال", R.drawable.book));
        //cooking books
        itemlist.add(new GridFeed("كتب الطبخ", R.drawable.book));
        //dictionary language books
        itemlist.add(new GridFeed("كتب ترجمة ولغات",R.drawable.book));
        //engineering technology books
        itemlist.add(new GridFeed("كتب هندسة تكنولوجيا", R.drawable.book));
        //fitnees books
        itemlist.add(new GridFeed("كتب الرياضة", R.drawable.book));
        //health books
        itemlist.add(new GridFeed("كتب الصحة", R.drawable.book));
        //history books
        itemlist.add(new GridFeed("كتب  التاريخ", R.drawable.book));
        //human devloing books
        itemlist.add(new GridFeed("كتب التنمية البشرية", R.drawable.book));
        //it books
        itemlist.add(new GridFeed("كتب  علوم الحاسوب", R.drawable.book));
        //novels books
        itemlist.add(new GridFeed("كتب  روايات وادب عربي", R.drawable.book));
        //religien books
        itemlist.add(new GridFeed("كتب دينية", R.drawable.book));
        //science books
        itemlist.add(new GridFeed("كتب علمية", R.drawable.book));
        //tutariel books
        itemlist.add(new GridFeed("كتب  تعليمية", R.drawable.book));





        GridView gridView = findViewById(R.id.griview_ar);
        GrideviewAdapter adapter = new GrideviewAdapter(this,R.layout.gridview_listitem,itemlist);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                        case 0:
                        startActivity(new Intent(getApplicationContext(), Ar_ChildrenBooks.class));
                        break;
                        case 1:
                        startActivity(new Intent(getApplicationContext(), Ar_CookingBooks.class));
                        break;
                        case 2:
                        startActivity(new Intent(getApplicationContext(), Ar_DictionariesLanguagesBooks.class));
                        break;
                        case 3:
                        startActivity(new Intent(getApplicationContext(), Ar_EngineeringTechnologyBooks.class));
                        break;
                        case 4:
                        startActivity(new Intent(getApplicationContext(), Ar_FitnessBooks.class));
                        break;
                        case 5:
                        startActivity(new Intent(getApplicationContext(), Ar_HealthBooks.class));
                        break;
                        case 6:
                        startActivity(new Intent(getApplicationContext(), Ar_HistoryBooks.class));
                        break;
                        case 7:
                        startActivity(new Intent(getApplicationContext(), Ar_HumandeveBooks.class));
                        break;
                        case 8:
                        startActivity(new Intent(getApplicationContext(), Ar_ITBooks.class));
                        break;
                        case 9:
                        startActivity(new Intent(getApplicationContext(), Ar_NovelsBooks.class));
                        break;
                        case 10:
                        startActivity(new Intent(getApplicationContext(), Ar_ReligienBooks.class));
                        break;
                        case 11:
                        startActivity(new Intent(getApplicationContext(), Ar_ScienceBooks.class));
                        break;
                        case 12:
                        startActivity(new Intent(getApplicationContext(), Ar_TutarielBooks.class));
                        break;
                }
            }
        });
    }
}