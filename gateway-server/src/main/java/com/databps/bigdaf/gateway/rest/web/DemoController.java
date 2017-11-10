package com.databps.bigdaf.gateway.rest.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.simple.SimpleDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class DemoController {

//  private final Logger logger = Logger.getLogger(getClass());
//
//  @Autowired
//  private DiscoveryClient client;
//
//  @RequestMapping(value = "/add" ,method = RequestMethod.GET)
//  public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
//    ServiceInstance instance = client.getLocalServiceInstance();
//    Integer r = a + b;
//    logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
//    return r;
//  }
}
