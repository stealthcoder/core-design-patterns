package com.whatisontop.creational.builder;

public class Client {

    public static void main(String[] args) {


        String from="client table";
        String where="client name = ...";

        //build the query using the director
        SqlQuery sqlQuery = new SqlQuery();
        sqlQuery.setFrom(from);
        sqlQuery.setWhere(where);
        sqlQuery.execute();

        MongoDbQuery mongoDbQuery = new MongoDbQuery();
        mongoDbQuery.setFrom(from);
        mongoDbQuery.setWhere(where);
        mongoDbQuery.execute();



    }
}
