package com.stockapp.marketApp.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stockapp.marketApp.Service.AlphaVantageService;

@RestController
@RequestMapping("api/v1/")
public class StockController {
	
	private final String NSE_EXCHANGE= "BSE";
	
	@Autowired
	private AlphaVantageService alphaVantageService;
	
	@GetMapping("stock")
	public String getStock(@RequestParam String symbol)
	{
		return alphaVantageService.getStockInformation(symbol, NSE_EXCHANGE);
	}
	
	@GetMapping("us-stock")
	public String getUSStock(@RequestParam String symbol)
	{
		return alphaVantageService.getStockInformation(symbol);
	}
	
	
	@GetMapping("hello")
	public String getHelloWorld()
	{
//		return alphaVantageService.getStockInformation(symbol, NSE_EXCHANGE);
		return "Hello world";
	}
	
}
