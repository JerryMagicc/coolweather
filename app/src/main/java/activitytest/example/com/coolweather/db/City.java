package activitytest.example.com.coolweather.db;

/**
 * Created by Administrator on 2018/4/22.
 */

public class City {
    private int id;
    private String cityName;
    private int cityCode;
    private int proviinceId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
      return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProviinceId(){
        return proviinceId;
    }
    public void setProviinceId(int proviinceId){
        this.proviinceId=proviinceId;
    }
}
