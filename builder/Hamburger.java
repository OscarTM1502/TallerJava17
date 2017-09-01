public abstract class Hamburger {
    
    protected Bread bread;
    protected Tomatoe tomatoe;
    protected Pineapple pineapple;
    protected Meat meat;

public abstract  void getHambType();

public void setBread(Bread bread)
    {
     this.bread = bread;  
    }

public void setTomatoe(Tomatoe tomatoe)
    {
     this.tomatoe = tomatoe;   
    }

    public void setPineapple(Pineapple pineapple)
    {
     this.pineapple= pineapple;   
    }

    public void setMeat(Meat meat)
    {
     this.meat = meat;   
    }

}
