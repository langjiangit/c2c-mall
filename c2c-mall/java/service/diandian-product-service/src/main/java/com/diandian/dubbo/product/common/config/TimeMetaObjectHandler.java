package com.diandian.dubbo.product.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自动为实体创建时间和更新时间赋值
 *
 * @author x
 * @date 2018-09-18
 */
@Component
@Slf4j
public class TimeMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Date now = new Date();
        this.setFieldValByName("createTime", now, metaObject);
        this.setFieldValByName("updateTime", now, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
