package com.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProvideApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProvideApplication.class,args);
        System.out.println("==============provide启动成功===============");
    }
}
