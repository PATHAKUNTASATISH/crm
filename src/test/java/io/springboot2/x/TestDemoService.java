package io.springboot2.x;

import org.junit.Assert;
import org.junit.Test;

import io.springboot2.x.service.DemoService;

public class TestDemoService {

	@Test
	public void test() {
	 DemoService service=new DemoService();
	 Assert.assertEquals("hello", service.sayHi());
	}
    
}
