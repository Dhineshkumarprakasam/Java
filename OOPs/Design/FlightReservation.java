import java.util.*;

class Flights {
    boolean boeing123[],boeing456[];
    int boeing123Booked, boeing456Booked;
    Flights(){
        boeing123 = new boolean[10];
        boeing456 = new boolean[10];
        boeing123Booked=0;
        boeing456Booked=0;
        for(int i=0;i<10;i++){
            boeing123[i]=false;
            boeing456[i]=false;
        }
    }

    public int bookTicket(String plane,String seatClass){
        //plane 1
        if(plane=="boeing123"){
            if(boeing123Booked==10)
                return -1; //no seats

            else if(seatClass=="First Class"){
                for(int i=0;i<5;i++){
                    if(boeing123[i]==false){
                        boeing123[i]=true;
                        boeing123Booked++;
                        return i+1; //seat no
                    }
                }
                return -2; // no seat in first class 
            }
            else{
                for(int i=5;i<10;i++){
                    if(boeing123[i]==false){
                        boeing123[i]=true;
                        boeing123Booked++;
                        return i+1; //seat no
                    }
                }
                return -2; // no seat in economy
            } 
        }
        //plane 2
        else{
            if(boeing456Booked==10)
                return -1; //no seats

            else if(seatClass=="First Class"){
                for(int i=0;i<5;i++){
                    if(boeing456[i]==false){
                        boeing456[i]=true;
                        boeing456Booked++;
                        return i+1; //seat no
                    }
                }
                return -2; // no seat in first class 
            }
            else{
                for(int i=5;i<10;i++){
                    if(boeing456[i]==false){
                        boeing456[i]=true;
                        boeing456Booked++;
                        return i+1; //seat no
                    }
                }
                return -2; // no seat in economy
            } 
        }        
    }
}


class Passenger{
    String name,passportNo,seatClass;
    int seatNo;

    public void setData(String name,String passportNo,String seatClass, int seatNo){
        this.name = name;
        this.passportNo = passportNo;
        this.seatClass = seatClass;
        this.seatNo = seatNo;
    }

    public void displayBordingPass(){
        System.out.println("Name\t: "+this.name);
        System.out.println("Pass\t: "+this.passportNo);
        System.out.println("Class\t: "+this.seatClass);
        System.out.println("Seat No\t: "+this.seatNo);
    }
}

class Admin{
    void displayAllPassengers(Passenger passengerList[],int currIndex){
        System.out.println("\nList of passengers :");
        for(int i=0;i<currIndex;i++){
            passengerList[i].displayBordingPass();
        }
    }
}


public class FlightReservation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice, seatClassChoice, seatNo, currIndex=0;
        String name, passportNo, plane, seatClass;

        Flights flights = new Flights();
        Passenger passengerList[] = new Passenger[20]; //maximum 20 passengers
        Admin admin = new Admin();

        while(true){
            System.out.println("\n\nWelcome to Java Airlines");
            System.out.println("------------------------------");
            System.out.println("1.Login as Admin\n2.Login as Passenger");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("\nAdmin Login");
                    System.out.println("---------------------");
                    admin.displayAllPassengers(passengerList,currIndex);
                    break;
                case 2:
                    System.out.println("\nUser Login");
                    System.out.println("---------------------");
                    System.out.print("Enter your Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter your Passport no : ");
                    passportNo = sc.nextLine();
                    

                    System.out.println("Select Flight");
                    System.out.println("1.Boeing123\n2.Boeing234");
                    System.out.print("Enter your choice : ");
                    choice = sc.nextInt();

                    System.out.println("Select Seat Class");
                    System.out.println("1.First Class\n2.Economy");
                    System.out.print("Enter your choice : ");
                    seatClassChoice = sc.nextInt();

                    if(choice==1){
                        plane="boeing123";
                    }
                    else{
                        plane="boeing456";
                    }
                        
                    if(seatClassChoice==1){
                        seatClass="First Class";
                        seatNo=flights.bookTicket(plane,seatClass);
                        if(seatNo==-1){
                            System.out.println("Next flight in 3 hours");
                        }
                        else if(seatNo==-2){
                            System.out.println("Seat not available in : "+seatClass);
                            System.out.println("Do you want to book seat in Economy (1:yes/0:no)");
                            System.out.print("Enter your choice : ");
                            choice = sc.nextInt();
                            if(choice==1){
                                seatClass="Economy";
                                seatNo = flights.bookTicket(plane,seatClass);
                            }
                        }
                        
                        passengerList[currIndex]=new Passenger();
                        passengerList[currIndex].setData(name,passportNo,seatClass,seatNo);
                        passengerList[currIndex].displayBordingPass();
                        currIndex++;
                    }
                    else{
                        seatClass="Economy";
                        seatNo=flights.bookTicket(plane,seatClass);
                        if(seatNo==-1){
                            System.out.println("Next flight in 3 hours");
                        }
                        else if(seatNo==-2){
                            System.out.println("Seat not available in : "+seatClass);
                            System.out.println("Do you want to book seat in First Class (1:yes/0:no)");
                            System.out.print("Enter your choice : ");
                            choice = sc.nextInt();
                            if(choice==1){
                                seatClass="First Class";
                                seatNo = flights.bookTicket(plane,seatClass);
                            }
                        }
                        
                        passengerList[currIndex]=new Passenger();
                        passengerList[currIndex].setData(name,passportNo,seatClass,seatNo);
                        passengerList[currIndex].displayBordingPass();
                        currIndex++;


                    }
                    break;
            }
        }
    }
}
