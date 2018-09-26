
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class Schueler 
{
    private String name;
    private int age;
    private LocalDate brithday;

    public Schueler(String name, int age, LocalDate brithday)
    {
        this.name = name;
        this.brithday = brithday;
        this.age = LocalDate.now().getYear()-brithday.getYear();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public LocalDate getBrithday()
    {
        return brithday;
    }

    public void setBrithday(LocalDate brithday)
    {
        this.brithday = brithday;
    }
    
    
    
}
