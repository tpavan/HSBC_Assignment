package currencyexchange.domain.currencyExchange;

import com.google.gson.annotations.SerializedName;

public class CurrencyExchRates{

	@SerializedName("date")
	private String date;

	@SerializedName("rates")
	private Rates rates;

	@SerializedName("base")
	private String base;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setRates(Rates rates){
		this.rates = rates;
	}

	public Rates getRates(){
		return rates;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}

	@Override
 	public String toString(){
		return 
			"LatestCurrencyExchRates{" + 
			"date = '" + date + '\'' + 
			",rates = '" + rates + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}