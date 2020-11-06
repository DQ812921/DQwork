package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerViewActivity02 extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);

        initFruitsS();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        /*此行代码用于实现瀑布流布局*/
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterR adapter = new FruitAdapterR(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruitsS() {
        for (int i = 0; i < 3; i++) {
            Fruit apple = new Fruit(getRandomLengthName("Apple"), R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("Banana"), R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.orange);
            fruitList.add(orange);
            Fruit lemon = new Fruit(getRandomLengthName("Lemon"), R.drawable.lemon);
            fruitList.add(lemon);
            Fruit peach = new Fruit(getRandomLengthName("Peach"), R.drawable.peach);
            fruitList.add(peach);
            Fruit pear = new Fruit(getRandomLengthName("Pear"), R.drawable.pear);
            fruitList.add(pear);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.mango);
            fruitList.add(mango);
            Fruit grape = new Fruit(getRandomLengthName("Grape"), R.drawable.grape);
            fruitList.add(grape);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < length; j++) {
            builder.append(name);
        }
        return builder.toString();
    }
}