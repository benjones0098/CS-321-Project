/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Benjamin Jones
 */
public class Activity {
    private Date time;
    private Date date;
    private String location;
    private String extraInfo;
    
    public void setTime(Date newTime)
    {
        time = newTime;
    }
    
    public void setDate(Date newDate)
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
    
    public Date getTime()
    {
        return time;
    }
    
    public Date getDate()
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

