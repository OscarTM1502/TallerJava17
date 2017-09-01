public class DoubleBuilder extends Builder {
    
     public Hamburger buildHamburger()
    {
        return new DoubleBurger();
    }

    public void buildBread()
    {
        Bread b = new Bread();
        hamburger.setBread(b);
    }

    public void buildTomatoe()
    {
        Tomatoe t = new Tomatoe();
        hamburger.setTomatoe(t);
    }

    public void buildPineapple()
    {
        System.out.println("no tiene");
    }

    public void buildMeat()
    {
       System.out.println("Tiene Doble Carne");
    }
}
