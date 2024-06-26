import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile {
    private String referenceId;
    private String modelName;
    private Double displaySize;
    private Double price;
    private Date launchedDate;

    public Mobile() {
    }
    public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
        this.referenceId = referenceId;
        this.modelName = modelName;
        this.displaySize = displaySize;
        this.price = price;
        this.launchedDate = launchedDate;
    }
    public String getReferenceId() {
        return referenceId;
    }
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public Double getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Date getLaunchedDate() {
        return launchedDate;
    }
    public void setLaunchedDate(Date launchedDate) {
        this.launchedDate = launchedDate;
    }
    public static Mobile createMobile(String detail) {
        String[] details = detail.split(",");
        String referenceId = details[0].trim();
        String modelName = details[1].trim();
        Double displaySize = Double.parseDouble(details[2].trim());
        Double price = Double.parseDouble(details[3].trim());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date launchedDate = null;
        try {
            launchedDate = dateFormat.parse(details[4].trim());
        } catch (ParseException e) {
            e.printStackTrace(); 
        }
        return new Mobile(referenceId, modelName, displaySize, price, launchedDate);
    }
}
