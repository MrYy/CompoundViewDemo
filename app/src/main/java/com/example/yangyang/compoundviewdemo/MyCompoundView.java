package com.example.yangyang.compoundviewdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by yangyang on 15/10/7.
 */
public class MyCompoundView extends LinearLayout{
    EditText editText;
    Button clearButton;

    public MyCompoundView(Context context){
        super(context);
        LayoutInflater layoutInflater;
        String infServer=Context.LAYOUT_INFLATER_SERVICE;
        layoutInflater=(LayoutInflater)getContext().getSystemService(infServer);
        layoutInflater.inflate(R.layout.compound_layout,this,true);

        editText=(EditText)findViewById(R.id.edittext);
        clearButton=(Button)findViewById(R.id.clear_button);
        hookupButton();
    }
    public MyCompoundView(Context context,AttributeSet attributeSet){
        super(context, attributeSet);
    }


    public void hookupButton(){
        clearButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }



}
