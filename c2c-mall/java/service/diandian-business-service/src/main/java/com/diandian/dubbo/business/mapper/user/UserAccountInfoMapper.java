package com.diandian.dubbo.business.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.diandian.dubbo.facade.model.merchant.MerchantAccountInfoModel;
import com.diandian.dubbo.facade.model.user.UserAccountInfoModel;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;


/**
 * 商户帐户信息表
 *
 * @author wbc
 * @date 2019/02/18
 */
public interface UserAccountInfoMapper extends BaseMapper<UserAccountInfoModel> {

    UserAccountInfoModel getByShopId(@Param("shopId")Long shopId);

}
