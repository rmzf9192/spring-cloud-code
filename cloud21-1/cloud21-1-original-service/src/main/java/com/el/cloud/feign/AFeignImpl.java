package com.el.cloud.feign;

import com.nepxion.discovery.plugin.framework.constant.PluginConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
@ConditionalOnProperty(name = PluginConstant.SPRING_APPLICATION_NAME, havingValue = "discovery-springcloud-example-a")
public class AFeignImpl extends AbstractFeignImpl implements AFeign {
    private static final Logger LOG = LoggerFactory.getLogger(AFeignImpl.class);

    @Autowired
    private BFeign bFeign;

    @Override
    public String invoke(@RequestBody String value) {
        value = doInvoke(value);
        value = bFeign.invoke(value);

        LOG.info("调用路径：{}", value);

        return value;
    }
}