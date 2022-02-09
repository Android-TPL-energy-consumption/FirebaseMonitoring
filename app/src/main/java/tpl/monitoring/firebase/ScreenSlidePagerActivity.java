package tpl.monitoring.firebase;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.firebase.analytics.FirebaseAnalytics;

import tpl.monitoring.firebase.ui.main.ScreenSlidePageFragment;

public class ScreenSlidePagerActivity extends FragmentActivity {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);
        ViewPager2 mPager = (ViewPager2) findViewById(R.id.pager);
        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager(),
                super.getLifecycle());
        mPager.setAdapter(pagerAdapter);
        mPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Bundle bundle = new Bundle();
                bundle.putInt("page", position);
                FirebaseAnalytics.getInstance(ScreenSlidePagerActivity.super.getBaseContext()).logEvent("pageEvent", bundle);
            }
        });
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private static class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm, Lifecycle lifecycle) {
            super(fm, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return new ScreenSlidePageFragment(position);
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}
