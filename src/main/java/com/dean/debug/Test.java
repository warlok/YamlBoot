package com.dean.debug;

import com.dean.server.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Test {

    @Autowired
    Settings config;

    @Autowired
    Settings.Database database;

    @Autowired
    Environment env;

    @PostConstruct
    public void init() {
        System.err.println(config.getPort());
        System.err.println(database.getHost());
        System.err.println(config.getDatabase());

    }
}
