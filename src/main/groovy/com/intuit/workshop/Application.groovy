package com.intuit.workshop

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.intuit.workshop.invoicing")
class Application {
    static main(args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .run()
    }
}
