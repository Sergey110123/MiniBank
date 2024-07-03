package ru.satvaldiev.minibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.satvaldiev.middleservice.MiddleServiceApplication;
import ru.satvaldiev.telegrambot.TelegramBotApplication;

@SpringBootApplication
public class MiniBankApplication {
    public static void main(String[] args) {
        SpringApplication.run(new Class[]{TelegramBotApplication.class,
                MiddleServiceApplication.class}, args);
    }
}
