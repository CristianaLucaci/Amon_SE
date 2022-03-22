package com.example.amon.inference;

import com.example.amon.model.KnowledgeBase;

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

        while(!KnowledgeBase.getFacts().isEmpty() && !flag) {

            String fact = KnowledgeBase.getFacts().remove(0);
            for(int i = 0 ; i < KnowledgeBase.getRules().size() ; i++) {
                if(KnowledgeBase.getRules().get(i).getPremises().contains(fact)) {
                    counter[i]--;

                    if(counter[i] == 0) {
                        if(Conclusion.allConclusions.contains(KnowledgeBase.getRules().get(i).getHead())) {
                            flag = true;
                            result = KnowledgeBase.getRules().get(i).getHead();
                        } else {
                            KnowledgeBase.addFact(KnowledgeBase.getRules().get(i).getHead());
                        }
                    }
                }
            }
        }
        if (KnowledgeBase.getFacts().isEmpty() && !flag) {
            result = "indecisive conclusion";
        }
    }

}
