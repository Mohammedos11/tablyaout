package com.example.tablyaout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    ViewPagerFragmentAdapter adapter;


    private String[] labels = new String[]{"Calls", "Chats", "Status"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();


        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText(labels[position]);
        }).attach();


        viewPager2.setCurrentItem(0, false);
    }

    private void init() {

        tabLayout = findViewById(R.id.tabLayout);

        viewPager2 = findViewById(R.id.viewPager2);

        adapter = new ViewPagerFragmentAdapter(this);

        viewPager2.setAdapter(adapter);


        getSupportActionBar().setElevation(0);
    }


    private class ViewPagerFragmentAdapter extends FragmentStateAdapter {

        public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new CallsFragment();
                case 1:
                    return new shatsFragment();
                case 2:
                    return new StatusFragment();
            }
            return new shatsFragment();
        }


        @Override
        public int getItemCount() {
            return labels.length;
        }
    }
}