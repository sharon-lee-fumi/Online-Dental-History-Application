package business;

/**
 *
 * @author Xiaowen Li
 */
public class History 
{
    private String name;
    private String breath;
    private String bleeding;
    private String teeth;
    private String tonque;
    private String biting;
    private String floss;
    
    public History(){}

    public History(String name, String breath, String bleeding, String teeth,
            String tonque, String biting, String floss)
    {
        this.name = name; 
        this.breath = breath; 
        this.bleeding = bleeding;
        this.teeth = teeth;
        this.tonque = tonque;
        this.biting = biting;
        this.floss = floss;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBreath()
    {
        return breath;
    }

    public void setBreath(String breath)
    {
        this.breath = breath;
    }

    public String getBleeding()
    {
        return bleeding;
    }

    public void setBleeding(String bleeding)
    {
        this.bleeding = bleeding;
    }

    public String getTeeth()
    {
        return teeth;
    }

    public void setTeeth(String teeth)
    {
        this.teeth = teeth;
    }

    public String getTonque()
    {
        return tonque;
    }

    public void setTonque(String tonque)
    {
        this.tonque = tonque;
    }

    public String getBiting()
    {
        return biting;
    }

    public void setBiting(String biting)
    {
        this.biting = biting;
    }

    public String getFloss()
    {
        return floss;
    }

    public void setFloss(String floss)
    {
        this.floss = floss;
    }
    
    

}
