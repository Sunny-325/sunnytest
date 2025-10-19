package com.ledao.controller;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerStatusController {

    // 直接注入 Scheduler 类型，无需指定名称
    @Autowired
    private Scheduler scheduler;

    @GetMapping("/scheduler/status")
    public String getStatus() throws Exception {
        return "调度器状态：" + (scheduler.isStarted() ? "已启动" : "未启动") +
                "，是否在待机：" + scheduler.isInStandbyMode();
    }
}