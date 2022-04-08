package properties;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;

public class JsonReader implements IConfigReader{

	@SneakyThrows
	@Override
	public JsonConfig getConfig() {
		
		JsonConfig jsonConfig = new ObjectMapper()
				.readValue(new File(System.getProperty("user.dir")+"/src/test/resource/config/config.json"), JsonConfig.class);
		return jsonConfig ;
	}
	
	

}
