package com.example.nicolas.parcel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static android.content.ContentValues.TAG;

<<<<<<< HEAD
public class MainActivity extends AppCompatActivity {

=======
public class MainActivity extends AppCompatActivity  {
>>>>>>> origin/master

    protected BottomNavigationView navigationView;
    protected ViewFlipper vf;
    protected FloatingActionButton newDeliveryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        //create the view flipper to show the 3 screens
        vf = (ViewFlipper)findViewById(R.id.vf );

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

<<<<<<< HEAD
=======
    @Override
    protected void onStart() {
        super.onStart();
>>>>>>> origin/master
    }

    public void startNewParcelActivity(View v) {
        startActivity(new Intent(this, NewParcelActivity.class));
    }

<<<<<<< HEAD
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_home:
                    vf.setDisplayedChild(0);
                    return true;
                case R.id.action_history:
                    vf.setDisplayedChild(1);
                    return true;
                case R.id.action_profile:
                    vf.setDisplayedChild(2);
                    return true;
=======

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        navigationView.postDelayed(() -> {
            int itemId = item.getItemId();
            if (itemId == R.id.action_home) {
                startActivity(new Intent(this, HomeActivity.class));
            } else if (itemId == R.id.action_history) {
                startActivity(new Intent(this, HistoryActivity.class));
            } else if (itemId == R.id.action_profile) {
                startActivity(new Intent(this, ProfileActivity.class));
>>>>>>> origin/master
            }
            return false;
        }

<<<<<<< HEAD
    };
=======
>>>>>>> origin/master


<<<<<<< HEAD

=======
>>>>>>> origin/master
}
