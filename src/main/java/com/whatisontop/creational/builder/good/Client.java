package com.whatisontop.creational.builder.good;

public class Client {

    public static void main(String[] args) {
        QueryBuildDirector director = new QueryBuildDirector();

        //sql query
        Query query = null;

        query = director.build("from", "where", new SqlQueryBuilder());
        query.execute();


        query = director.build("from", "where", new MongoDbQueryBuilder());
        query.execute();


    }

}
