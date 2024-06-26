import java.util.ArrayList;
import java.util.List;

public class MobileBrand {
    private String name;
    private List<Mobile> mobileList;

    public MobileBrand(String name) {
        this.name = name;
        this.mobileList = new ArrayList<>();
    }

    public MobileBrand(String name, List<Mobile> mobileList) {
        this.name = name;
        this.mobileList = mobileList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Mobile> getMobileList() {
        return mobileList;
    }
    public void addMobileToMobileBrand(Mobile mobile) {
        mobileList.add(mobile);
    }
    public boolean removeMobileFromMobileBrand(String referenceId) {
        for (Mobile mobile : mobileList) {
            if (mobile.getReferenceId().equals(referenceId)) {
                mobileList.remove(mobile);
                return true; 
            }
        }
        return false; 
    }
    public void displayMobiles() {
        if (mobileList.isEmpty()) {
            System.out.println("No mobiles to show");
        } else {
            System.out.println("Mobiles in " + name);
            System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size","Price","Launched Date");
            for (Mobile mobile : mobileList) {
                System.out.format("%-15s %-15s %-12.1f %-8.1f %s\n",
                        mobile.getReferenceId(),
                        mobile.getModelName(),
                        mobile.getDisplaySize(),
                        mobile.getPrice(),
                        mobile.getLaunchedDate().toString());
            }
        }
    }
}
