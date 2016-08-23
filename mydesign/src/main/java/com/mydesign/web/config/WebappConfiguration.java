package com.mydesign.web.config;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@Configuration
@ComponentScan(basePackages={"com.mydesign"})
@EnableWebMvc
@EnableTransactionManagement
public class WebappConfiguration extends WebMvcConfigurerAdapter  {
	
	
	@Override
    public void configureMessageConverters( List<HttpMessageConverter<?>> converters ) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }
	
	@Bean
	public PlatformTransactionManager txManger(){
		return new HibernateTransactionManager(sessionFactory().getObject());
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(dataSource());
	      sessionFactory.setPackagesToScan(new String[] {"com.mydesign.business.eshop.entity"});
	      sessionFactory.setHibernateProperties(hibernateProperties());
	      return sessionFactory;
	}
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		//dataSource.setUrl("jdbc:hsqldb:hsql://localhost");
		//dataSource.setUsername("sa");
		//dataSource.setPassword("");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydesign_new");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	
	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(sessionFactory().getObject());
	    return ht;
	 }

	
	private Properties hibernateProperties() {
		Properties p = new Properties();
		// p.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
       //  p.put("hibernate.hbm2ddl.auto", "create-drop");
         //p.put("hibernate.show_sql", true);
		 p.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	     p.put("hibernate.hbm2ddl.auto", "update");
	     p.put("hibernate.show_sql", true);
	     return p;
	 }
	
	
}
