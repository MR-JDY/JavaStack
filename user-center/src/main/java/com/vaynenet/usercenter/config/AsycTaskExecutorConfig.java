package com.vaynenet.usercenter.config;

import com.vaynenet.core.config.DefaultAsycTaskConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author vayne
 * 线程池配置、启用异步
 * @Async quartz 需要使用
 */
@Configuration
public class AsycTaskExecutorConfig extends DefaultAsycTaskConfig {

}
