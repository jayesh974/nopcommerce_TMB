package properties;

import org.aeonbits.owner.ConfigFactory;

import lombok.SneakyThrows;

public class PropertyReader implements IConfigReader {

	@SneakyThrows
	@Override
	public PropertyConfig getConfig() {
		
		PropertyConfig propertyConfig = ConfigFactory.create(PropertyConfig.class);
		return propertyConfig;
		

		
	}
	
	
	

}
