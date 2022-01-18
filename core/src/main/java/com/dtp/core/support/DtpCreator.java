package com.dtp.core.support;

import com.dtp.core.DtpExecutor;
import com.dtp.core.thread.ThreadPoolBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * DtpCreator related
 *
 * @author: yanhom
 * @since 1.0.0
 **/
public class DtpCreator {

    public static ThreadPoolExecutor createCommonFast(String threadPrefix) {
        return ThreadPoolBuilder.newBuilder()
                .threadFactory(threadPrefix)
                .buildCommon();
    }

    public static DtpExecutor createDynamicFast(String name) {
        return createDynamicFast(name, name);
    }

    public static DtpExecutor createDynamicFast(String name, String threadPrefix) {
        return ThreadPoolBuilder.newBuilder()
                .threadPoolName(name)
                .threadFactory(threadPrefix)
                .buildDynamic();
    }

    public static ExecutorService createWithTtl(String threadPrefix) {
        return ThreadPoolBuilder.newBuilder()
                .threadFactory(threadPrefix)
                .buildWithTtl();
    }
}