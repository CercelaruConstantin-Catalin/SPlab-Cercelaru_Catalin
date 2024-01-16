package com.example.labsp.models;

import com.example.labsp.models.LeftAlignmentStrategy;
import com.example.labsp.models.RightAlignmentStrategy;
import com.example.labsp.models.TextAlignment;
import com.example.labsp.services.AlignStrategy;

public class AlignmentStrategyFactory {
    public static AlignStrategy create(TextAlignment strategy) {
        if(strategy.equals(TextAlignment.left)) return new LeftAlignmentStrategy();
        return new RightAlignmentStrategy();
    }


}
