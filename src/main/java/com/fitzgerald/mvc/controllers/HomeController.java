package com.fitzgerald.mvc.controllers;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fitzgerald.mvc.constant.Currency;
import com.fitzgerald.mvc.models.Coins.CoinFullData;
import com.fitzgerald.mvc.models.Coins.CoinList;
import com.fitzgerald.mvc.models.Global.Global;
import com.fitzgerald.mvc.models.Global.GlobalData;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import com.fitzgerald.mvc.repositories.CoinGeckoApiClient;
import com.fitzgerald.mvc.repositories.CoinGeckoApiClientImpl;

import retrofit2.Call;


@Controller
public class HomeController {
	
	
	@GetMapping("/dashboard")
	public String getOneCoin(Model model) {

    CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

   
    Map<String, Map<String, Double>> cardanoPrice = client.getPrice("cardano",Currency.USD, true, true, false, false);
    double adaPrice = cardanoPrice.get("cardano").get(Currency.USD);
    
    System.out.println(cardanoPrice);
    
    
    
    Double cardanoMarketCap = cardanoPrice.get("cardano").get("usd_market_cap");
    
    String adaCap = new BigDecimal(cardanoMarketCap).toPlainString();
    double adaMarketCap = Double.parseDouble(adaCap);
    DecimalFormat formatAdaCap = new DecimalFormat("#,###");
    
    String prettyAdaMarketCap = formatAdaCap.format(adaMarketCap);
    System.out.println(formatAdaCap.format(adaMarketCap));
    
    
    
    Double cardano24hVol = cardanoPrice.get("cardano").get("usd_24h_vol");
    
    String ada24h = new BigDecimal(cardano24hVol).toPlainString();
    double ada24hVol = Double.parseDouble(ada24h);
    DecimalFormat formatAda24h = new DecimalFormat("#,###");
    
    String prettyAda24hVol = formatAda24h.format(ada24hVol);
    System.out.println(formatAda24h.format(ada24hVol));
    
    
    model.addAttribute("adaPrice", adaPrice);
    model.addAttribute("prettyAdaMarketCap", prettyAdaMarketCap);
    model.addAttribute("prettyAda24hVol", prettyAda24hVol);
    
    System.out.println(adaPrice);
    System.out.println(prettyAdaMarketCap);
    System.out.println(prettyAda24hVol);
    
    
    Map<String, Map<String, Double>> ethereumPrice = client.getPrice("ethereum",Currency.USD, true, true, false, false);
    double ethPrice = ethereumPrice.get("ethereum").get(Currency.USD);
    
    System.out.println(ethereumPrice);
    
    
    
    Double ethereumMarketCap = ethereumPrice.get("ethereum").get("usd_market_cap");
    
    String ethCap = new BigDecimal(ethereumMarketCap).toPlainString();
    double ethMarketCap = Double.parseDouble(ethCap);
    DecimalFormat formatEthCap = new DecimalFormat("#,###");
    
    String prettyEthMarketCap = formatEthCap.format(ethMarketCap);
    System.out.println(formatEthCap.format(ethMarketCap));
    
    
    
    Double ethereum24hVol = ethereumPrice.get("ethereum").get("usd_24h_vol");
    
    String eth24h = new BigDecimal(ethereum24hVol).toPlainString();
    double eth24hVol = Double.parseDouble(eth24h);
    DecimalFormat formatEth24h = new DecimalFormat("#,###");
    
    String prettyEth24hVol = formatEth24h.format(eth24hVol);
    System.out.println(formatEth24h.format(eth24hVol));
    
    
    model.addAttribute("ethPrice", ethPrice);
    model.addAttribute("prettyEthMarketCap", prettyEthMarketCap);
    model.addAttribute("prettyEth24hVol", prettyEth24hVol);
    
    System.out.println(ethPrice);
    System.out.println(prettyEthMarketCap);
    System.out.println(prettyEth24hVol);
    
    

    Global global = client.getGlobal();

    System.out.println(global);

    long totalMarkets = global.getData().getMarkets();
    long totalActiveCryptoCurrencies = global.getData().getActiveCryptocurrencies();
    Map<String, Double> globalMarketCapPercentage = global.getData().getMarketCapPercentage();
    
    model.addAttribute("totalMarkets", totalMarkets);
    model.addAttribute("totalActiveCryptoCurrencies", totalActiveCryptoCurrencies);
    
    
		
    System.out.println(totalMarkets);
    System.out.println(globalMarketCapPercentage);
    System.out.println(totalActiveCryptoCurrencies);
    
    
    
    return "landing.jsp";
	}
}


