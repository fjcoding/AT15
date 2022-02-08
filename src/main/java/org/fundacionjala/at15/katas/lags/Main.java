package org.fundacionjala.at15.katas.lags;

public class Main {
    public static void main(String[] args) {
        rentRequest []rent = new rentRequest[4];  
        // adding an array with flight code   
        rent[0]=new rentRequest(0,5,10,"AF514");
		rent[1]=new rentRequest(3,7,14,"CO5");
		rent[2]=new rentRequest(5,9,7,"AF515");
		rent[3]=new rentRequest(6,9,8,"BA01");
        int sumDuration,nextFlight;
        int sum=0;
        int fly1=0,fly2=0;
        for (int i = 0; i < rent.length; i++) {
					for (int j = i+1; j < rent.length; j++) {
						sumDuration=rent[i].getStartTime()+rent[i].getTravelDuration();
						nextFlight=rent[j].getStartTime();
						if (nextFlight-sumDuration>=0) {
							if (rent[i].getPrice()+rent[j].getPrice()>sum) {
								sum=rent[i].getPrice()+rent[j].getPrice();
								fly1=i;
								fly2=j;
							}
						}
					}
				}
				int finish=0;
        int ind=0;
        for (int i = 0; i < rent.length; i++) {
					if (rent[i].getPrice()>sum) {
						finish=rent[i].getPrice();
						ind=i;
					}
				}
                if (finish!=0) {
                    System.out.println("vuelo: "+rent[ind].getNameTravel()+" ganancia: "+finish);  
                }else {
                    System.out.println("vuelo1: "+rent[fly1].getNameTravel()+" vuelo2: "+rent[fly2].getNameTravel()+" ganancia: "+sum);
                }        
    }

}
