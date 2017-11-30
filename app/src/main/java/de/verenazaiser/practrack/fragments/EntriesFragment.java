package de.verenazaiser.practrack.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import de.verenazaiser.practrack.R;
import de.verenazaiser.practrack.adapters.EntryListAdapter;
import de.verenazaiser.practrack.models.Entry;
import de.verenazaiser.practrack.models.Project;

/**
 * @author vzaiser
 */

public class EntriesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_entries, container, false);

        // TODO get entries from server
        ArrayList<Entry> entryList = new ArrayList<>();
        entryList.add(new Entry("entry 1", "description 1", new Date(), new Project("project 1", "description 1")));
        entryList.add(new Entry("entry 2", "description 2", new Date(), new Project("project 2", "description 2")));
        entryList.add(new Entry("entry 3", "description 3", new Date(), new Project("project 3", "description 3")));

        ListView entriesListView = rootView.findViewById(R.id.lv_entries);
        ListAdapter listAdapter = new EntryListAdapter(rootView.getContext(), R.layout.entry_item, entryList);

        entriesListView.setAdapter(listAdapter);
        return rootView;
    }
}
