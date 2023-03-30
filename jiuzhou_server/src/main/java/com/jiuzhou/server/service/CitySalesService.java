package com.jiuzhou.server.service;

import com.jiuzhou.server.entity.CitySales;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author doro
 * @since 2023-03-06
 */
public interface CitySalesService extends IService<CitySales> {
    public Integer querySalesByCity(String city);
}
