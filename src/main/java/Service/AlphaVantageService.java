package Service;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

//@Service
public class AlphaVantageService {
	private final String API_KEY="5EIV3GDU4XRJYZ0A";
	private final String BASE_URL ="https://www.alphavantage.co/query";
	
	
	public String getStockInformation(String symbol, String exchange)
	{
		String fullSymbol = symbol + "."+ exchange;
//		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
//				.queryParam("function" , "TIME_SERIES_DAILY")
//				.queryParam("symbol", fullSymbol)
//				.queryParam("apikey", API_KEY)
//				.toUriString();
		
		return "";
	}
	
	
}
