package com.example.nttr.slidetest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 縦横のマス数
    private int mPieceX = 4;
    private int mPieceY = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RelativeLayout内に、均等に、imageviewを配置する


        // 別案：LinearLayoutの入れ子
        LinearLayout llOutside = (LinearLayout) findViewById(R.id.llVertilcal);

        // http://ahoworld.blog58.fc2.com/?m&no=263
        // http://zaki.tdiary.net/20110702.html
        // https://developer.android.com/reference/android/widget/LinearLayout.LayoutParams.html
        // LinearLayoutの縦or横の比率をweightで制御したい場合、LayoutParamで該当の縦or横を0で宣言する。
        // これらのLinearLayoutの親はweightを使用しないのであれば、match_parentにする。

        // 上段のLinearLayout
        LinearLayout.LayoutParams lpTop
                =   new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0);
//                =   new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT);
        lpTop.weight = 3.0f;
        LinearLayout llTop = new LinearLayout(this);
        llTop.setOrientation(LinearLayout.HORIZONTAL);
        llTop.setLayoutParams(lpTop);
        llTop.setGravity(Gravity.CENTER_VERTICAL);
        // 上段・左側のTextView
        LinearLayout.LayoutParams lpTopLeft
                =   new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT);
        lpTopLeft.setMargins(30,30,30,30);
        lpTopLeft.weight = 1.0f;
        TextView tvTopLeft = new TextView(this);
        tvTopLeft.setLayoutParams(lpTopLeft);
        tvTopLeft.setGravity(Gravity.CENTER);
        tvTopLeft.setText("左上");
        tvTopLeft.setBackgroundColor(Color.BLUE);
        // 上段・真ん中のTextView
        LinearLayout.LayoutParams lpTopMiddle
                =   new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT);
        lpTopMiddle.setMargins(30,30,30,30);
        lpTopMiddle.weight = 2.0f;
        TextView tvTopMiddle = new TextView(this);
        tvTopMiddle.setLayoutParams(lpTopMiddle);
        tvTopMiddle.setGravity(Gravity.CENTER);
        tvTopMiddle.setText("中中");
        tvTopMiddle.setBackgroundColor(Color.DKGRAY);
        // 上段・右側のTextView
        LinearLayout.LayoutParams lpTopRight
                =   new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT);
        lpTopRight.setMargins(30,30,30,30);
        lpTopRight.weight = 3.0f;
        TextView tvTopRight = new TextView(this);
        tvTopRight.setLayoutParams(lpTopRight);
        tvTopRight.setGravity(Gravity.CENTER);
        tvTopRight.setText("右上");
        tvTopRight.setBackgroundColor(Color.YELLOW);

        // 下段のLienarLayout
        LinearLayout.LayoutParams lpBottom
                =   new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0);
        lpBottom.weight = 2.0f;
        LinearLayout llBottom = new LinearLayout(this);
        llBottom.setOrientation(LinearLayout.HORIZONTAL);
        llBottom.setLayoutParams(lpBottom);
        llBottom.setGravity(Gravity.CENTER_VERTICAL);
        // 下段・左側のTextView
        LinearLayout.LayoutParams lpBottomLeft
                =   new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT);
        lpBottomLeft.setMargins(30,30,30,30);
        lpBottomLeft.weight = 2.0f;
        TextView tvBottomLeft = new TextView(this);
        tvBottomLeft.setLayoutParams(lpBottomLeft);
        tvBottomLeft.setGravity(Gravity.CENTER);
        tvBottomLeft.setText("左下");
        tvBottomLeft.setBackgroundColor(Color.GREEN);
        // 下段・右側のTextView
        LinearLayout.LayoutParams lpBottomRight
                =   new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT);
        lpBottomRight.setMargins(30,30,30,30);
        lpBottomRight.weight = 3.0f;
        TextView tvBottomRight = new TextView(this);
        tvBottomRight.setLayoutParams(lpBottomRight);
        tvBottomRight.setGravity(Gravity.CENTER);
        tvBottomRight.setText("右下");
        tvBottomRight.setBackgroundColor(Color.MAGENTA);

        // 上段と下段を縦に並べるためのLinearLayout
//        LinearLayout llOutside = new LinearLayout(this);
//        llOutside.setOrientation(LinearLayout.VERTICAL);
//        llOutside.setLayoutParams(
//                new LinearLayout.LayoutParams(
//                        LinearLayout.LayoutParams.MATCH_PARENT,
//                        LinearLayout.LayoutParams.MATCH_PARENT));

        // 配置
        //llTop.setWeightSum(1.0f);
        llTop.addView(tvTopLeft);
        llTop.addView(tvTopMiddle);
        llTop.addView(tvTopRight);
        llBottom.addView(tvBottomLeft);
        llBottom.addView(tvBottomRight);
        llOutside.addView(llTop);
        llOutside.addView(llBottom);
        // 画面に表示
        //setContentView(llOutside);
        


    }
}
