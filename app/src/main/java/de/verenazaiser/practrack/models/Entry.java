package de.verenazaiser.practrack.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author vzaiser
 */

public class Entry {

    private String title;
    private String description;
    private Project project;
    private Date date;

    public Entry(String title, String description, Date date, Project project) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.project = project;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Project getProject() {
        return project;
    }

    public String getDate() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(date);
    }
}
