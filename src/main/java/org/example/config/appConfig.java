package org.example.config;

import org.example.domain.Product;
import org.springframework.context.annotation.Bean;

public class appConfig {

    @Bean("product1")
    public Product getProductDetail(){
        return new Product(5,"Laptop","For Software Development",59990,5,2);
    }
    @Bean("product2")
    public Product getProductDetail1(){
        return new Product(7,"SmartPhone","For Basic Use",9990,4,5);

    }

}
