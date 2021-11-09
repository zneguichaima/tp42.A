package com.example.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "word_table")
public class Word {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "word")//prsente Word ,clé primaire et not null
    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}
    public String getWord(){return this.mWord;}
}
