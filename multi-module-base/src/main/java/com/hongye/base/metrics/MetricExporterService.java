package com.hongye.base.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.boot.actuate.metrics.repository.MetricRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;


/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 2015/3/31 16:04
 */
@Component
public class MetricExporterService {

    public static final String METRIC_PREF = "metric";

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//    @Autowired
//    private Jedis jedis;
    @Autowired
    private MetricRepository repository;

    @Scheduled(initialDelay = 10000, fixedDelay = 10000)
    public void exportMetrics() {
//        repository.findAll().forEach(this::log);
    }

    private void log(Metric<?> m) {
        String message = m.getName() + "_" + m.getValue() + "_" + dateFormat.format(m.getTimestamp());
//        jedis.publish(METRIC_PREF, message);
        repository.reset(m.getName());
    }

}
