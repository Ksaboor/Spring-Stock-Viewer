package com.khalilio.stock.dbservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Quotes {

    private String userName;
    private List<String> quotes;

    public Quotes() {

    }
}
