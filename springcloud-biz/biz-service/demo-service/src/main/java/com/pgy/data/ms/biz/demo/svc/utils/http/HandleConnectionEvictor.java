package com.pgy.data.ms.biz.demo.svc.utils.http;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.HttpClientConnectionManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ginko
 * @date 2018-8-24 10:26:47
 */
@Component
@Slf4j
public class HandleConnectionEvictor extends Thread {

    @Resource
    private HttpClientConnectionManager connMgr;

    private volatile boolean shutdown;

    public HandleConnectionEvictor() {
        super();
        super.start();
    }

    @Override
    public void run() {
        try {
            while (!shutdown) {
                synchronized (this) {
                    wait(5000);
                    // 关闭失效的连接
                    connMgr.closeExpiredConnections();
                }
            }
        } catch (InterruptedException ex) {
            log.error("关闭失效的http连接异常", ex);
            // 结束
        }
    }

    //关闭清理无效连接的线程
    public void shutdown() {
        shutdown = true;
        synchronized (this) {
            notifyAll();
        }
    }
}