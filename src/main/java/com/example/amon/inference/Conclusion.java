package com.example.amon.inference;

import com.example.amon.model.KnowledgeBase;
import com.example.amon.model.Rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Conclusion {

    public static List<String> allConclusions = new ArrayList<>();

    public static void initialise() {
        for(Rule rule : KnowledgeBase.getRules()) {
            if(rule.getHead().matches("[A-Z].+")) {
                allConclusions.add(rule.getHead());
            }
        }

    }
}
