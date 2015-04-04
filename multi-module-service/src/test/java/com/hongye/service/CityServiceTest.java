package com.hongye.service;


import com.hongye.domain.city.City;
import com.hongye.service.city.CityService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServiceApplication.class)
public class CityServiceTest {

    @Autowired
    CityService cityService;

    @Test
    public void testGetCity() throws Exception {
        City city = cityService.getCity("Brisbane", "Australia");
        Assert.assertNotNull(city);
        Assert.assertEquals(city.getName(), "Brisbane");
        Assert.assertEquals(city.getCountry(), "Australia");
    }
}