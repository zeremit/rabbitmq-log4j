package com.altoros;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by zeremit on 8.6.15.
 */
public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        logger.debug("test");
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("localhost");
//        Connection connection = factory.newConnection();
//        Channel channel = connection.createChannel();
//        channel.queueDeclare("QUEUE_NAME", false, false, false, null);
//        String message = "Hello World!";
//        channel.basicPublish("", "QUEUE_NAME", null, message.getBytes());
//        System.out.println(" [x] Sent '" + message + "'");
//        channel.close();;
//        connection.close();

    }
}
