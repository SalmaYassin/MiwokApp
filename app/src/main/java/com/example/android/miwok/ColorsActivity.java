package com.example.android.miwok;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_recycler);
        RecyclerView colorRecycler = findViewById(R.id.word_recycler);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        colorRecycler.setLayoutManager(new LinearLayoutManager(this));

        TestRecyclerAdapter.ItemClickListener listener = new TestRecyclerAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Word word) {
                Toast.makeText(ColorsActivity.this, word.getDefaultTranslation() , Toast.LENGTH_SHORT).show();
            }
        };
        TestRecyclerAdapter testRecyclerAdapter = new TestRecyclerAdapter(listener, getColorsList());
        colorRecycler.setAdapter(testRecyclerAdapter);



    }


    private ArrayList<Word> getColorsList() {
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));


        return words;
    }

}
