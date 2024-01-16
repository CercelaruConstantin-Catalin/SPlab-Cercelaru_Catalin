package com.example.labsp.models;

import com.example.labsp.models.Paragraph;
import com.example.labsp.services.AlignStrategy;

public class LeftAlignmentStrategy implements AlignStrategy {
    @Override
    public void render(Paragraph p, int spaces) {
        String text = p.getText();
        String[] words = text.split(" ");
        int currentLineLength = 0;
        for (String word : words) {
            if (currentLineLength + word.length() <= spaces) {
                System.out.print(word + " ");
                currentLineLength += word.length() + 1;
            } else {
                System.out.println();
                System.out.print(word + " ");
                currentLineLength = word.length() + 1;
            }
        }
        System.out.println();
    }
}
