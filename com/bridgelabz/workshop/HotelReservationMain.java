package com.bridgelabz.workshop;
import java.time.LocalDate;

import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HotelReservationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("LakeWood", 110, 90, 3, 80, 80);
        hotelReservation.addHotel("BridgeWood", 150, 50, 4, 110, 50);
        hotelReservation.addHotel("RidgeWood", 220, 150, 5, 100, 40);

        //list out hotel Details
        hotelReservation.getHotelDetails();

        //giving start and end dates of the schedule
        LocalDate dateStart = LocalDate.of(2021, Month.AUGUST, 11);
        LocalDate dateEnd = LocalDate.of(2021, Month.AUGUST, 20);
        System.out.println("Starting date : "+dateStart);
        System.out.println("Ending date : "+dateEnd);
        int noOfDays = (int) ChronoUnit.DAYS.between(dateStart, dateEnd);
        System.out.println("Total days is : "+noOfDays);

        //finding getWeekDaysCount
        int weekEndsCount = hotelReservation.getWeekDaysCount(dateStart, noOfDays);
        int weekDaysCount = noOfDays - weekEndsCount;

        boolean cont = true;
        while (cont){
            System.out.println("1:Best Minimum price range Hotel 2:Best Minimum price range with average rated Hotel 3:Best Rated Hotel Or 0:toExit");
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                    break;
                case 2:
                    hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                    break;
                case 3:
                    hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                    break;
                case 0:
                    cont=false;
                    break;
            }

        }

    }
}
