package com.shopdirect.maximoautomation.infrastructure;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class RethinkDBConnectionFactory {

    @Value("${host.key:localhost}")
    private String host;

    public Connection createConnection() {
        return RethinkDB.r.connection().hostname(host).connect();
    }

    public Connection connectToMaximoDb() {
        return RethinkDB.r.connection().hostname(host).db(DBInitializer.MAXIMO_DB).connect();
    }
}
