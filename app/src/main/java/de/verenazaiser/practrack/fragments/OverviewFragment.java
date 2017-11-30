package de.verenazaiser.practrack.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.verenazaiser.practrack.R;
import de.verenazaiser.practrack.SkillsActivity;

import static android.content.ContentValues.TAG;

/**
 * @author vzaiser
 */

public class OverviewFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        CardView goalsCard = rootView.findViewById(R.id.cv_goals);
        goalsCard.setOnClickListener(this);
        CardView plansCard = rootView.findViewById(R.id.cv_plans);
        plansCard.setOnClickListener(this);
        CardView projectsCard = rootView.findViewById(R.id.cv_projects);
        projectsCard.setOnClickListener(this);
        CardView exercisesCard = rootView.findViewById(R.id.cv_exercises);
        exercisesCard.setOnClickListener(this);
        CardView skillsCard = rootView.findViewById(R.id.cv_skills);
        skillsCard.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cv_goals:
                break;
            case R.id.cv_plans:
                break;
            case R.id.cv_projects:
                break;
            case R.id.cv_exercises:
                break;
            case R.id.cv_skills:
                Intent intent = new Intent(getActivity(), SkillsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
