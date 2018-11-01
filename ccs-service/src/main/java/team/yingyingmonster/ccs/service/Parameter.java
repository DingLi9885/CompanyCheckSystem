package team.yingyingmonster.ccs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import team.yingyingmonster.ccs.database.bean.ConfigBean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 8:21 2018/11/1
 * - 用于储存从数据库中取出的各个数据。
 **/
@Component
@Scope("singleton")
public class Parameter {
    // TODO: 等待后台完成设置管理，然后继续编写。
//    @Autowired
//    private ConfigMapper configMapper;
    private Map<String, ConfigBean> configMap;

    /**
     * 初始化配置类。
     */
    public void init() {
        configMap = new HashMap<>();
        this.loadConfig();
    }

    /**
     * 从数据库中取出所有配置项，并以键值对的形式存入map中（configName为key，configBean为value）。
     */
    private void loadConfig() {
        // TODO: 等待后台完成设置管理，然后继续编写。
        // List<ConfigBean> list = configMapper.selectAllConfig();
    }

    /**
     * 取出一个配置Bean。
     * @param key Bean的name。
     * @return ConfigBean对象。
     */
    public ConfigBean getConfig(String key) {
        if (this.configMap == null)
            this.init();

        return configMap.get(key);
    }

    /**
     * 取出一个配置的值，如果不存在，则返回一个默认值。
     * @param key Bean的Name。
     * @param defaultValue 默认值，当key所对应的ConfigBean不存在时，返回该值。
     * @return 该配置项的值。
     */
    public String getConfigValue(String key, String defaultValue) {
        ConfigBean config = this.getConfig(key);
        return config==null?defaultValue:config.getConfigValue();
    }
}
