package com.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "UserNotes")
public class NoteContainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Let the database handle ID generation
    private int id;

    private String title;
    private String description;

    // Default constructor
    public NoteContainer() {
        super();
    }

    // Constructor with title and description
    public NoteContainer(String title, String description) {
        super();
        this.title = title;
        this.description = description;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
