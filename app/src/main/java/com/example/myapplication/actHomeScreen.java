package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.example.myapplication.gridview.CourseGVAdapter;
import com.example.myapplication.model.CourseModel;

import java.util.ArrayList;

public class actHomeScreen extends AppCompatActivity {

    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_home_screen);

        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("DSA", R.drawable.user));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.logout));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.user));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.user));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.user));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.user));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);

       /* coursesGV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(actHomeScreen.this, "test item", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}