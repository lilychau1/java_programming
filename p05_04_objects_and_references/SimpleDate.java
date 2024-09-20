package p05_04_objects_and_references;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(int howManyDays) {
        this.day = this.day + howManyDays; 
        if (this.day > 30) {
            int howManyMonths = this.day / 30; 
            this.day = this.day - 30 * howManyMonths; 
            this.month = this.month + howManyMonths; 
            
            if (this.month > 12) {
                int howManyYears = (this.month + howManyMonths) / 12; 
                this.year = this.year + howManyYears; 
                this.month = this.month + howManyMonths - 12 * howManyYears; 
            }
        }
    }

    public void advance() {
        this.advance(1);
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year); 
        newDate.advance(days); 
        return newDate; 
    }
}