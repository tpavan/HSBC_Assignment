package currencyexchange.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import currencyexchange.config.GlobalMembers;
import currencyexchange.domain.currencyExchange.CurrencyExchRates;
import currencyexchange.flows.CurrencyExchangeFlows;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LatestCurrencyExchange {

    private CurrencyExchangeFlows currencyExchangeFlows = new CurrencyExchangeFlows();
    private Response response = null;
    private CurrencyExchRates latestCurrencyExchRates = null;
    private SoftAssert softAssert = new SoftAssert();

    @Given("Rates API for Latest Foreign Exchange rates")
    public void configureCurrencyAPI(){

    }

    @When("The API is available")
    public void validateCurrencyExchangeServiceIsWorking(){
        response = currencyExchangeFlows.getLatestCurrencyExchangeRates();
        softAssert.assertTrue(response.getStatusCode() == GlobalMembers.OKStatusCode,"Currency exchange service is not working");
        softAssert.assertTrue(response.getBody().jsonPath().get("base").equals("EUR"),"Currency exchange base is EUR");
        softAssert.assertAll();
    }

    @Then("An automated test suite should run which will assert the success status of the response")
    public void validateCurrencyExchangeRateForINR(){
        response = currencyExchangeFlows.getLatestCurrencyExchangeRates();
        softAssert.assertTrue(response.getStatusCode() == GlobalMembers.OKStatusCode,"Currency exchange service is not working");
        softAssert.assertTrue(response.getBody().jsonPath().get("rates.INR").equals("86.476"),"Currency exchange rate for INR is not present");
        softAssert.assertAll();
    }

    @Test
    public void validateCurrencyExchageForPKRNnotPresent(){
        response = currencyExchangeFlows.getLatestCurrencyExchangeRates();
        softAssert.assertTrue(response.getStatusCode() == GlobalMembers.OKStatusCode,"Currency exchange service is not working");
        softAssert.assertTrue(response.getBody().jsonPath().get("rates.PKR") == null,"Currency exchange rate for PKR is present");
        softAssert.assertAll();
    }
}
