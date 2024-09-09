package com.guercifzone.booksarchive.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import com.guercifzone.booksarchive.Activities.english.En_ChildrenBooks;
import com.guercifzone.booksarchive.Activities.english.En_CookingBooks;
import com.guercifzone.booksarchive.Activities.english.En_DictionariesLanguageBooks;
import com.guercifzone.booksarchive.Activities.english.En_EngineeringTechmologyBooks;
import com.guercifzone.booksarchive.Activities.english.En_FitnessBooks;
import com.guercifzone.booksarchive.Activities.english.En_HealthBooks;
import com.guercifzone.booksarchive.Activities.english.En_HistoryBooks;
import com.guercifzone.booksarchive.Activities.english.En_HumandeveBooks;
import com.guercifzone.booksarchive.Activities.english.En_ITBooks;
import com.guercifzone.booksarchive.Activities.english.En_NovelsBooks;
import com.guercifzone.booksarchive.Activities.english.En_ScienceBooks;
import com.guercifzone.booksarchive.Activities.english.En_TutarielBooks;
import com.guercifzone.booksarchive.Activities.english.En_religienBooks;
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
        //children books
        itemlist.add(new GridFeed("Children books", R.drawable.book));
        //cooking books
        itemlist.add(new GridFeed("Cooking books", R.drawable.book));
        //dictionary language books
        itemlist.add(new GridFeed("Dictionary Language books", R.drawable.book));
        //engineering technology books
        itemlist.add(new GridFeed("Engineering  Technology books", R.drawable.book));
        //fitness books
        itemlist.add(new GridFeed("Fitnees books", R.drawable.book));
        //health books
        itemlist.add(new GridFeed(" health books", R.drawable.book));
        //history books
        itemlist.add(new GridFeed("History books", R.drawable.book));
        //human devloping books
        itemlist.add(new GridFeed("Human devloing books", R.drawable.book));
        //it books
        itemlist.add(new GridFeed("It books", R.drawable.book));
        //novels books
        itemlist.add(new GridFeed(" novels books", R.drawable.book));
        //religien books
        itemlist.add(new GridFeed("religien books", R.drawable.book));
        //science books
        itemlist.add(new GridFeed("science books", R.drawable.book));
        //tutariel books
        itemlist.add(new GridFeed("tutariel books", R.drawable.book));

        GridView gridView = findViewById(R.id.griview_en);
        GrideviewAdapter adapter = new GrideviewAdapter(this,R.layout.gridview_listitem,itemlist);
        gridView.setAdapter(adapter);

gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
                case 0:
                    startActivity(new Intent(getApplicationContext(), En_ChildrenBooks.class));
                    break;
                case 1:
                    startActivity(new Intent(getApplicationContext(), En_CookingBooks.class));
                    break;
                case 2:
                    startActivity(new Intent(getApplicationContext(), En_DictionariesLanguageBooks.class));
                    break;
                case 3:
                    startActivity(new Intent(getApplicationContext(), En_EngineeringTechmologyBooks.class));
                    break;
                case 4:
                    startActivity(new Intent(getApplicationContext(), En_FitnessBooks.class));
                    break;
                case 5:
                    startActivity(new Intent(getApplicationContext(), En_HealthBooks.class));
                    break;
                case 6:
                    startActivity(new Intent(getApplicationContext(), En_HistoryBooks.class));
                    break;
                case 7:
                    startActivity(new Intent(getApplicationContext(), En_HumandeveBooks.class));
                    break;
                case 8:
                    startActivity(new Intent(getApplicationContext(), En_ITBooks.class));
                    break;
                case 9:
                    startActivity(new Intent(getApplicationContext(), En_NovelsBooks.class));
                    break;
                case 10:
                    startActivity(new Intent(getApplicationContext(), En_religienBooks.class));
                    break;
                case 11:
                    startActivity(new Intent(getApplicationContext(), En_ScienceBooks.class));
                    break;
                case 12:
                    startActivity(new Intent(getApplicationContext(), En_TutarielBooks.class));
                    break;

        }
    }
});
    }
}