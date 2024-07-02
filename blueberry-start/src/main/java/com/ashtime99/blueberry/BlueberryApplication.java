package com.ashtime99.blueberry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-28
 */
@SpringBootApplication(scanBasePackages = {"com.ashtime99.blueberry", "com.alibaba.cola"})
public class BlueberryApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlueberryApplication.class, args);
    }
}
