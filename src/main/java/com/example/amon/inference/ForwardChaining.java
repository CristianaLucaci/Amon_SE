package com.example.amon.inference;

import com.example.amon.model.KnowledgeBase;

import java.util.ArrayList;
import java.util.List;

public class ForwardChaining {

    public static String getResult() {
        return result;
    }

    private static String result;

    public static void generateConclusion() {

        boolean flag = false;

        int[] counter = new int[KnowledgeBase.getRules().size()];

        for(int i = 0 ; i < KnowledgeBase.getRules().size();i++) {
            counter[i] = KnowledgeBase.getRules().get(i).getPremises().size();
        }

        List<String> aux = new ArrayList<>();
        aux.addAll(KnowledgeBase.getFacts());
        while(!aux.isEmpty() && !flag) {

            String fact = aux.remove(0);
            for(int i = 0 ; i < KnowledgeBase.getRules().size() ; i++) {
                if(KnowledgeBase.getRules().get(i).getPremises().contains(fact)) {
                    counter[i]--;

                    if(counter[i] == 0) {
                        if(Conclusion.allConclusions.contains(KnowledgeBase.getRules().get(i).getHead())) {
                            flag = true;
                            result = KnowledgeBase.getRules().get(i).getHead();
                        } else {
                            aux.add(KnowledgeBase.getRules().get(i).getHead());
                        }
                    }
                }
            }
        }
        System.out.println(aux);
        System.out.println(KnowledgeBase.getFacts());
        if (aux.isEmpty() && !flag) {
            result = "indecisive conclusion";
        }
    }

}
