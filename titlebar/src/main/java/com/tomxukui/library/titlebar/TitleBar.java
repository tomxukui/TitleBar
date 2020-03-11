package com.tomxukui.library.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class TitleBar extends FrameLayout {

    private LayoutInflater mInflater;

    private String mBackText;
    private int mBackTextColor;
    private int mBackTextSize;
    private Drawable mBackBackground;
    private int mBackIcon;
    private int mBackIconGravity;
    private float mBackIconPadding;

    private String mTitleText;
    private int mTitleTextColor;
    private int mTitleTextSize;

    public TitleBar(@NonNull Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public TitleBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0, 0);
    }

    public TitleBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr, 0);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TitleBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        mInflater = LayoutInflater.from(context);

        TypedArray typeArray = context.obtainStyledAttributes(attrs, R.styleable.TitleBar, defStyleAttr, defStyleRes);
        mBackText = typeArray.getString(R.styleable.TitleBar_backText);
        mBackTextColor = typeArray.getColor(R.styleable.TitleBar_backTextColor, mBackTextColor);
        mBackTextSize = typeArray.getDimensionPixelSize(R.styleable.TitleBar_backTextSize, mBackTextSize);
        mBackBackground = typeArray.getDrawable(R.styleable.TitleBar_backBackground);

        typeArray.recycle();
    }


}
