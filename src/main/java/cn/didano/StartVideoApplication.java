/*
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

package cn.didano;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * 启动程序
 * 必须放在根部目录，放到低级目录，将导致很多注释解析不了
 * @TODO 缓存容器没加上，目前只能做到使用spring cache查单个，而且list没有加上，需要更多了解spring cache细节，同时，将来采用redis可能还会大变
 * @TODO 操作记录，一律写日志，不写入库，优化数据库速度，将来采用相关大数据技术做统计
 * @author stephen
 * Created on 2016年12月25日 上午11:48:46 
 */
//@ServletComponentScan
//Configures component scanning directives for use with @{@link Configuration} classes.
//@EnableConfigurationProperties({OssInfo.class})
//@SpringBootApplication(scanBasePackages="cn.didano")//Base packages to scan for annotated components. Use {@link #scanBasePackageClasses}

@SpringBootApplication
@ServletComponentScan //配置websocket必须
@ComponentScan({"cn.didano"})
@EnableCaching
@EnableMongoAuditing
public class StartVideoApplication {
	static Logger logger = Logger.getLogger(StartVideoApplication.class);
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx =  SpringApplication.run(StartVideoApplication.class, args);
		//ApplicationContext ctx = SpringApplication.run(Application.class, args);
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for (String beanName : beanNames) {
//		    System.out.println(beanName);
//		}
        logger.info("StartVideoApplication Started.............................");
	}

}
