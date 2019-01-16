package com.khalilio.stock.stockservice2.resource;

import org.patriques.AlphaVantageConnector;
import org.patriques.BatchStockQuotes;
import org.patriques.output.quote.BatchStockQuotesResponse;
import org.patriques.output.quote.data.StockQuote;
import org.patriques.output.timeseries.data.StockData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StockResource {
    String apiKey = "NVL4S7TARQ26IY5S";
    int timeout = 3000;

    @Autowired
    RestTemplate restTemplate;

    AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);

    BatchStockQuotesResponse response = BatchStockQuotesResponse(parameters -> json);

    @GetMapping("/{username}")
    public List<StockData> stockData(@PathVariable("username") final String username){

        ResponseEntity<List<String>> quoteResponse = restTemplate.exchange("http:localhost:8030/rest/db/" + username, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<String>>() {
                });
                List<String> quotes = quoteResponse.getBody();
                return quotes
                        .stream()
                        .map(quote ->
                        {
                            try {
                                StockQuote
                            }
                        })
    }


}
