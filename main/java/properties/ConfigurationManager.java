package properties;

public class ConfigurationManager {
	
	public static PropertyConfig getConfig() {
		return new PropertyReader().getConfig();
	}

}
