package com.sc.models;

import java.util.Date;
import java.util.List;

public class Title {

    private final List<Championship> championships;

    public Title(List<Championship> championships) {
        if (championships == null) {
            throw new NullPointerException("Championships cannot be null");
        }
        if(championships.isEmpty()){
            throw new IllegalStateException("Championships cannot be empty");
        }
        this.championships = championships;
    }

    public List<Championship> getChampionships() {
        return championships;
    }
}
