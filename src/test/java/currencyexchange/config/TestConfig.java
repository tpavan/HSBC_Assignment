package currencyexchange.config;

import currencyexchange.domain.currencyExchange.LatestCurrencyExchRates;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.util.Properties;

public class TestConfig implements GlobalMembers {

    {
        RestAssured.baseURI = "https://api.ratesapi.io/api/";
    }

    @Test
    public void loadProperties() throws Exception {
        FileReader reader = new FileReader("");
        Properties properties = new Properties();
    }

    @Test
    public void apiBaseConnfig() {
        RestAssured.get("latest").getBody();
        LatestCurrencyExchRates latestCurrencyExchRates = gson.fromJson(RestAssured.get("2010-01-12").getBody().print(), LatestCurrencyExchRates.class);
        System.out.println(latestCurrencyExchRates.getDate());
    }

}
