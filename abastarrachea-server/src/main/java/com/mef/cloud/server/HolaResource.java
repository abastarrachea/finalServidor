package com.mef.cloud.server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/user/server")
public class HolaResource {
	
	@GetMapping
	@RequestMapping ("/{id}")
	public String getName(@PathVariable("id") String id) {
		String result = "";
		/*if(!id.equals("")){
			result = "HOLA, disculpa tu ";
		} else if(id.equals("2")){
			result = "ALE";
		} else {
			result = "ID not exists";
		}*/
		return "Hola " + id + "";
	}
}
