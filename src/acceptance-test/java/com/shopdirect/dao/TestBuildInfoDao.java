package com.shopdirect.dao;

import com.rethinkdb.net.Connection;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.rethinkdb.RethinkDB.r;

@Repository
public class TestBuildInfoDao {

    private RethinkDBConnectionFactory connectionFactory;
    private Connection connection;

    @Autowired
    public TestBuildInfoDao(RethinkDBConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void createConnection() {
        connection = connectionFactory.createConnection();
    }

    public List<String> getDatabases() {
        return r.dbList().run(connection);
    }

    public List<String> getTables() {
        return r.db(DBInitializer.MAXIMO_DB).tableList().run(connection);
    }

    public void deleteAllRows() {
        r.db(DBInitializer.MAXIMO_DB).table(DBInitializer.BUILDS_TB).delete().run(connection);
    }

    public Long countRows() {
        return r.db(DBInitializer.MAXIMO_DB).table(DBInitializer.BUILDS_TB).count().run(connection);
    }

    public void closeConnection() {
        connection.close();
    }
}
