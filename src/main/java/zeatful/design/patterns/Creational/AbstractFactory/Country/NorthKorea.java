package zeatful.design.patterns.Creational.AbstractFactory.Country;

import zeatful.design.patterns.Creational.AbstractFactory.Factory.CountryFactory;

public class NorthKorea extends Country {
    public static final String NAME = "North Korea";

    public NorthKorea(CountryFactory factory) {
        this.name = NAME;
        this.currency = factory.CreateCurrency();
        this.language = factory.CreateLanguage();
        this.government = factory.CreateGovernment();
    }
}
