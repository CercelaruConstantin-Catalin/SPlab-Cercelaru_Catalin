package com.example.labsp.services;

import com.example.labsp.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph p, int spaces);
}
