package com.example.shch.madlibsrussian;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mbrunarskiy on 12/28/16.
 */

public class Story implements Serializable{
    private String title;
    private String imageName;
    private String content;
    private String description;
    private List<Question> questions;

    public Story(String title, String imageName, String content, String description) {
        this.title = title;
        this.imageName = imageName;
        this.content = content;
        this.description = description;
    }

    public Story(){}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
