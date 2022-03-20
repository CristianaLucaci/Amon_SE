package com.example.amon.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


public class KnowledgeBase {
    private static List<Rule> rules = new ArrayList<>();

    public static void addRule(Rule rule) {
        rules.add(rule);
    }

    public static List<Rule> getRules() {
        return rules;
    }
}
