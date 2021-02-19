/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateproject;

/**
 * A class representing a date.
 * @author lcao2
 */
public class Date {
    /**
     * The month of the Date
     */
    private int month;
    /**
     * The day of the Date
     */
    private int day;
    /**
     * The year of the Date
     */
    private int year; 

    /**
     * Constructs a new Date whose month and day are 1, and year is 1900.
     */
    public Date() {
        month = 1;
        day = 1;
        year = 1900;
    }

    /**
     * Constructs a new Date whose month, day and year are specified by the arguments of the same name.
     *
     * @param month value of month
     * @param day value of day
     * @param year value of year
     */
    public Date(int month, int day, int year)throws Exception{
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    
    /**
     * Get the value of month
     *
     * @return returns the value stored in month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Get the value of day
     *
     * @return returns the value stored in day
     */
    public int getDay() {
        return day;
    }

    /**
     * Get the value of year
     *
     * @return returns the value stored in year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the value of month
     *
     * @param month new value of month
     * @throws java.lang.Exception
     */
    public void setMonth(int month) throws Exception{
        if(month <= 12 && month >= 1){
            this.month = month;
        }else{
            throw new Exception("Invalid month: out of range");
    }
    }

    /**
     * Set the value of day
     *
     * @param day new value of day
     * @throws java.lang.Exception
     */
    public void setDay(int day) throws Exception{
    if(day <= 30 && day >= 1){
            this.day = day;
        }else{
            throw new Exception("Invalid day: out of range");
    }
    }

    /**
     * Set the value of year
     *
     * @param year new value of year
     * @throws java.lang.Exception
     */
    public void setYear(int year)throws Exception{
      if(year <= 2019 && year >= 1752){
            this.year = year;
        }else{
            throw new Exception("Invalid year: out of range");
    }
    }

    
    /**
     * Returns a String representing this Date and its values.
     *
     * @return a String containing the date in month-day-year format
     */
    public String toString() {
        return (month + "-" + day + "-" + year);
    }
    
}
