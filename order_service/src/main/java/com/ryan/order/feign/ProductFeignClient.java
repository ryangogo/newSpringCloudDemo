package com.ryan.order.feign;

import com.ryan.order.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * describe：声明需要调用的微服务名称
 *           配置需要调用的微服务接口
 *
 * @FeignClient:服务提供者的名称
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/10/21
 * Time:下午3:30
 */
@FeignClient(name = "service-product",fallback = ProductFeignClientCallBack.class)
public interface ProductFeignClient {

    /**
     * 配置需要调用的微服务接口
     */
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    Product findById(@PathVariable("id") Long id);

}
