public class TicketBoothTester {
    public static void main(String[] args) {
        TicketBooth matinee = new TicketBooth("Dune", 14, 12);
        TicketBooth evening = new TicketBooth("Heat", 19, 40);

        // Uncomment each group as you finish that method.

        System.out.println("seats left: " + matinee.getSeatsLeft());

        System.out.println("priceCategory(12): " + evening.priceCategory(12));
        System.out.println("priceCategory(13): " + evening.priceCategory(13));
        System.out.println("priceCategory(65): " + evening.priceCategory(65));
        System.out.println("priceCategory(17): " + evening.priceCategory(17));
        System.out.println("priceCategory(18): " + evening.priceCategory(18));
        System.out.println("priceCategory(64): " + evening.priceCategory(64));
        System.out.println("priceCategory(10): " + evening.priceCategory(10));
        System.out.println("priceCategory(15): " + evening.priceCategory(15));
        System.out.println("priceCategory(30): " + evening.priceCategory(30));
        System.out.println("priceCategory(66): " + evening.priceCategory(66));


        System.out.println("evening ticketPrice(40, false): "
                + evening.ticketPrice(40, false));
        System.out.println("evening ticketPrice(40, true): "
                + evening.ticketPrice(40, true));
        System.out.println("matinee ticketPrice(40, true): "
                + evening.ticketPrice(40, true));
        System.out.println("matinee ticketPrice(15, false): "
                 + matinee.ticketPrice(15, false));
        System.out.println("matinee ticketPrice(8, true): "
                 + matinee.ticketPrice(8, true));
        System.out.println("matinee ticketPrice(70, false): "
                 + matinee.ticketPrice(70, false));

    // There was no int showHour which is the parameter
        System.out.println("evening showtimeLabel(): " + evening.showtimeLabel());

    // There is no parameter "String color"
        System.out.println("wristband(10): " + evening.wristband(10));

    
        System.out.println("memberDiscount(false): " + evening.memberDiscount(false));


        matinee.setShowHour(9);
        System.out.println("after setShowHour(9): " + matinee.getShowHour());
        matinee.setShowHour(25);
        System.out.println("after setShowHour(9): " + matinee.getShowHour());        
        matinee.setShowHour(10);
        System.out.println("after setShowHour(10): " + matinee.getShowHour());

        matinee.setSeatsLeft(5);
        System.out.println(matinee.getSeatsLeft());
        matinee.setSeatsLeft(300);
        System.out.println(matinee.getSeatsLeft());
        matinee.setSeatsLeft(-1);
        System.out.println(matinee.getSeatsLeft());

        evening.setShowName("Coco");
        System.out.println(evening.getShowName());
        evening.setShowName(null);
        System.out.println(evening.getShowName());
        
        matinee.sell(13);
        System.out.println("after sell(13): " + matinee.getSeatsLeft());
        matinee.sell(0);
        System.out.println(matinee.getSeatsLeft());
        matinee.sell(2);
        System.out.println(matinee.getSeatsLeft());
        
        

    }
}
