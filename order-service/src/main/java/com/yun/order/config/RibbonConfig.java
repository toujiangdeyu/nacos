package com.yun.order.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaohuayun
 * @create 2022/8/8
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule iRule(){
        //默认为轮询规则，这里自定义为随机规则
        return new NacosRule();
    }
}
