package com.whatisontop.creational.builder.good;

public class SqlQueryBuilder implements QueryBuilder{

    private SqlQuery query = new SqlQuery();

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
