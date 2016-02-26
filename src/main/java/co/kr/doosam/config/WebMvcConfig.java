package co.kr.doosam.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebMvcConfig extends WebMvcAutoConfigurationAdapter{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/resources/").addResourceLocations("/resources/**");
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
    /**
     * 인터셉터 추가
     
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new CorsInterceptor());
    }
    */
}
