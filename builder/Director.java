public class Director {
    protected Builder builder;
    public Builder getBuilder(String tipo)
    {
        if (tipo == "Hawaia")
        {
            return new HawaiBuilder();
        }
        if (tipo == "Double")
        {
            return new DoubleBuilder();
        }
        return new DoubleBuilder();
    }

    public Hamburger orderHam(String tipo)
    {
          builder = getBuilder(tipo);
          builder.createHamburger();
          return builder.getHamburger();
    }
}
