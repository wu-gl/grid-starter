package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Grid.class)
@EnableConfigurationProperties(GridProperties.class)
public class GridAutoConfig {


    @Bean
    @ConditionalOnMissingBean
    public Grid getGrid(GridProperties gridProperties) {
        Grid grid = new Grid();
        grid.setAge(gridProperties.getAge());
        grid.setName(gridProperties.getName());
        return grid;
    }
}
