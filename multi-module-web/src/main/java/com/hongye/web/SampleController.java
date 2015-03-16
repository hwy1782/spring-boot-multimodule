/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hongye.web;

import com.google.common.collect.Lists;
import com.hongye.domain.City;
import com.hongye.service.CitySearchCriteria;
import com.hongye.service.CityService;
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
	public List<City> helloWorld(String name) {
		CitySearchCriteria criteria = new CitySearchCriteria(name);
		return Lists.newArrayList(this.cityService.findCities(criteria, null).iterator());
	}


}
