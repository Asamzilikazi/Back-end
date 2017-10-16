package za.ac.mzilikazi.Repository.Impl;

import za.ac.mzilikazi.Domain.Coupon;
import za.ac.mzilikazi.Repository.CouponRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/14.
 */
public class CouponRepositoryImpl implements CouponRepository {
    public static CouponRepositoryImpl couponRepository = null;

    private Map<String, Coupon> couponMap;

    private CouponRepositoryImpl(){
        couponMap = new HashMap<String, Coupon>();
    }

    public static CouponRepositoryImpl getInstance()
    {
        if(couponRepository == null)
            couponRepository = new CouponRepositoryImpl();
        return couponRepository;
    }

    public Coupon save (Coupon coupon){
        couponMap.put(coupon.getCouponID(),coupon);
        Coupon saveCoupon = couponMap.get(coupon.getCouponID());
        return saveCoupon;
    }

    public Coupon findById (String couponID){
        Coupon readCoupon = couponMap.get(couponID);
        return readCoupon;
    }

    public Coupon update (Coupon coupon){
        couponMap.put(coupon.getCouponID(),coupon);
        Coupon updateCoupon = couponMap.get(coupon.getCouponID());
        return updateCoupon;
    }

    public void delete (String couponID){
        couponMap.remove(couponID);


    }

}
