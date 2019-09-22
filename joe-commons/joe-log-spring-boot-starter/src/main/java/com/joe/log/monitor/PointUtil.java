package com.joe.log.monitor;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * 日志埋点工具类
 */
@UtilityClass
@Slf4j
public class PointUtil {

    private static final String SPLIT = "|";

    /**
     * @param id 对象id
     * @param type 对象类型
     * @param message 对象属性
     */
    public void info(String id,String type,String message){
        log.info(id + SPLIT + type + SPLIT + message);
    }

    public void debug(String id,String type,String message){
        log.debug(id + SPLIT + type + SPLIT + message);
    }
}
