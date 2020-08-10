package com.example.demo;

import io.sentry.core.Sentry;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class SentryInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        Sentry.init(options -> {
            options.setDsn("XXX");
            options.setDebug(true);
        });
    }
}
