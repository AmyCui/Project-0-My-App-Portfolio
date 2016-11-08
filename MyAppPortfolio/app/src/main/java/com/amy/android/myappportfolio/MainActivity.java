package com.amy.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity
{

    @BindView(R.id.popularMovies_Btn) Button m_PopularMovieBtn;
    @BindView(R.id.stockHawk_Btn) Button m_StockHawkBtn;
    @BindView(R.id.buildItBigger_Btn) Button m_BuildItBiggerBtn;
    @BindView(R.id.makeYourAppMaterial_Btn) Button m_MaterialBtn;
    @BindView(R.id.goUbiquitous_Btn) Button m_GoUbiquitousBtn;
    @BindView(R.id.capstone_Btn) Button m_CapstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View v)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast;
        switch (v.getId())
        {
            case R.id.popularMovies_Btn:
                toast = Toast.makeText(context, R.string.popular_movie_text, duration);
                break;
            case R.id.stockHawk_Btn:
                toast = Toast.makeText(context, R.string.stock_hawk_text, duration);
                break;
            case R.id.buildItBigger_Btn:
                toast = Toast.makeText(context, R.string.build_it_bigger_text, duration);
                break;
            case R.id.makeYourAppMaterial_Btn:
                toast = Toast.makeText(context, R.string.make_material_text, duration);
                break;
            case R.id.goUbiquitous_Btn:
                toast = Toast.makeText(context, R.string.go_ubiquitous_text, duration);
                break;
            case R.id.capstone_Btn:
                toast = Toast.makeText(context, R.string.capstone_text, duration);
                break;
            default:
                toast = Toast.makeText(context, "", duration);
                break;
        }

        toast.show();
    }


}
