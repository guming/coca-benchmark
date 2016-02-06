package org.jinn.coca.benchmark.redisdb;

import junit.framework.Assert;
import org.jinn.redis.Redis4JHAServer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gumingcn on 16/2/6.
 */
public class RedisHandler {
    private static Redis4JHAServer server;
    static {
        List servers = new ArrayList();
        servers.add("127.0.0.1:6379:0");
        server = new Redis4JHAServer();
        server.setServers(servers);
        server.setDoubleWrite(true);
        server.setPoolConfig(new JedisPoolConfig());
    }
    public static Redis4JHAServer getServer(){
        return server;
    }
}
