package com.tuvm.testliblayout;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class CustomLayout extends RelativeLayout {
    public CustomLayout(Context context) {
        super(context);
        initLayoutCus();
    }

    public CustomLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayoutCus();
    }

    public CustomLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }


    private  void initLayoutCus(){
        LayoutInflater.from(getContext()).inflate(R.layout.layout_lib,this,true);
        Button btn =this.findViewById(R.id.button);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"A lô zô bô",Toast.LENGTH_LONG).show();
            }
        });
    }
}
