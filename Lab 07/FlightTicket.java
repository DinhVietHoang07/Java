package TEST;

public class FlightTicket {
    private double totalPrice;
    private byte typeOfCabin;
    private byte noOfTickets;
    private Time departureTime;
    private Date departureDate;
    private double Price = 100;

    public FlightTicket(){
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.totalPrice = totalPrice;
        this.typeOfCabin = typeOfCabin;
        this.noOfTickets = noOfTickets;
    }
    public Date getDepartureDate(){
        return departureDate;
    }
    public void setDepartureDate(byte typeOfCabin, byte noOfTickets, short year){
        this.departureDate = departureDate;
    }
    public Time getDepartureTime(){
        return departureTime;
    }
    public void setDepartureTime(Time departureTime){
        this.departureTime = departureTime;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void displayTicketInformation(){
        return;
    }
}
