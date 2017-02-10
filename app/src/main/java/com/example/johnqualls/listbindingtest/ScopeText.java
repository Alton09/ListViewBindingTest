package com.example.johnqualls.listbindingtest;

import java.util.List;

/**
 * Created by john.qualls on 2/9/2017.
 */

public class ScopeText {
    private String name;
    private boolean inUse;

    ScopeText(String name, boolean inUse){
        this.name = name;
        this.inUse = inUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
