package cn.itzhouq;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379, 10);
        System.out.println(jedis.ping()); // PONG
    }
}
