package com.example.bookshelf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Made in Abyss","Akihito Tsukushi", R.drawable.ma));
        items.add(new Item("Vinland Saga","Makoto Yukimura", R.drawable.v));
        items.add(new Item("Berserk","Kentaro Miura", R.drawable.b));
        items.add(new Item("Akira","Katsuhiro Otomo", R.drawable.ak));
        items.add(new Item("Death Note","Tsugumi Ohba", R.drawable.d));
        items.add(new Item("Neon Genesis Evagelion","Yoshiyuki Sadamoto", R.drawable.n));
        items.add(new Item("Monster","Naoki Urasawa", R.drawable.mt));
        items.add(new Item("Tokyo Ghoul","Sui Ishida", R.drawable.t));
        items.add(new Item("Chainsaw Man","Tatsuki Fujimoto", R.drawable.c));
        items.add(new Item("Ajin: Demi-Human","Gamon Sakurai", R.drawable.aj));


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}