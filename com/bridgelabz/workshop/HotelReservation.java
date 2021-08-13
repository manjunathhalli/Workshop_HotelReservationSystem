package com.bridgelabz.workshop;

import java.util.ArrayList;

class Hotel{
    public String getHotelName() {
        return hotelName;
    }
    public Hotel(){};

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelPriceWeekDays() {
        return hotelPriceWeekDays;
    }

    public void setHotelPriceWeekDays(int hotelPriceWeekDays) {
        this.hotelPriceWeekDays = hotelPriceWeekDays;
    }

    public int getHotelPriceWeekEnds() {
        return hotelPriceWeekEnds;
    }

    public void setHotelPriceWeekEnds(int hotelPriceWeekEnds) {
        this.hotelPriceWeekEnds = hotelPriceWeekEnds;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelPriceWeekDays=" + hotelPriceWeekDays +
                ", hotelPriceWeekEnds=" + hotelPriceWeekEnds +
                '}';
    }

    private String hotelName;
    private int hotelPriceWeekDays;
    private int hotelPriceWeekEnds;

}

public class HotelReservation extends Hotel {
    public ArrayList<Hotel> hotelDetails = new ArrayList<Hotel>();

    public void addHotel(String hotelName, int hotelPriceWeekDays, int hotelPriceWeekEnds) {
        Hotel adder = new Hotel(hotelName, hotelPriceWeekDays, hotelPriceWeekEnds);
        hotelDetails.add(adder);
    }

    public void getHotelDetails(){
        System.out.println(hotelDetails);
    }
}
