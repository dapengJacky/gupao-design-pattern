package gupao.decorator.logger;

import org.slf4j.Logger;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class Test {
    private static final Logger logger = JsonLoggerFactory.getLooger(Test.class);

    public static void main(String[] args) {
        logger.error("系统错误");
        logger.info("step back");
    }
}
