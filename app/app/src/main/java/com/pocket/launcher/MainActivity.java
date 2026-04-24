package com.pocket.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout root = new RelativeLayout(this);
        root.setBackgroundColor(Color.BLACK);

        LinearLayout menu = new LinearLayout(this);
        menu.setOrientation(LinearLayout.VERTICAL);
        menu.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("MINE-LAUNCHER\nBEDROCK");
        title.setTextSize(32);
        title.setTextColor(Color.GREEN);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 50);
        menu.addView(title);

        Button playBtn = new Button(this);
        playBtn.setText("JOGAR AGORA");
        playBtn.setBackgroundColor(Color.parseColor("#388E3C"));
        playBtn.setTextColor(Color.WHITE);
        
        playBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Iniciando Engine Bedrock...", Toast.LENGTH_SHORT).show();
        });

        menu.addView(playBtn, new LinearLayout.LayoutParams(500, 150));
        root.addView(menu, new RelativeLayout.LayoutParams(-1, -1));
        setContentView(root);
    }
          }
