package com.khalilio.stock.dbservice.repository;

import com.khalilio.stock.dbservice.model.Quote;
import com.khalilio.stock.dbservice.model.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByUserName(String username);

    List<Quotes> delete(List<Quote> quotes);
}
