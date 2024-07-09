package com.example.fragmentation;
// src/main/java/com/example/yourapp/MainActivity.java


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load the first fragment by default
        if (savedInstanceState == null) {
            loadFirstFragment();
        }
    }

    private void loadFirstFragment() {
        Fragment firstFragment = new FirstFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, firstFragment);
        transaction.commit();
    }

    public void loadSecondFragment() {
        Fragment secondFragment = new SecondFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, secondFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
