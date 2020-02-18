package com.el.cloud.hystrix.service;

import com.el.cloud.model.Animal;

import java.util.concurrent.Future;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
public interface ICollapsingService {
    public Future<Animal> collapsing(Integer id);
    public Animal collapsingSyn(Integer id);
    public Future<Animal> collapsingGlobal(Integer id);
}