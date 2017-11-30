package de.verenazaiser.practrack.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.verenazaiser.practrack.R;

/**
 * @author vzaiser
 */

public class OverviewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        return rootView;
    }
}
