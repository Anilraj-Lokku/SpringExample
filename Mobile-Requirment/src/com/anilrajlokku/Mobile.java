package com.anilrajlokku;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile {
    private String referenceId;
    private String modelName;
    private Double displaySize;
    private Double price;
    private Date launchedDate;

    public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
        this.referenceId = referenceId;
        this.modelName = modelName;
        this.displaySize = displaySize;
        this.price = price;
        this.launchedDate = launchedDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("Reference Id: %s\nModel Name: %s\nDisplay Size: %.1f\nPrice: %.1f\nLaunched Date: %s",
                referenceId, modelName, displaySize, price, dateFormat.format(launchedDate));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mobile mobile = (Mobile) obj;
        return referenceId.equalsIgnoreCase(mobile.referenceId) &&
               modelName.equalsIgnoreCase(mobile.modelName);
    }

    @Override
    public int hashCode() {
        return referenceId.toUpperCase().hashCode() + modelName.toUpperCase().hashCode();
    }
}
