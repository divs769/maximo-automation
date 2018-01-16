package com.shopdirect.maximoautomation.infrastructure.dao;

import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import com.shopdirect.maximoautomation.infrastructure.config.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.config.RethinkDBConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
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

    public List<Map<String, Object>> getAll(String table, Long startIndex, Long limit) {
        try (Connection connection = connectionFactory.connectToMaximoDb()) {
            Cursor cursor = r.table(table).orderBy().optArg("index", r.desc("startTime"))
                    .slice(startIndex).limit(limit).run(connection);
            return cursor.toList();
        }
    }

    public Long countRecords() {
        try(Connection connection = connectionFactory.connectToMaximoDb()) {
            return r.table(DBInitializer.BUILDS_TB).count().run(connection);
        }
    }
}
