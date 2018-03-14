package com.spring.cloud.weather.service;

import java.util.List;

import com.spring.cloud.weather.vo.City;

/**
 * City Data Service.
 * 
 * @since 1.0.0 2017年11月23日
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
