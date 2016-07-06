package com.demo.expandablelistview;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main22Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        showDialog();
    }


    public void showDialog() {
        FragmentManager fm = getSupportFragmentManager();
        MyDialogFragemnt myDialogFragemnt = new MyDialogFragemnt();
        myDialogFragemnt.show(fm, "dialog");
    }
}
