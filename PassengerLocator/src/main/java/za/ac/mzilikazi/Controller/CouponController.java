package za.ac.mzilikazi.Controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.ac.mzilikazi.Domain.Coupon;
import za.ac.mzilikazi.Factory.CouponFactory;
import za.ac.mzilikazi.Services.Impl.CouponServiceImpl;

import java.util.Date;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/15.
 */

@Controller
@RequestMapping(path = "/PassangerLocator")
public class CouponController {
    @Autowired
    private CouponServiceImpl couponService;

    @GetMapping(path = "/addCoupon/{couponID}/{dateOfRedemption}/{flightClass}/{standby}/{mealCode}")
    public @ResponseBody
    String addCoupon(@PathVariable Map<String, String> values, Date dateOfRedemption){
        Coupon coupon = CouponFactory.getCoupon(values, dateOfRedemption);
        couponService.save(coupon);
        return new Gson().toJson(coupon);
    }

    @GetMapping(path="/readCoupon/{couponID}/{dateOfRedemption}/{flightClass}/{standby}/{mealCode}")
    public @ResponseBody String readCoupon(@PathVariable String couponID )
    {
        Coupon coupon = couponService.findById(couponID);
        return new Gson().toJson(coupon);
    }

    @GetMapping(path = "/updateCoupon/{couponID}/{dateOfRedemption}/{flightClass}/{standby}/{mealCode}")
    public @ResponseBody String updateAdmin(@PathVariable Map<String, String> values, Date dateOfRedemption, String couponID)
    {
        Coupon coupon = couponService.findById(couponID);

        if(coupon == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Coupon couponInsert = CouponFactory.getCoupon(values, dateOfRedemption);
        couponService.update(couponInsert);
        return new Gson().toJson(couponInsert);
    }

    @GetMapping(path = "deleteCoupon/{couponID}")
    public @ResponseBody void deleteCoupon(@PathVariable String couponID) {
        Coupon coupon = couponService.findById(couponID);
        if (coupon == null) {
            System.out.println("Record does not exist");
        } else {
            couponService.delete(couponID);
            System.out.println("Record deleted");
        }
    }
}
