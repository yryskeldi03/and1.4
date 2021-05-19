package com.geek.and14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.geek.and14.databinding.ActivityMainBinding;
import com.geek.and14.fragments.FirstFragment;
import com.geek.and14.fragments.SecondFragment;
import com.geek.and14.fragments.ThirdFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter adapter;
    private ActivityMainBinding binding;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private String[] titles = new String[] {"TITLES","NUMBERS","EXCHANGE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewPager = binding.viewPager;
        adapter = new ViewPagerAdapter(this);
        adapter.addItem(new FirstFragment());
        adapter.addItem(new SecondFragment());
        adapter.addItem(new ThirdFragment());
        viewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.tabs,viewPager,((tab, position) -> tab.setText(titles[position]))).attach();
    }
}