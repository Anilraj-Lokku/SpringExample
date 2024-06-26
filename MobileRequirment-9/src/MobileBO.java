import java.util.ArrayList;
import java.util.List;

public class MobileBO {

    public List<Mobile> findMobile(List<Mobile> mobileList, String modelName) {
        List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (mobile.getModelName().equalsIgnoreCase(modelName)) {
                result.add(mobile);
            }
        }
        return result;
    }

    public List<Mobile> findMobile(List<Mobile> mobileList, Double displaySize) {
        List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (mobile.getDisplaySize().equals(displaySize)) {
                result.add(mobile);
            }
        }
        return result;
    }
}
