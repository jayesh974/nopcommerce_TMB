package properties;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resource/config/config.properties")
public interface PropertyConfig extends Config, IFrameworkConfig {
	
	String baseURL();
	String useremail();
	
	@DefaultValue("admin")
	String password();

}
