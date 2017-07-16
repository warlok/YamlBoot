package com.dean.server;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties
@Data
@Component
@ConfigurationProperties(prefix="server")
public class Settings {

    private int port;
    private Database database;

    @Data
    @Component
    @ConfigurationProperties(prefix="server.database")
    public static class Database {
       public String host;
       public int port;
       public String user;
       public String pass;
    }

//    database:
//    host: test.host.com
//    port: 8080
//    user: dean
//    pass: qwerty
//    email:
//    login: dean@gmail.com
//    password: qwerty123
//    server: mail.gravitec.net
//    port: 465
//    push:
//    chrome50: true
//    chrome49: false
//    batchSize: 10
//    mongo:
//    host: localhost
//    port: 2710
//    user: grav
//    pass: 123456
//    db: gravitec
//    adminUsers:
//            - admin@gravitec.net
//    - test@gravitec.net

}
