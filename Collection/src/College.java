import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class College {
    private String name;
    private String website;
    private String mobile;
    private String founder;
    private Integer numberOfDept;
    private String location;
    private Date startingDate;

    public College() {
        // Default constructor
    }

    public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location, Date startingDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberOfDept = numberOfDept;
        this.location = location;
        this.startingDate = startingDate;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Integer getNumberOfDept() {
        return numberOfDept;
    }

    public void setNumberOfDept(Integer numberOfDept) {
        this.numberOfDept = numberOfDept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public static Map<String, Integer> calculateLocationCount(List<College> list) {
        Map<String, Integer> locationCount = new TreeMap<>();
        for (College college : list) {
            locationCount.put(college.getLocation(), locationCount.getOrDefault(college.getLocation(), 0) + 1);
        }
        return locationCount;
    }
}
