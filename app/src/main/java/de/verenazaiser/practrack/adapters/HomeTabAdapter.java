package de.verenazaiser.practrack.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import de.verenazaiser.practrack.R;
import de.verenazaiser.practrack.fragments.DashboardFragment;
import de.verenazaiser.practrack.fragments.EntriesFragment;
import de.verenazaiser.practrack.fragments.OverviewFragment;

/**
 * @author vzaiser
 */

public class HomeTabAdapter extends FragmentPagerAdapter {

    private final String TAG = HomeTabAdapter.class.getSimpleName();
    private Context context;

    public HomeTabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new DashboardFragment();
            case 1:
                return new OverviewFragment();
            case 2:
                return new EntriesFragment();
            default:
                Log.e(TAG, "Unavailable slide position");
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.home_tab_dashboard);
            case 1:
                return context.getString(R.string.home_tab_overview);
            case 2:
                return context.getString(R.string.home_tab_entries);
        }
        return null;
    }
}
