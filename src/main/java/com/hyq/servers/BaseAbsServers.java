package com.hyq.servers;

import com.hyq.mappers.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * PROJECT springboottest
 * createdate 2019/7/23 21:20
 *
 * @author hyq
 * @version 1.0
 */
public abstract class BaseAbsServers<T> implements BaseServers {

    @Autowired(required=false)
    BaseMapper<T> baseMapper;

}
