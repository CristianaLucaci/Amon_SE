package com.example.amon.parser;
import com.example.amon.model.KnowledgeBase;
import com.example.amon.model.Rule;
import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Data {

    private static Object obj;
    private static JsonObject jsonObject;
    private static JsonArray rulesList;
    private static JsonArray premiseslist;

    public static void getRules() {
        Iterator<JsonElement> iterator = rulesList.iterator();
        while (iterator.hasNext()) {
            Rule rule = new Rule();
            JsonElement jsonElement = iterator.next();
            String head = (String) jsonElement.getAsJsonObject().get("head").getAsString();
            premiseslist = jsonElement.getAsJsonObject().get("premises").getAsJsonArray();

            List<String> premises = new ArrayList<>();
            getPremises(premises);
            rule.setPremises(premises);
            rule.setHead(head);
            System.out.println(rule);
        }
    }

    public static void getPremises(List<String> premises) {
        for(int i = 0; i < premiseslist.size() ; i++) {
            String premise = premiseslist.get(i).getAsString();
            premises.add(premise);
        }
    }
    public static void getData() {
        KnowledgeBase knowledgeBase = new KnowledgeBase();

        JsonParser parser  = new JsonParser();
        try {
            obj = parser.parse(new FileReader("src/main/java/com/example/amon/parser/KB.json"));

            jsonObject = (JsonObject) obj;

            rulesList = (JsonArray) jsonObject.get("rules");

            getRules();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
