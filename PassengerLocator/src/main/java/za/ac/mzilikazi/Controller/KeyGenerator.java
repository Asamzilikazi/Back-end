package za.ac.mzilikazi.Controller;

import java.util.UUID;

/**
 * Created by Asavela on 2017/09/07.
 */
public class KeyGenerator {
    public static String getEntityId() {
        return UUID.randomUUID().toString();
    }
}
