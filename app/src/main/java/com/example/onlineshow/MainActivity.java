package com.example.onlineshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


         recyclerView = findViewById(R.id.recycleView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
       layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
       recyclerView.setLayoutManager(layoutManager);

        List<Modelclass>modelclassList = new ArrayList<>();
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 1", "This is Tittle 1 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 2", "This is Tittle 2 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 3", "This is Tittle 3 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 4", "This is Tittle 4 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 5", "This is Tittle 5 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 6", "This is Tittle 6 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 7", "This is Tittle 7 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 8", "This is Tittle 8 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 9", "This is Tittle 9 User"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background, "This is Tittle 10", "This is Tittle 10 User"));

        Adapter adapter = new Adapter(modelclassList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();


    }
}