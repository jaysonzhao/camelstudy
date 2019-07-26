package com.redhat.gpte.camel.test;

import static org.junit.Assert.*;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCamelContextXmlTest extends CamelSpringTestSupport {

	@Test
	public void testCamelRoute() throws Exception {

		// Define some expectations

		// For now, let's just wait for some messages// TODO Add some expectations here

		// Validate our expectations
		assertMockEndpointsSatisfied();
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext(
				"camel-typeconverter/src/main/resources/META-INF/spring/spring-camel-context.xml");
	}

}
