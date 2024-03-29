package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oways on 21-Dec-17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;
    public CategoryAdapter(FragmentManager fm,Context mContext    ) {
        super(fm);
        this.mContext=mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();

        } else if (position == 2){
            return new ColorFragment();
        }

        else {
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}

