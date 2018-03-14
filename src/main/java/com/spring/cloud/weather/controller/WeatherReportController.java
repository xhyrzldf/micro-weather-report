package com.spring.cloud.weather.controller;

import com.spring.cloud.weather.service.CityDataService;
import com.spring.cloud.weather.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Weather Report Controller.
 * 
 * @since 1.0.0 2017年11月24日
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

	private final CityDataService cityDataService;
	
	private final WeatherReportService weatherReportService;

	@Autowired
	public WeatherReportController(CityDataService cityDataService, WeatherReportService weatherReportService) {
		this.cityDataService = cityDataService;
		this.weatherReportService = weatherReportService;
	}

	@GetMapping("/cityId/{cityId}")
	public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
		model.addAttribute("title", "老卫的天气预报");
		model.addAttribute("cityId", cityId);
		model.addAttribute("cityList", cityDataService.listCity());
		model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
		return new ModelAndView("weather/report", "reportModel", model);
	}

}
