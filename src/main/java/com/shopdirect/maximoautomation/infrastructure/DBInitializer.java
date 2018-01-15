package com.shopdirect.maximoautomation.infrastructure;

import com.rethinkdb.net.Connection;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.rethinkdb.RethinkDB.r;

@Component
public class DBInitializer implements InitializingBean {

    public static final String MAXIMO_DB = "maximoauto";
    public static final String BUILDS_TB = "builds";

    private RethinkDBConnectionFactory connectionFactory;

    @Autowired
    public DBInitializer(RethinkDBConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    private void createDb() {
        Connection connection = connectionFactory.createConnection();
        List<String> dbList = r.dbList().run(connection);
        if (!dbList.contains(MAXIMO_DB)) {
            r.dbCreate(MAXIMO_DB).run(connection);
        }
        List<String> tables = r.db(MAXIMO_DB).tableList().run(connection);
        if (!tables.contains(BUILDS_TB)) {
            r.db(MAXIMO_DB).tableCreate(BUILDS_TB).run(connection);
            r.db(MAXIMO_DB).table(BUILDS_TB).indexCreate("startTime").run(connection);
        }
        connection.close();
    }

    @Override
    public void afterPropertiesSet() {
        createDb();
    }
}
