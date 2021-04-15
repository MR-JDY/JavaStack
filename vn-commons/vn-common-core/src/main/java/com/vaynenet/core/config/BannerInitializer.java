package com.vaynenet.core.config;

import com.nepxion.banner.BannerConstant;
import com.nepxion.banner.Description;
import com.nepxion.banner.LogoBanner;
import com.taobao.text.Color;
import com.vaynenet.core.constant.CommonConstant;
import com.vaynenet.core.utils.CustomBanner;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BannerInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (!(applicationContext instanceof AnnotationConfigApplicationContext)) {
            LogoBanner logoBanner = new LogoBanner(BannerInitializer.class, "/vayne/logo.txt", "欢迎来到英雄联盟！", 3, 6, new Color[3], true);
            CustomBanner.show(logoBanner, new Description(BannerConstant.VERSION + ":", CommonConstant.PROJECT_VERSION, 0, 1)
                    , new Description("世界第一ADC:", "薇恩-UZI", 0, 1)
                    , new Description("世界第一喷子:", "JOE", 0, 1)
            );
        }
    }
}
