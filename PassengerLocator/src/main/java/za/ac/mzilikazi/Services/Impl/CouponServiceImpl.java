package za.ac.mzilikazi.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mzilikazi.Domain.Coupon;
import za.ac.mzilikazi.Repository.Impl.CouponRepositoryImpl;
import za.ac.mzilikazi.Services.CouponService;

/**
 * Created by Asavela on 2017/08/10.
 */
@Service
public class CouponServiceImpl implements CouponService {

    public static CouponServiceImpl couponService = null;

    @Autowired
    CouponRepositoryImpl couponRepository = CouponRepositoryImpl.getInstance();

    public static CouponServiceImpl getInstance()
    {
        if (couponService == null)
            couponService = new CouponServiceImpl();
        return couponService;
    }

    public Coupon save(Coupon coupon){
        return couponRepository.save(coupon);    }

    public Coupon findById(String couponID){
        return couponRepository.findById(couponID);    }

    public Coupon update(Coupon coupon){
        return couponRepository.update(coupon);    }

    public void delete(String couponID)
    {
        couponRepository.delete(couponID);
    }

}
