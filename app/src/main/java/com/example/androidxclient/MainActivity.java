package com.example.androidxclient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.leochuan.CarouselLayoutManager;
import com.leochuan.CircleLayoutManager;

public class MainActivity extends AppCompatActivity {

        private DrawerLayout drawerLayout;
        private ActionBarDrawerToggle actionBarDrawerToggle ;
        RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DoDrawer ();
//        layoutManager.setMaxVisibleItemCount(count);



        new CircleLayoutManager.Builder(this)
                .setReverseLayout(true)
                .build();
    }


    private void DoDrawer ()
    {
        drawerLayout = findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this ,drawerLayout ,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
