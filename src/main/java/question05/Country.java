package question05;

import java.util.List;
import java.util.TreeMap;

public class Country {

    private static TreeMap<String,List<String>> countries;




    public List<String> getCountry(String countryName){
        List<String> list = countries.get(countryName);
        if(list.isEmpty() || list == null){
            return null;
        }
        return list;
    }

    private String name;
    private List<String> district;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDistrict() {
        return district;
    }

    public void setDistrict(List<String> district) {
        this.district = district;
    }
}
