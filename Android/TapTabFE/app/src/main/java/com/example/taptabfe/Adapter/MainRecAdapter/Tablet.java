package com.example.taptabfe.Adapter.MainRecAdapter;

/*이 부분에 db작업을 통해 배터리 잔량, 기기명 등을 추가하면 됨*/
public class Tablet /* implements Serializable*/ {
    /* 원래 implements serializable이 있었는데, 이 부분은 추후에 db연동할 때 필요한 부분이었습니다.
    *  그러나 AWS, Firebase는 다를 수도 있어서 추가해놓지 않았습니다
     */
    private String id;  //기기의 번호 ( 몇호)
    private Integer rental;  //기기의 rental availability를 표시하기위해서 선언 ( 0- 불가능, 1- 가능)
    private String device_name;  //기기의 모델명
    //private Integer battery;  //기기의 잔여 배터리량, 일단 현재는 보류하기로 했음

    public Tablet(String id, Integer rental, String device_name){
        this.id = id;
        this.rental = rental;
        this.device_name = device_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRental() {
        return rental;
    }

    public void setRental(Integer rental) {
        this.rental = rental;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    /*public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }*/
}
