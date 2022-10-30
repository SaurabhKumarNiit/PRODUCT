package org.example;

import org.example.config.appConfig;
import org.example.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Product Data" );

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(appConfig.class);
        Product product=context.getBean("product1",Product.class);

        System.out.println(product);
    }
}
