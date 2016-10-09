package com.example.madaim.ex5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout mainLayout =(RelativeLayout) findViewById(R.id.mainLayout);
        LinearLayout layoutFromXML =(LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout2, mainLayout, false);
        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, toPixels(180));
        rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
       // rlp.setMargins(0,);
        mainLayout.addView(layoutFromXML, rlp);

        LinearLayout layout1 = new LinearLayout(this);
        layout1.setOrientation(LinearLayout.VERTICAL);
        layout1.setBackgroundResource(R.drawable.border);
        rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, toPixels(200));
        rlp.addRule(RelativeLayout.BELOW, R.id.textView);
        rlp.setMargins(0, toPixels(20), 0, 0);
        mainLayout.addView(layout1, rlp);
    }

    private int toPixels(int dp){
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
       int px = Math.round(dp * (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }
}
