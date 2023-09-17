package com.ymy;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@SpringBootTest
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testGenJwt(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("name", "tom");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"leon")//设置签名 使用HS256算法，并设置SecretKey(字符串)
                .setClaims(claims)//自定义内容（载荷）
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))//设置有效期
                .compact();

        System.out.println(jwt);
//        JwtBuilder builder= Jwts.builder()
//                .setId("888")             //设置唯一编号
//                .setSubject("小白")       //设置主题  可以是JSON数据
//                .setIssuedAt(new Date())  //设置签发日期
//                .signWith(SignatureAlgorithm.HS256,"leon");//设置签名 使用HS256算法，并设置SecretKey(字符串)
//        //构建 并返回一个字符串
//        System.out.println( builder.compact() );


    }

    @Test
    public void testParseJwt(){
        Claims claims = Jwts.parser()
                .setSigningKey("leon")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTY5NDg4Mzg0MH0.WQHnVbnMC3pyZIoykayCY68J9IoiXnkhRbf3Hw7L3hk")
                .getBody();
        System.out.println(claims);
    }

}
