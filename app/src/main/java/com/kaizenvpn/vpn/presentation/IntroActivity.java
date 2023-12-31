package com.kaizenvpn.vpn.presentation;

import android.content.Intent;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.kaizenvpn.vpn.R;
import com.kaizenvpn.vpn.core.util.CarouselEffectTransformer;
import com.kaizenvpn.vpn.core.util.ClickableViewPager;
import com.kaizenvpn.vpn.presentation.main.adapter.IntroAdapter;

import java.util.ArrayList;
import java.util.List;


public class IntroActivity extends AppCompatActivity {
    private ClickableViewPager view_pager_slide;
    private IntroAdapter slide_adapter;
    private List<Integer> slideList= new ArrayList<>();
//    private ViewPagerIndicator view_pager_indicator;
    private RelativeLayout relative_layout_slide;
    private LinearLayout linear_layout_skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        slideList.add(1);
        slideList.add(2);
        slideList.add(3);


        this.linear_layout_skip=(LinearLayout) findViewById(R.id.linear_layout_skip);
//        this.view_pager_indicator=(ViewPagerIndicator) findViewById(R.id.view_pager_indicator);
        this.view_pager_slide=(ClickableViewPager) findViewById(R.id.view_pager_slide);
        this.relative_layout_slide=(RelativeLayout) findViewById(R.id.relative_layout_slide);
        slide_adapter = new IntroAdapter(getApplicationContext(),slideList);
        view_pager_slide.setPageTransformer(false, new CarouselEffectTransformer(IntroActivity.this)); // Set transformer

        view_pager_slide.setAdapter(this.slide_adapter);
        view_pager_slide.setOffscreenPageLimit(1);
        view_pager_slide.setOnItemClickListener(position -> {
            if (position <2){
                view_pager_slide.setCurrentItem(position+1);
            }else{
                    Intent intent = new Intent(IntroActivity.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                    finish();
            }
        });
        this.linear_layout_skip.setOnClickListener(v -> {

                    Intent intent = new Intent(IntroActivity.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                    finish();

        });

        this.view_pager_slide.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        relative_layout_slide.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient_slide_2));
                        break;
                    case 1:
                        relative_layout_slide.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient_slide_5));
                        break;
                    case 2:
                        relative_layout_slide.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient_slide_6));
                        break;
                }

            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        this.view_pager_slide.setClipToPadding(false);
        this.view_pager_slide.setPageMargin(0);
//        view_pager_indicator.setupWithViewPager(view_pager_slide);
    }

}
