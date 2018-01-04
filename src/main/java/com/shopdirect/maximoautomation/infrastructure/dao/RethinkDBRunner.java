package com.shopdirect.maximoautomation.infrastructure.dao;

import com.rethinkdb.net.Connection;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.rethinkdb.RethinkDB.r;

/**
 * This is a wrapper for RethinkDB calls.
 * This class has been created to make it easier to unit test the DAO's classes.
 */
@Component
public class RethinkDBRunner {
    private final RethinkDBConnectionFactory connectionFactory;

    @Autowired
    public RethinkDBRunner(RethinkDBConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Map<String,Object> create(String table, Map document) {
        try(Connection connection = connectionFactory.connectToMaximoDb()) {
            return r.table(table).insert(document).run(connection);
        }
    }

    public Map<String, Object> update(String table, String id, Map document) {
        try(Connection connection = connectionFactory.connectToMaximoDb()) {
            return r.table(table).get(id).update(document).run(connection);
        }
    }

    public Map<String, Object> get(String table, String id) {
        try(Connection connection = connectionFactory.connectToMaximoDb()) {
            return r.table(table).get(id).run(connection);
        }
    }
}
