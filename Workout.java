/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benjamin Jones
 */
public class Workout extends Activity {
    private String[] muscles;
    private int calories;
    
    public void setMuscles(String[] newMuscles)
    {
        muscles = newMuscles;
    }
    
    public void setCalories(int newCalories)
    {
        calories = newCalories;
    }
    
    public String[] getMuscles()
    {
        return muscles;
    }
    
    public int getCalories()
    {
        return calories;
    }
}
