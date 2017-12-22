package com.whatisontop.creational.builder.good;

public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();

}
