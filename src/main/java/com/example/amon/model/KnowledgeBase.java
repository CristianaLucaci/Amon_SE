package com.example.amon.model;

import lombok.ToString;

import java.util.List;

@ToString
public class KnowledgeBase {
    private List<Rule> rules;

    public void addRule(Rule rule) {
        rules.add(rule);
    }
}
