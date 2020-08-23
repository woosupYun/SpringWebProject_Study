package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class SampleTests {

	@Setter(onMethod_= {@Autowired})
	private Restaurant restaurant;
	
	@Setter(onMethod_= {@Autowired})
	private Chef chef;
	
	@Test
	public void testExist() {
		assertNotNull(chef);
		assertNotNull(restaurant);
		assertNotNull(restaurant.getChef());
		
		log.info("info");
		log.warn("warn");
		log.debug("debug");
		log.error("error");
		log.fatal("fatal");
	}

}
