package p05_04_objects_and_references;

public class Apartment {
    private int rooms; 
    private int squares; 
    private int pricePerSquare; 

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms; 
        this.squares = squares; 
        this.pricePerSquare = pricePerSquare; 
    }

    public boolean largerThan(Apartment comparedApartment) {
        if (this.squares > comparedApartment.squares) {
            return true; 
        }
        return false; 
    }

    public int priceDifference(Apartment comparedApartment) {
        int priceDiff = (this.pricePerSquare * this.squares) - (comparedApartment.pricePerSquare * comparedApartment.squares); 
        if (priceDiff >= 0) {
            return priceDiff; 
        }
        return 0 - priceDiff; 
    }

    public boolean moreExpensiveThan(Apartment comparedApartment) {
       if ((this.pricePerSquare * this.squares) > (comparedApartment.pricePerSquare * comparedApartment.squares)) {
        return true; 
       }
       return false; 
    }
}
