package com.example.layoutapp;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class SecondRecycleSpaces extends RecyclerView.ItemDecoration {

    private int spaceRecycleSpaces;

    public SecondRecycleSpaces(int space) {
        this.spaceRecycleSpaces = space;
    }


    @Override
    public void getItemOffsets( Rect outRect,  View view,  RecyclerView parent,  RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left = spaceRecycleSpaces;
        outRect.right = spaceRecycleSpaces;
        outRect.bottom = spaceRecycleSpaces;


        if(parent.getChildLayoutPosition(view) == 0){
            outRect.top = spaceRecycleSpaces;
        }
        else {
            outRect.top = 0;
        }



    }
}
