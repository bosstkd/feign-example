package com.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.feign.models.*;
import com.feign.services.StoreClient;

@RestController
@RequestMapping("/callfeign")
public class CallFeignController {

	@Autowired
	private StoreClient storeClient;
	
	@GetMapping("/getAll")
	public List<MeteoModel> getAll(){
		return storeClient.getAll();
	}
	
}
