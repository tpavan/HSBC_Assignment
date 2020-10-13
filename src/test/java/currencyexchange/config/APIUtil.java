package currencyexchange.config;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import java.io.FileReader;
import java.util.Properties;

public class APIUtil implements GlobalMembers {

    {
        RestAssured.baseURI = "https://api.ratesapi.io/api/";
    }

    public void loadProperties() throws Exception {
        FileReader reader = new FileReader("");
        Properties properties = new Properties();
    }

    public <T> T  getLatestCurrencyExchangeRatesMapper(Class<T> T) {
        return gson.fromJson(RestAssured.get().getBody().print(), T);
    }

    public Response getLatestCurrencyExchangeRate() {
        return RestAssured
                .get("latest");
    }

    public <T> T  getHistoricCurrencyExchangeRatesMapper(String date,Class<T> T) {
        return gson.fromJson(RestAssured.get(date).getBody().print(), T);
    }

    public ResponseBody getHistoricCurrencyExchangeRate(String date) {
        return RestAssured
                .get(date)
                .getBody();
    }
}
