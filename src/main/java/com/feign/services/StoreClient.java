package com.feign.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.feign.models.MeteoModel;


@FeignClient(name = "meteo", url = "http://localhost:8081")
public interface StoreClient {

	@GetMapping("/meteo/getAllSavedWeathers")
	List<MeteoModel> getAll();
	
}
