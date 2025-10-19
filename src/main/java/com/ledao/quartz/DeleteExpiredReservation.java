package com.ledao.quartz;

import com.ledao.service.ReservationService;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * 删除过期的预约单
 *
 * @author LeDao
 * @company
 * @create 2020-05-30 11:26
 */
@Component
public class DeleteExpiredReservation {

    @Resource
    private ReservationService reservationService;

    @Scheduled(cron = "0 */1 * * * ?")
    public void work() {
        reservationService.deleteExpiredReservation();
    }

}
