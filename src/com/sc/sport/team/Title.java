package com.sc.sport.team;

import com.sc.sport.championship.Championship;

import java.util.Set;

public class Title {

    private final Set<Championship> championships;

    public Title(Set<Championship> championships) {
        if (championships == null) {
            throw new NullPointerException("Championships cannot be null");
        }
        if(championships.isEmpty()){
            throw new IllegalStateException("Championships cannot be empty");
        }
        this.championships = championships;
    }

    public Set<Championship> getChampionships() {
        return championships;
    }
}
