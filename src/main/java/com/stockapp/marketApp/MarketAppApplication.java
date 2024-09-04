package com.stockapp.marketApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.stockapp.marketApp.Controller.StockController;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.stockapp.marketApp.Service", 
		"com.stockapp.marketApp.Controller", 
		"com.stockapp.marketApp.Configuration",
		"com.stockapp.marketApp.Model", 
		"com.stockapp.marketApp.Repository" })
//@ComponentScan(basePackageClasses = StockController.class)
public class MarketAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketAppApplication.class, args);
	}

}
