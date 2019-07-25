package com.hyq.controller;

import com.hyq.servers.BaseAbsServers;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * PROJECT springboottest
 * createdate 2019/7/23 21:14
 *
 * @author hyq
 * @version 1.0
 */
public abstract class BaseAbsController<T> implements BaseController{
    @Autowired(required=false)
    BaseAbsServers<T> baseservers;
}
