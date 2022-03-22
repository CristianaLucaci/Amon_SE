package com.example.amon.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


public class KnowledgeBase {
    private static List<Rule> rules = new ArrayList<>();

    private static List<String> facts = new ArrayList<>();

    public static void addFact(String fact) {
        facts.add(fact);
    }

    public static List<String> getFacts() {
        return facts;
    }

    public static void addRule(Rule rule) {
        rules.add(rule);
    }

    public static List<Rule> getRules() {
        return rules;
    }
}
