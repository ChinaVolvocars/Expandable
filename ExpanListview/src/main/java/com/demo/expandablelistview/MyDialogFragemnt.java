package com.demo.expandablelistview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Create by YueXiaoHui on 2016/7/6 09:18
 */
public class MyDialogFragemnt extends DialogFragment implements View.OnClickListener {


    public MyDialogFragemnt() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pruduct_detail_activity_dialog, null);
        ImageView viewById = (ImageView) view.findViewById(R.id.iv_exit);
        viewById.setOnClickListener(this);

        //设置dialog的位置
        getDialog().getWindow().setGravity(Gravity.TOP | Gravity.LEFT);
        WindowManager.LayoutParams lp = getDialog().getWindow().getAttributes();
        //lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.x = 36;
        lp.y = 240;
        getDialog().getWindow().setAttributes(lp);


        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setCancelable(false);

        int style = DialogFragment.STYLE_NO_TITLE, theme = 0;
        setStyle(style, theme);


    }


    @Override
    public void onClick(View v) {
        dismiss();
    }
}
