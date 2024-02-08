package com.example.sonuday3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class pagerfragment extends FragmentStateAdapter {


    public pagerfragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public pagerfragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new pic1();
            case 1:
                return new pic2();
            case 2:
                return new pic3();
            default:
              return null;
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
