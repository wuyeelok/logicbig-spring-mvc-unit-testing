package hk.gov.ogcio.esip.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.logicbig.example.MyWebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = MyWebConfig.class)
public class ConfigUtilServiceTest {

	@Autowired
	ConfigUtilService configUtilService;

	@Test
	public void getSpringDispatcherURLPatternTest() {
		String expected = "";
		String actual = configUtilService.getSpringDispatcherURLPattern();
		assertEquals(expected, actual);
	}

	@Test
	public void getJunctionPathTestForLocalDev() {
		String expected = "";
		String actual = configUtilService.getJunctionPath();
		assertEquals(expected, actual);
	}

}
