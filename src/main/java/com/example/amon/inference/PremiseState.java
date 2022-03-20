package com.example.amon.inference;

import com.example.amon.model.KnowledgeBase;
import com.example.amon.model.Rule;

import java.util.HashMap;

public class PremiseState {

    public static HashMap<String , Boolean> allPremisesState = new HashMap<>();

    public static void initialise() {
        for(Rule rule : KnowledgeBase.getRules()) {
            for(String premise : rule.getPremises()) {
                allPremisesState.put(premise , false);
            }
            allPremisesState.put(rule.getHead(),false);
        }

    }
}
