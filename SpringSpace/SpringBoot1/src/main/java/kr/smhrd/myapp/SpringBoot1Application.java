package kr.smhrd.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// @SpringBootApplication이 가지고 있는 내용 중 주요 어노테이션

// @SpringBootConfiguration	: boot에 대한 기본적인 설정들을 담고 있는 어노테이션
// @EnableAutoConfiguration	: 우리가 추가한 라이브러리들, 의존성을 관리하는, 설정하는 어노테이션
// @ComponentScan	: component를 스캔 해주는 어노테이션(@mapper,@controller,@restController,@service)
// 사용할 컴포넌트의 위치를 반드시 myapp 하위 경로로 생성해야 한다
// -> kr.smhrd.controller --> kr.smhrd.myapp.controller(mapper)

//@SpringBootApplication( exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

}
