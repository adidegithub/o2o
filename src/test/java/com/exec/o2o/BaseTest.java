package com.exec.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置junit和spring的整合，junit启动时，加载springIOC容器
 * @author Administrator
 *
 */
//Runwith是一个运行器，@RunWith(SpringJUnit4ClassRunner),让测试运行于spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//告诉juint spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
	
}
