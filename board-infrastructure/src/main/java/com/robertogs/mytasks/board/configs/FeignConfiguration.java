package com.robertogs.mytasks.board.configs;

import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public OkHttpClient client(){
        return new OkHttpClient();
    }
}
