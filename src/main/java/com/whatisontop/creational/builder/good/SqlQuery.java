package com.whatisontop.creational.builder.good;


public class SqlQuery implements Query {

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

    private String from;
    private String where;

    public void execute() {
        System.out.println("executing sqlquery from : " + this.from + " where: " + this.where);
    }


}
