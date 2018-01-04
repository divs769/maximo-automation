package com.shopdirect.maximoautomation.infrastructure;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

import static com.shopdirect.maximoautomation.infrastructure.DBInitializer.MAXIMO_DB;

@Component
public class RethinkDBConnectionFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(RethinkDBConnectionFactory.class);

    @Value("${db.host:localhost}")
    private String host;
    @Value("${db.port:28015}")
    private int port;

    public Connection createConnection() {
        LOGGER.info("Connecting to database at {}:{}", host, port);
        return RethinkDB.r.connection().hostname(host).port(port).connect();
    }

    public Connection connectToMaximoDb() {
        LOGGER.info("Connecting to database at {}:{}", host, port);
        return RethinkDB.r.connection().hostname(host).port(port).db(MAXIMO_DB).connect();
    }
}
