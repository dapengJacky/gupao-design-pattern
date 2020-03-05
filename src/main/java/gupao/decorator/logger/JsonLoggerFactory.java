package gupao.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class JsonLoggerFactory {

    public static Logger getLooger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
