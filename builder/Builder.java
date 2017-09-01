public abstract class Builder {
    protected Hamburger hamburger;
    public abstract Hamburger buildHamburger();
    public abstract void buildBread();
    public abstract void buildTomatoe();
    public abstract void buildPineapple();
    public abstract void buildMeat();
    
    public Hamburger getHamburger()
    {
          return hamburger;
    }

    public void createHamburger()
    {
        hamburger = buildHamburger();
        buildBread();
        buildTomatoe();
        buildPineapple();
        buildMeat();
    
    }
}
