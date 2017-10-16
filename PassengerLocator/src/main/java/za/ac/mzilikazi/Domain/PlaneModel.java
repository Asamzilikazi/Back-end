package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import java.io.Serializable;

public class PlaneModel implements Serializable {

    private int planeID;
    private String description;


    public PlaneModel()
    {

    }

    public PlaneModel(Builder builder) {

        this.planeID = builder.planeID;
        this.description = builder.description;

    }
    public static class Builder {

        private int planeID;
        private String description;


        public Builder planeID(int value) {
            this.planeID = value;
            return this;
        }

        public Builder description(String value) {
            this.description = value;
            return this;
        }


        public PlaneModel build(){

            return new PlaneModel(this);
        }
    }

    public int getPlaneID() {
        return planeID;
    }

    public String getDescription() {
        return description;
    }





}
