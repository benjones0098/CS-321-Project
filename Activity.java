/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.util.*;
import java.time.*;
import java.io.Serializable;
/**
 *
 * @author Benjamin Jones
 */
public class Activity implements Serializable{
    protected LocalTime time;
    protected LocalDate date;
    protected String location;
    protected String extraInfo;
    
    public Activity()
    {
    	time = null;
    	date = null;
    	location = "";
    	extraInfo = "";
    }
    
    public Activity(LocalTime time_, LocalDate date_, String location_, String extraInfo_)
    {
    	time = time_;
    	date = date_;
    	location = location_;
    	extraInfo = extraInfo_;
    }
    
    public void setTime(LocalTime newTime)
    {
        time = newTime;
    }
    
    public void setDate(LocalDate newDate)
    {
        date = newDate;
    }
    
    public void setLocation(String newLocation)
    {
        location = newLocation;
    }
    
    public void setExtraInfo(String newExtraInfo)
    {
        extraInfo = newExtraInfo;
    }
    
    public LocalTime getTime()
    {
        return time;
    }
    
    public LocalDate getDate()
    {
        return date;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getExtraInfo()
    {
        return extraInfo;
    }
    
    
}

