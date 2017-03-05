/*
 * Copyright 2012-2015 the original author or authors.
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

package cn.didano.robot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.didano.robot.data.repository.RVersionInfoRepository;

@SpringBootApplication
public class SampleMongoApplication implements CommandLineRunner {

	@Autowired
	private RVersionInfoRepository repository;

	@Override
	public void run(String... args) throws Exception {
		//this.repository.deleteAll();
		RVersionInfo a1 = new RVersionInfo();
		// save a couple of customers
//		this.repository.save(new Customer("Alice", "Smith"));
//		this.repository.save(new Customer("Bob", "Smith"));
		this.repository.save(a1);
		// fetch all customers
		
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleMongoApplication.class, args);
	}

}
