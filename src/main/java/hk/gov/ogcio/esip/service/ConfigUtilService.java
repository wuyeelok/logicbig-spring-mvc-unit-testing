package hk.gov.ogcio.esip.service;

import java.util.Objects;
import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

@Service
public class ConfigUtilService {

	public String getSpringDispatcherURLPattern() {
		String urlPattern = "";
		ResourceBundle rb = null;

		try {
			rb = ResourceBundle.getBundle("hk/gov/ogcio/esip/config/SpringConfig");
			if (rb != null) {
				urlPattern = Objects.toString(rb.getString("DispatcherServletUrlPattern"), "");

				if ("/".equals(urlPattern) || urlPattern.startsWith("*.")) {
					urlPattern = "";
				} else if (urlPattern.endsWith("/*")) {
					urlPattern = urlPattern.substring(0, urlPattern.length() - 2);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return urlPattern;
	}

	public String getJunctionPath() {
		String junctionPath = "";
		ResourceBundle rb = null;

		try {
			rb = ResourceBundle.getBundle("hk/gov/ogcio/esip/config/JunctionConfig");
			if (rb != null) {
				junctionPath = Objects.toString(rb.getString("junction.path"), "");
				if ("/".equals(junctionPath) || "${pom.junction.path}".equals(junctionPath)) {
					junctionPath = "";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return junctionPath;
	}
}
