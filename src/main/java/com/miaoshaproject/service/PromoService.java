package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

public interface PromoService {
    //获取商品对应的即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
