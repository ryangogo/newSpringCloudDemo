package com.ryan.order.feign;


import com.ryan.order.entity.Product;
import org.springframework.stereotype.Component;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/6/23
 * Time:下午2:26
 */
@Component
public class ProductFeignClientCallBack implements ProductFeignClient {
    @Override
    public Product findById(Long id) {
        Product product = new Product();
        product.setProductName("除法熔断");
        return product;
    }
}
