package cn.sp.config;

import cn.sp.constants.LoadBalanceConstants;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 2YSP on 2020/12/27
 */
@ConfigurationProperties(prefix = "ship.gate")
public class ServerConfigProperties implements InitializingBean {
    /**
     * 负载均衡算法，默认轮询
     */
    private String loadBalance = LoadBalanceConstants.ROUND;
    /**
     * 网关超时时间，默认3s
     */
    private Long timeOutMillis = 3000L;
    /**
     * 单位s
     */
    private Long cacheRefreshInterval;

    private Integer webSocketPort;

    public Integer getWebSocketPort() {
        return webSocketPort;
    }

    public void setWebSocketPort(Integer webSocketPort) {
        this.webSocketPort = webSocketPort;
    }

    public Long getCacheRefreshInterval() {
        return cacheRefreshInterval;
    }

    public void setCacheRefreshInterval(Long cacheRefreshInterval) {
        this.cacheRefreshInterval = cacheRefreshInterval;
    }

    public Long getTimeOutMillis() {
        return timeOutMillis;
    }

    public void setTimeOutMillis(Long timeOutMillis) {
        this.timeOutMillis = timeOutMillis;
    }

    public String getLoadBalance() {
        return loadBalance;
    }

    public void setLoadBalance(String loadBalance) {
        this.loadBalance = loadBalance;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        // todo check config properties
    }

}