package activitytest.example.com.knowweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName = countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCirtyId(int cityId){
        this.cityId = cityId;
    }
}
