package co.kr.doosam.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages ="co.kr.dataRepository", entityManagerFactoryRef="entityManagerFactoryBean")
public class JPAConfig {
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        
        //RootConfig rootConfig = new RootConfig();
        em.setDataSource(dataSource());
        em.setPackagesToScan("co.kr.doosam.data");
 
        // persistence 설정
        Properties properties = new Properties();
        //properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
        //properties.setProperty("hibernate.naming-strategy", "org.hibernate.cfg.DefaultNamingStrategy");
        
        properties.setProperty("eclipselink.logging.level", "FINE");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
 
        // 각 구현체의 프로퍼티 확장 및 설정
        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(jpaVendorAdapter);
        em.setJpaProperties(properties);
        return em;
    }
	
    // Transaction 설정
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }
    
    @Bean(destroyMethod="close")
	public DataSource dataSource(){
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://175.198.36.131:3306/hmc");
		datasource.setUsername("hmcuser");
		datasource.setPassword("hmcuser!120");
		datasource.setInitialSize(200);
		datasource.setMaxTotal(200);
		datasource.setMaxIdle(200);
		datasource.setMaxWaitMillis(7000);
		datasource.setRemoveAbandonedTimeout(5);
		datasource.setRemoveAbandonedOnBorrow(true);
		datasource.setRemoveAbandonedOnMaintenance(true);
		datasource.setDefaultAutoCommit(true);
		 
		return datasource;
	}
}
