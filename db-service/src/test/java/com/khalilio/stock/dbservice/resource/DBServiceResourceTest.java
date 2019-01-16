package com.khalilio.stock.dbservice.resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
public class DBServiceResourceTest {

    private MockMvc mockMvc;

    @InjectMocks
    private DBServiceResource dbServiceResource;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(dbServiceResource)
                .build();
    }

    @Test
    public void getQuotes() {

    }

    @Test
    public void add() {
    }

    @Test
    public void delete() {
    }
}