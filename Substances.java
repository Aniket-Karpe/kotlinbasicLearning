package com.aklabs.kotlinpractice.practicekotlin;

public class Substances {
    private int suID;
    private  String SubName;
    private  String Subnames;

//    public Substances(int suID, String subName, String subnames) {
//        this.suID = suID;
//        SubName = subName;
//        Subnames = subnames;
//    }

    public int getSuID() {
        return suID;
    }

    public void setSuID(int suID) {
        this.suID = suID;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String subName) {
        SubName = subName;
    }

    public String getSubnames() {
        return Subnames;
    }

    public void setSubnames(String subnames) {
        Subnames = subnames;
    }
}
