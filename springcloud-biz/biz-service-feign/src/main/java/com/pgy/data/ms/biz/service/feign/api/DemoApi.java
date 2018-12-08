package com.pgy.data.ms.biz.service.feign.api;

import com.pgy.data.ms.biz.service.api.demo.IDemoApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ginko
 * @description 直接继承接口(开发中推荐用这个, 但对于调用方而言, 可以无需去理会具体细节了, 照着接口方法去传参就好了)
 * fallback = HelloApiFailImpl.class
 * @date 2018/11/21 13:39
 */
@FeignClient(name = IDemoApi.SERVICE_NAME)
public interface DemoApi extends IDemoApi {

}
