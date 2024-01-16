package com.example.labsp.models;

import com.example.labsp.models.Paragraph;

import java.util.List;

public class Chapter {
    private String name;
    private List<Paragraph> subChapterList;

    public void print() {
        System.out.println(name);
    }

    public Chapter(String name) {
        this.name = name;

    }

    public void addParagraph(String pText) {
        Paragraph paragraph = new Paragraph(pText);
        subChapterList.add(paragraph);
    }
}
