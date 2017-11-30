package de.verenazaiser.practrack.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import de.verenazaiser.practrack.R;
import de.verenazaiser.practrack.fragments.SkillEntriesFragment;
import de.verenazaiser.practrack.fragments.SkillHistoryFragment;
import de.verenazaiser.practrack.fragments.SkillOverviewFragment;

/**
 * @author vzaiser
 */

public class SkillTabAdapter extends FragmentPagerAdapter {

    private final String TAG = SkillTabAdapter.class.getSimpleName();
    private Context context;

    public SkillTabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SkillOverviewFragment();
            case 1:
                return new SkillHistoryFragment();
            case 2:
                return new SkillEntriesFragment();
            default:
                Log.e(TAG, "Unavailable slide position");
        }
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.skill_tab_overview);
            case 1:
                return context.getString(R.string.skill_tab_history);
            case 2:
                return context.getString(R.string.skill_tab_entries);
        }
        return null;
    }
}
