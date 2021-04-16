/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benjamin Jones
 */
public class School extends Activity {
    
    private String course;
    private float grade;
    private int hours;
    private String[] assignments;
    
    void setCourse(String newCourse)
    {
        course = newCourse;
    }
    
    void setGrade(float newGrade)
    {
        grade = newGrade;
    }
    
    void setHours(int newHours)
    {
        hours = newHours;
    }
    
    void setAssignments(String[] newAssignments)
    {
        assignments = newAssignments;
    }
    
    String getCourse()
    {
        return course;
    }
    
    float getGrade()
    {
        return grade;
    }
    
    int getHours()
    {
        return hours;
    }
    
    String[] getAssignments()
    {
        return assignments;
    }
}

