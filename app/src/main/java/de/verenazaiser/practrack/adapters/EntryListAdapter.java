package de.verenazaiser.practrack.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import de.verenazaiser.practrack.R;
import de.verenazaiser.practrack.models.Entry;

/**
 * @author vzaiser
 */

public class EntryListAdapter extends ArrayAdapter<Entry> {

    public EntryListAdapter(@NonNull Context context, int resource, @NonNull List<Entry> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            view = vi.inflate(R.layout.entry_item, parent, false);
        }

        Entry entryItem = getItem(position);

        if (entryItem != null) {
            TextView titleTextView = view.findViewById(R.id.tv_entry_title);
            TextView descriptionTextView = view.findViewById(R.id.tv_entry_description);
            TextView dateTextView = view.findViewById(R.id.tv_entry_date);

            if (titleTextView != null) {
                titleTextView.setText(entryItem.getTitle());
            }

            if (dateTextView != null) {
                dateTextView.setText(entryItem.getDate());
            }

            if (descriptionTextView != null) {
                descriptionTextView.setText(entryItem.getDescription());
            }
        }

        return view;
    }
}
