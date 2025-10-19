package com.ledao.config;

import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class QuartzHardStartConfig {

    // 手动创建 Quartz 调度器并启动
    @PostConstruct
    public void startQuartz() throws Exception {
        // 直接通过 quartz原生工厂创建调度器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        if (!scheduler.isStarted()) {
            scheduler.start();
            System.out.println("=== 原生 Quartz 调度器已强制启动 ===");
        }
    }
}