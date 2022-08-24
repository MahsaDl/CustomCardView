package com.example.dariacardview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class DariaCardView extends CardView {


    Paint paint;
    TypedArray typedArray;

    public DariaCardView(@NonNull Context context) {
        super(context);
        init(null, context);

    }

    public DariaCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs, context);

    }

    public DariaCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, context);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint =new Paint();
        Rect rectSrc= new Rect(200,100,1000,1000);
        Rect rectDst= new Rect(100,100,getWidth()-100,getHeight()-100);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.daria);
        canvas.drawBitmap(bitmap,rectSrc,rectDst, paint);

    }

    private void init(@Nullable AttributeSet attrs, Context context) {
        typedArray = context.obtainStyledAttributes(attrs, R.styleable.DariaCardView);
        setCardBackgroundColor(typedArray.getColor(R.styleable.DariaCardView_dariaCardBackgroundColor, Color.BLACK));
        setCardElevation(typedArray.getDimension(R.styleable.DariaCardView_dariaCardElevation, 0));
    }


}
