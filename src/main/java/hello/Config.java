package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {

    private String id;
    private String configuration;
    private String confKey;
    
    private String confValue;

    public Config() {
    } 

    @Override
    public String toString() {
        return "Config{" +
                "id='" + id + '\'' +
                ", value=" + confKey +
                '}';
    }

	public String getConfValue() {
		return confValue;
	}

	public void setConfValue(String confValue) {
		this.confValue = confValue;
	}

	public String getConfKey() {
		return confKey;
	}

	public void setConfKey(String confKey) {
		this.confKey = confKey;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
