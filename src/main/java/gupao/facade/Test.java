package gupao.facade;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class Test {

    public static void main(String[] args) {

        GiftInfo giftInfo = new GiftInfo("《Spring5核心原理》");
        GiftFacadeService facadeService = new GiftFacadeService();
        facadeService.exchange(giftInfo);
    }
}
