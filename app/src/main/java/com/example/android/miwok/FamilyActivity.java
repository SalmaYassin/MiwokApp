package com.example.android.miwok;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_recycler);

        RecyclerView familyRecycler = findViewById(R.id.word_recycler);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        familyRecycler.setLayoutManager(new LinearLayoutManager(this));

        WordRecyclerAdapter.ItemClickListener listener = new WordRecyclerAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Word word) {
                Toast.makeText(FamilyActivity.this, R.string.app_name, Toast.LENGTH_SHORT).show();
            }
        };
        WordRecyclerAdapter wordRecyclerAdapter = new WordRecyclerAdapter(listener, getFamilyList());
        familyRecycler.setAdapter(wordRecyclerAdapter);



    }


    private ArrayList<Word> getFamilyList() {
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother,
                R.raw.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother,
                R.raw.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister,
                R.raw.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister,
                R.raw.family_younger_sister));
        words.add(new Word("grandmother ", "ama", R.drawable.family_grandmother,
                R.raw.family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather,
                R.raw.family_grandfather));
        return words;
    }

}
