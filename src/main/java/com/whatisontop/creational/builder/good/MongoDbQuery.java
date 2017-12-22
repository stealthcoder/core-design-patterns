package com.whatisontop.creational.builder.good;

public class MongoDbQuery implements Query {

    private String from;
    private String where;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }


    public void execute() {
        System.out.println("executing MongoDbQuery from : " + this.from + " where: " + this.where);
    }

}
