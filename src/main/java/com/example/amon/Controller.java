package com.example.amon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private RadioButton rBt_smoke_yes , rBt_smoke_no ,
            rBt_vegeterian_yes ,rBt_vegeterian_no ,
            rBt_hurry_yes , rBt_hurry_no ;
    @FXML
    private Button rBt_facts ;

    private List<String> facts = new ArrayList<>();
    public void hurryState(ActionEvent event) {

            if(rBt_hurry_yes.isSelected()) {
                facts.add("este_grabit");
            }
            if (rBt_hurry_no.isSelected()) {
                int pos = facts.indexOf("este_grabit");//Getting string position
                facts.remove(pos);
            }
    }

    public void vegeterianState(ActionEvent event) {

             if(rBt_vegeterian_yes.isSelected()) {
                facts.add("vegetarian");
             }

             if (rBt_vegeterian_no.isSelected()) {
                int pos = facts.indexOf("vegetarian");//Getting string position
                facts.remove(pos);
        }

    }

    public void smokeState(ActionEvent event) {

            if(rBt_smoke_yes.isSelected()) {
                facts.add("fumator");
            }

            if (rBt_smoke_no.isSelected()) {
                int pos = facts.indexOf("fumator");//Getting string position
                facts.remove(pos);
        }
    }

    public void getFacts() {
        System.out.println(facts);
    }
}
