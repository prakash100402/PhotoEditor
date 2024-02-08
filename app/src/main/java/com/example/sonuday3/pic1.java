package com.example.sonuday3;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;


public class pic1 extends Fragment {

    private RelativeLayout relativeLayout,frameLayout;
    private Button button;
    private Handler handler;
    private int i;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*View popupLayout = LayoutInflater.from(getContext()).inflate(R.layout.popupaddtext, null);
        Button myButton = (Button) popupLayout.findViewById(R.id.addtext);*/

        View view = inflater.inflate(R.layout.fragment_pic1, container, false);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.frame1);

        handler = new Handler();
        button =view.findViewById(R.id.add); i =0;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText = new EditText(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                layoutParams.leftMargin = 400; // Set the left margin as per your requirement
                layoutParams.topMargin = 500+(i*150); // Set the top margin as per your requirement
                editText.setLayoutParams(layoutParams);
                relativeLayout.addView(editText);
                i++;
            }
        });



        // Attach OnClickListener to the fragment's view
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showPopupMenu(v);
                if (button.getVisibility() == View.VISIBLE) {
                    button.setVisibility(View.INVISIBLE); // Make invisible
                } else {
                    button.setVisibility(View.VISIBLE); // Make visible
                }
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button.setVisibility(View.INVISIBLE); // Make invisible after 5 seconds
                    }
                }, 3000); // Delay in milliseconds

            }
        });

        return view;

    }

   /* private void showPopupMenu(View view) {
        LayoutInflater inflater1 = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popup = inflater1.inflate(R.layout.popupaddtext,null);
        int width = ViewGroup.LayoutParams.MATCH_PARENT;
        int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        boolean focasable =true;

        PopupWindow popupWindow = new PopupWindow(popup,width,height,focasable);
        relativeLayout.post(new Runnable() {
            @Override
            public void run() {
                popupWindow.showAtLocation(relativeLayout,Gravity.BOTTOM,0,0);

            }
        });

    }*/



}