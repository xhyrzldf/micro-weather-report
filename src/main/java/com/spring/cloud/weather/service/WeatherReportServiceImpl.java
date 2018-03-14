package com.spring.cloud.weather.service;

import com.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.weather.vo.Weather;

/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	@Autowired
	private WeatherDataService  weatherDataService;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
		return resp.getData();
	}

}
