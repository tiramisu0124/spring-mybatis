package com.spring.mybatis.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/rabbit")
public class RabbitMQController {

    @Autowired
    private Producer producer;

    @Value("#{appConfig['mq.queue']}")
    private String queueId;

    /**
     * @Description: 消息队列
     * @Author:
     * @CreateTime:
     */
    @ResponseBody
    @RequestMapping("/sendQueue")
    public String testQueue() {
        try {
            for (int i =0; i < 10; i++) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("data", "hello rabbitmq" + i);
                // 注意：第二个属性是 Queue 与 交换机绑定的路由
                producer.sendQueue(queueId + "_exchange", queueId + "_patt", map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "send over";
    }
}
