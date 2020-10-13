package currencyexchange.flows;

import currencyexchange.config.APIUtil;
import currencyexchange.domain.currencyExchange.CurrencyExchRates;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class CurrencyExchangeFlows extends APIUtil {

    public CurrencyExchRates getLatestCurrencyExchangeRatesMapper() {
        return getLatestCurrencyExchangeRatesMapper(CurrencyExchRates.class);
    }

    public Response getLatestCurrencyExchangeRates() {
        return getLatestCurrencyExchangeRate();
    }

    public CurrencyExchRates getHistoricCurrencyExchangeRatesMapper(String date){
         return getHistoricCurrencyExchangeRatesMapper(date,CurrencyExchRates.class);
    }

    public ResponseBody getHistoricCurrencyExchangeRates(String date){
        return getHistoricCurrencyExchangeRate(date);

    }
}
