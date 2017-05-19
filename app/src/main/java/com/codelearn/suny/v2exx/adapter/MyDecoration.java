package com.codelearn.suny.v2exx.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by suny on 2017/5/19.
 */

public class MyDecoration extends RecyclerView.ItemDecoration {
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = 0;
        outRect.right = 0;
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = 0;
        } else {
            outRect.top = 80;

        }
    }
}
