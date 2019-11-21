package ru.myitschool.films;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class films extends AppCompatActivity {

    String[] movies;
    TextView tvTitle;
    boolean[] showned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);
        Resources r = getResources();
        movies = r.getStringArray(R.array.mov);
        tvTitle = (TextView) findViewById(R.id.Title);
        showned = new boolean[movies.length];
    }

    public void f(){
        int k = (int) (Math.random()*5);
        if (showned[k]){f();}
        else {showned[k] = true;
            tvTitle.setText(movies[k]);}
    }


    public void OnClickNext(View v) {
      f();
    }

    public void OnClickReset(View v) {
        tvTitle.setText(movies[0]);
    }
}
