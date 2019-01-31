package com.spring.mybatis.activemq;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main( String[] args ) {
        for (int i = 0; i < 20; i++) {
            HttpClient httpClient = new HttpClient();
            new Thread(new Sender(httpClient)).start();
        }
    }
}
class Sender implements Runnable {
    public static AtomicInteger count = new AtomicInteger(0);
    HttpClient httpClient;

    public Sender(HttpClient client) {
        httpClient = client;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"---Send message-"+count.getAndIncrement());
            PostMethod post = new PostMethod("http://localhost:8080/activemq/SendMessage.do");
            post.addParameter("msg", "Hello world!");
            httpClient.executeMethod(post);
            System.out.println(Thread.currentThread().getName()+"---Send message Success-"+count.getAndIncrement());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}