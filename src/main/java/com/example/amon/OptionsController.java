package com.example.amon;

import com.example.amon.inference.Conclusion;
import com.example.amon.inference.ForwardChaining;
import com.example.amon.model.KnowledgeBase;
import com.example.amon.parser.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class OptionsController {
    @FXML
    private RadioButton rBt_hurry_yes, rBt_hurry_no, rBt_vegetarian_no, rBt_vegetarian_yes, rBt_smoking_yes, rBt_smoking_no, rBt_train_station, rBt_center, rBt_shopping, rBt_river, rBt_romantic_date, rBt_prices_no, rBt_prices_yes, rBt_business_meeting, rBt_family_meal;

    @FXML
    private CheckBox cb_romanian, cb_chinese, cb_italian, cb_american, cb_greek;

    @FXML
    private TextArea result;

    @FXML
    private Button submitButton;

    public void resetForm(){
        rBt_family_meal.setSelected(false);
        rBt_hurry_yes.setSelected(false);
        rBt_hurry_no.setSelected(false);
        rBt_vegetarian_no.setSelected(false);
        rBt_business_meeting.setSelected(false);
        rBt_romantic_date.setSelected(false);
        rBt_shopping.setSelected(false);
        rBt_river.setSelected(false);
        rBt_train_station.setSelected(false);
        rBt_center.setSelected(false);
        rBt_prices_no.setSelected(false);
        rBt_prices_yes.setSelected(false);
        rBt_smoking_yes.setSelected(false);
        rBt_vegetarian_yes.setSelected(false);
        rBt_smoking_no.setSelected(false);
        cb_american.setSelected(false);
        cb_italian.setSelected(false);
        cb_greek.setSelected(false);
        cb_romanian.setSelected(false);
        cb_chinese.setSelected(false);
    }

    public void hurryState(ActionEvent event) {
        System.out.println(KnowledgeBase.getFacts());
        if(rBt_hurry_yes.isSelected()) {
            KnowledgeBase.addFact("este_grabit");
        }
        if (rBt_hurry_no.isSelected()) {
            int pos = KnowledgeBase.getFacts().indexOf("este_grabit");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

    public void getFacts() {
        System.out.println(KnowledgeBase.getFacts());
        Data.getData();
        Conclusion.initialise();

        ForwardChaining.generateConclusion();
        String rezultat = ForwardChaining.getResult();
        result.setText(rezultat);
        resetForm();
        KnowledgeBase.getFacts().removeAll(KnowledgeBase.getFacts());
    }

    public void getFoodPreferance(){
        System.out.println(KnowledgeBase.getFacts());
        if(cb_romanian.isSelected()) {
            if(!KnowledgeBase.getFacts().contains("mancare_traditionala"))
                KnowledgeBase.addFact("mancare_traditionala");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("mancare_traditionala");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
        if(cb_greek.isSelected()) {
            if(!KnowledgeBase.getFacts().contains("mancare_greceasca"))
            KnowledgeBase.addFact("mancare_greceasca");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("mancare_greceasca");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
        if(cb_italian.isSelected()) {
            if(!KnowledgeBase.getFacts().contains("mancare_specific_italienesc"))
            KnowledgeBase.addFact("mancare_specific_italienesc");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("mancare_specific_italienesc");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
        if(cb_american.isSelected()) {
            if(!KnowledgeBase.getFacts().contains("mancare_specific_american"))
            KnowledgeBase.addFact("mancare_specific_american");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("mancare_specific_american");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

    public void getVegetarian(){
        System.out.println(KnowledgeBase.getFacts());
        if(rBt_vegetarian_yes.isSelected()) {
            KnowledgeBase.addFact("mancare_vegetariana");
        }
        if (rBt_vegetarian_no.isSelected()) {
            int pos = KnowledgeBase.getFacts().indexOf("mancare_vegetariana");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

    public void getSmoking(){
        System.out.println(KnowledgeBase.getFacts());
        if(rBt_smoking_yes.isSelected()) {
            KnowledgeBase.addFact("fumator");
        }
        if (rBt_smoking_no.isSelected()) {
            int pos = KnowledgeBase.getFacts().indexOf("fumator");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

    public void getPrices(){
        System.out.println(KnowledgeBase.getFacts());
        if(rBt_prices_yes.isSelected()) {
            KnowledgeBase.addFact("buget_mic");
        }
        if (rBt_prices_no.isSelected()) {
            int pos = KnowledgeBase.getFacts().indexOf("buget_mic");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

    public void getLocation(){
        System.out.println(KnowledgeBase.getFacts());
        if(rBt_center.isSelected()) {
            KnowledgeBase.addFact("vizita_pe_centru");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("vizita_pe_centru");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }

        if(rBt_river.isSelected()) {
            KnowledgeBase.addFact("priveliste_spre_rau");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("priveliste_spre_rau");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }

        if(rBt_shopping.isSelected()) {
            KnowledgeBase.addFact("shopping");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("shopping");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }

        if(rBt_train_station.isSelected()) {
            KnowledgeBase.addFact("merge_cu_trenul");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("merge_cu_trenul");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

    public void getDate(){
        System.out.println(KnowledgeBase.getFacts());
        if(rBt_romantic_date.isSelected()) {
            KnowledgeBase.addFact("intalnire_romantica");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("intalnire_romantica");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }

        if(rBt_business_meeting.isSelected()) {
            KnowledgeBase.addFact("intalnire_de_afaceri");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("intalnire_de_afaceri");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }

        if(rBt_family_meal.isSelected()) {
            KnowledgeBase.addFact("intalnire_cu_prietenii_si_familia");
        }else{
            int pos = KnowledgeBase.getFacts().indexOf("intalnire_cu_prietenii_si_familia");//Getting string position
            if(pos >= 0){
                KnowledgeBase.getFacts().remove(pos);
            }
        }
    }

}
