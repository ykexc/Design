package config;

public class ConfigService {


    public String limit;

    public ConfigService(String limit) {
        this.limit = limit;
    }

    public String[] split(String sc) {
        return this.limit.split(sc);
    }

}
