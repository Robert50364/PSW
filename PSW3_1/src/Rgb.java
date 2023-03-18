public class Rgb
{
    private int rValue;
    private int gValue;
    private int bValue;
    Rgb()
    {
        setRValue(0);
        setGValue(0);
        setBValue(0);
    }

    //Settery
    public void setRValue(int value) {
        this.rValue = value;
    }

    public void setGValue(int value) {
        this.gValue = value;
    }

    public void setBValue(int value) {
        this.bValue = value;
    }

    //Gettery
    public int getRValue(){
        return this.rValue;
    }

    public int getGValue(){
        return this.gValue;
    }

    public int getBValue(){
        return this.bValue;
    }
}
