package com.hongye.web.controller;

import com.google.common.collect.Lists;
import com.hongye.domain.city.City;
import com.hongye.service.city.CitySearchCriteria;
import com.hongye.service.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
public class SampleController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/get")
    @ResponseBody
    @Transactional(readOnly = true)
    public List<City> getCity(String name) {
        CitySearchCriteria criteria = new CitySearchCriteria(name);
        return Lists.newArrayList(this.cityService.findCities(criteria, null).iterator());
    }

    @RequestMapping("/all")
    @ResponseBody
    @Transactional(readOnly = true)
    public List<City> all() {
        return cityService.cityAll();
    }


}
