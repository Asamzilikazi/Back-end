package za.ac.mzilikazi.Factory;

import za.ac.mzilikazi.Domain.Coupon;

import java.util.Date;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class CouponFactory {
    public static Coupon getCoupon (Map<String, String> values, Date dateOfRedemption)
    {
        Coupon coupon = new Coupon.Builder()
                .couponID(values.get("couponID"))
                .dateOfRedemption(dateOfRedemption)
                .flightClass(values.get("flightClass"))
                .standby(values.get("standby"))
                .mealCode(values.get("mealCode"))
                .build();
        return coupon;
    }
}
