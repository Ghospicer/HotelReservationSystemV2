


public class Reservation {

    private String hotelName;
    private String reservationMonth;
    private int reservationStart;
    private int reservationEnd;
    private int dailyCost;
    public int totalDay;
    public int multiplier = 2;
    public String s1 = "June";
    public String s2 = "July";
    public String s3 = "August";
    public Room room;


    public static class Room {
        public String roomType;
        private int dailyCost;
        public int roomSize;
        public boolean hasBath;

        public int getDailyCost() {
            return dailyCost;
        }
        public void setDailyCost(int dailyCost) {
            this.dailyCost = dailyCost;
        }

        public Room(int roomSize, boolean hasBath, int dailyCost, String roomType) {
            this.roomType = roomType;
            this.dailyCost = dailyCost;
            this.hasBath = hasBath;
            this.roomSize = roomSize;
        }

    }


    public int getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(int dailyCost) {
        this.dailyCost = dailyCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getReservationMonth() {
        return reservationMonth;
    }

    public void setReservationMonth(String reservationMonth) {
        this.reservationMonth = reservationMonth;
    }

    public int getReservationStart() {
        return reservationStart;
    }

    public void setReservationStart(int reservationStart) {
        this.reservationStart = reservationStart;
    }

    public int getReservationEnd() {
        return reservationEnd;
    }

    public void setReservationEnd(int reservationEnd) {
        this.reservationEnd = reservationEnd;
    }

    public Reservation(int reservationEnd, int reservationStart, String reservationMonth, String hotelName , Room room) {
        this.hotelName = hotelName;
        this.reservationMonth = reservationMonth;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.room = room;
    }
    

    public int checker() {
    	if(reservationMonth.equals(s1)||reservationMonth.equals(s2)||reservationMonth.equals(s3)) {
			return calculate(totalDay(), room.getDailyCost(), multiplier);
		}
		else {
			return calculate(totalDay(), room.getDailyCost());
		}
    }
    
    public int calculate(int totalDay, int dailyCost, int multiplier) {
    	return totalDay * dailyCost * multiplier;
    }
    
    public int calculate(int totalDay, int dailyCost) {
    	return totalDay * dailyCost;
    }

    public int totalDay() {
        return totalDay = reservationEnd - reservationStart;
    }

    /*public int calculateTotalPrice() {
        if(reservationMonth.equals(s1) || reservationMonth.equals(s2) || reservationMonth.equals(s3)) {
            return totalDay() * (room.getDailyCost() * multiplier);
        }
        else {
            return totalDay() * room.getDailyCost();
        }
    }*/

    public String displayInfo() {
        return "Reservation for " + hotelName + " starts on "
                + reservationMonth + " " + reservationStart +
                " and ends on " + reservationMonth + " " +
                reservationEnd + ". Reservation has a "
                + "total cost of $"
                + checker() + ".";
    }



}