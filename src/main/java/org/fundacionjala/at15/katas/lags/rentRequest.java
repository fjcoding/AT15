package org.fundacionjala.at15.katas.lags;

public class rentRequest {
    int startTime;
    int travelDuration;
    int price;
    String nameTravel;

    public rentRequest(int startTime, int travelDuration, int price, String nameTravel){
        this.startTime=startTime;
        this.travelDuration=travelDuration;
        this.price=price;
        this.nameTravel=nameTravel;
     
    }
    
    public int getStartTime (){

        return startTime;
    }
    public int getTravelDuration(){

        return travelDuration;
    }
    public int getPrice(){
        
        return price;
    }
    public String nameTravel(){
     
        return nameTravel;
    }
    
}


