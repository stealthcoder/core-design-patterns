package com.whatisontop.creational.builder.good;

public class QueryBuildDirector {

    public Query build(String from, String where, QueryBuilder builder)
    {
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }

}
