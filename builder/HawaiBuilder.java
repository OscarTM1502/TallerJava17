public class HawaiBuilder extends Builder {
    
    public Hamburger buildHamburger()
    {
        return new Hawaia();
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
        Pineapple p = new Pineapple();
        hamburger.setPineapple(p);
    }

    public void buildMeat()
    {
        Meat m = new Meat();
        hamburger.setMeat(m);
    }
}
