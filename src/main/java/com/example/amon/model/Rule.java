package com.example.amon.model;


import lombok.*;

import java.util.List;
@Setter
@ToString
public class Rule {

    private List<String> premises;
    private String head;

}
