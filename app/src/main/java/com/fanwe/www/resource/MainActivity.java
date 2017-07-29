package com.fanwe.www.resource;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.res_selector_white_gray).setOnClickListener(this);
        findViewById(R.id.res_selector_white_gray_stroke1px_all).setOnClickListener(this);
        findViewById(R.id.res_selector_white_gray_stroke1px_b).setOnClickListener(this);
        findViewById(R.id.res_selector_white_gray_stroke1px_blr).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Toast.makeText(this, ((TextView) v).getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
