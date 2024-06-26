import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile implements Comparable<Mobile> {
    private String referenceId;
    private String modelName;
    private Double displaySize;
    private Double price;
    private Date launchedDate;

    public Mobile() {}

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

    public static Mobile createMobile(String detail) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String[] parts = detail.split(",");
        String referenceId = parts[0].trim();
        String modelName = parts[1].trim();
        Double displaySize = Double.parseDouble(parts[2].trim());
        Double price = Double.parseDouble(parts[3].trim());
        Date launchedDate = dateFormat.parse(parts[4].trim());

        return new Mobile(referenceId, modelName, displaySize, price, launchedDate);
    }

    @Override
    public int compareTo(Mobile other) {
        return this.price.compareTo(other.price);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-15s %-15s %-12.1f %-8.1f %s", referenceId, modelName, displaySize, price, dateFormat.format(launchedDate));
    }
}
