package com.example.shch.madlibsrussian;

import java.io.Serializable;

/**
 * Created by mbrunarskiy on 12/28/16.
 */

public class Question implements Serializable {

    private String title;
    private String input;
    private String key;

    public Question(String title, String input, String key) {
        this.title = title;
        this.input = input;
        this.key = key;
    }

    public Question(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
