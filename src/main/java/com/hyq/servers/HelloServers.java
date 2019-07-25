package com.hyq.servers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * PROJECT springboottest
 * createdate 2019/7/23 8:18
 *
 * @author hyq
 * @version 1.0
 */
@Service
public class HelloServers extends BaseAbsServers<String> {
    public String getHello(){
        return "hello";
    }


    @Override
    public String servers(String serverName) {
        return getHello();
    }
}
