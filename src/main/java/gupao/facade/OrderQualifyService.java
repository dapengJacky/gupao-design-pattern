package gupao.facade;

import gupao.facade.exception.CommonException;

/**
 * @author peng.chen12@hand-china.com
 * @description 生成订单前校验
 * 校验积分和库存
 * @date 2020/3/5
 */
public class OrderQualifyService {

    public boolean qualifyScoreAndInv(GiftInfo info){
        User user = new User();
        if(info.getInv()<=0 ){
            throw new CommonException("库存不足");
        }else if(info.getScore()>user.getScore()){
            throw new CommonException("用户积分不足");
        }else{
            System.out.println("校验"+info.getName()+"成功，"+"提交订单成功，请支付！！");
            return true;
        }
    }
}
