package com.amy.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*create button click listeners*/
        // Popular Movies Button
        Button m_PopularMovieBtn = (Button)findViewById(R.id.popularMovies_btn);
        m_PopularMovieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayToast("This button will Launch the Popular Movies Project");
            }
        });
        // Stock Hawk Button
        Button m_StockHawkBtn = (Button)findViewById(R.id.stockHawk_Btn);
        m_StockHawkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayToast("This button will Launch the Stock Hawk Project");
            }
        });
        // Build It Bigger Button
        Button m_BuildItBiggerBtn = (Button)findViewById(R.id.buildItBigger_Btn);
        m_BuildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayToast("This button will Launch the Build It Bigger Project");
            }
        });
        // Make Your App Material Button
        Button m_MaterialBtn = (Button)findViewById(R.id.makeYourAppMaterial_Btn);
        m_MaterialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayToast("This button will Launch the Make Your App Material Project");
            }
        });
        // Go Ubiquitous Button
        Button m_GoUbiquitousBtn = (Button)findViewById(R.id.goUbiquitous_Btn);
        m_GoUbiquitousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayToast("This button will Launch the Go Ubiquitous Project");
            }
        });
        // Capstone My Own App Button
        Button m_CapstoneBtn = (Button)findViewById(R.id.capstone_btn);
        m_CapstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayToast("This button will Launch the my Capstone Project");
            }
        });
    }

    private void DisplayToast(String text)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
