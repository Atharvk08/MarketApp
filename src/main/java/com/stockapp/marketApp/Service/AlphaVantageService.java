package com.stockapp.marketApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AlphaVantageService {
	private final String API_KEY="5EIV3GDU4XRJYZ0A";

//	private final String API_KEY="demo";
	
	private final String BASE_URL ="https://www.alphavantage.co/query";
	
	private final RestTemplate restTemplate;

	    @Autowired
	    public AlphaVantageService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }
	
	public String getStockInformation(String symbol, String exchange)
	{
		String s= "function=TIME_SERIES_DAILY&symbol=IBM&apikey=demo";
		
		String fullSymbol = symbol + "."+ exchange;
		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.queryParam("function" , "TIME_SERIES_DAILY")
				.queryParam("symbol", fullSymbol)
				.queryParam("outputsize", "full")
				.queryParam("apikey", API_KEY)
				.toUriString();
		
		return restTemplate.getForObject(url, String.class) ;
	}

	public String getStockInformation(String symbol) {
		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.queryParam("function" , "TIME_SERIES_DAILY")
				.queryParam("symbol", symbol)
				.queryParam("apikey", API_KEY)
				.toUriString();
		
		return restTemplate.getForObject(url, String.class) ;
	}
	
	
}
