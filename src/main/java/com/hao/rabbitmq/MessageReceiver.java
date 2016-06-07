package com.hao.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by haojiahong on 16/6/7.
 */
public class MessageReceiver implements MessageListener {
    @Override
    public void onMessage(Message message) {
        //String内部有一个转码的方法
        System.out.println(new String(message.getBody()));
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    }
}
