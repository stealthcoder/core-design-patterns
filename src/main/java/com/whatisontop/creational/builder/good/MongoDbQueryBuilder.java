package com.whatisontop.creational.builder.good;

public class MongoDbQueryBuilder implements QueryBuilder{

    MongoDbQuery query = new MongoDbQuery();

    public void from(String from) {
        query.setFrom(from);
    }

    public void where(String where) {
        query.setWhere(where);
    }

    public Query getQuery() {
        return query;
    }
}
