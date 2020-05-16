package cn.itzhouq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Redis02SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Redis02SpringbootApplication.class, args);
    }
}
