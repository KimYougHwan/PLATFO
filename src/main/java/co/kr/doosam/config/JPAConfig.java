package co.kr.doosam.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JPAConfig {
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        
        RootConfig rootConfig = new RootConfig();
        
        em.setDataSource(rootConfig.dataSource());
        em.setPackagesToScan("co.kr.doosam.data");
 
        // persistence 설정
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.show_sql", "true");
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
}
