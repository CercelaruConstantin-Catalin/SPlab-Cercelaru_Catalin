package com.example.labsp.models;

import com.example.labsp.models.Paragraph;
import com.example.labsp.services.AlignStrategy;

public class RightAlignmentStrategy implements AlignStrategy {
    @Override
    public void render(Paragraph p, int spaces) {
        String text = p.getText();
        String[] words = text.split(" ");
        int currentLineLength = 0;
        for (String word : words) {
            int wordLength = word.length() + 1;
            if (currentLineLength + wordLength <= spaces) {
                currentLineLength += wordLength;
            } else {
                System.out.println();
                currentLineLength = wordLength;
            }

            int leadingSpaces = spaces - currentLineLength;
            for (int i = 0; i < leadingSpaces; i++) {
                System.out.print(" ");
            }
            System.out.print(word + " ");
            currentLineLength += wordLength;
        }
        System.out.println();
    }
}
