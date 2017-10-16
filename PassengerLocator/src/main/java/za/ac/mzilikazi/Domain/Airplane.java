package za.ac.mzilikazi.Domain;

/**
 * Created by Asavela on 2017/08/08.
 */
import java.io.Serializable;

public class Airplane implements Serializable {

    private String registrationNumber;
    private String beginOfOperation;
    private String status;


    public Airplane()
    {

    }

    public Airplane(Builder builder) {

        this.registrationNumber = builder.registrationNumber;
        this.beginOfOperation = builder.beginOfOperation;
        this.status = builder.status;

    }
    public static class Builder {

        private String registrationNumber;
        private String beginOfOperation;
        private String status;

        public Builder registrationNumber(String value) {
            this.registrationNumber = value;
            return this;
        }

        public Builder beginOfOperation(String value) {
            this.beginOfOperation = value;
            return this;
        }

        public Builder status(String value) {
            this.status = value;
            return this;
        }



        public Airplane build(){

            return new Airplane(this);
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBeginOfOperation() {
        return beginOfOperation;
    }

    public String getStatus() {
        return status;
    }





}

