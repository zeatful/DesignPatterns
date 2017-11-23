package zeatful.design.patterns.Creational.AbstractFactory.Country;

import zeatful.design.patterns.Creational.AbstractFactory.Factory.CountryFactory;

public class America extends Country {
    public static final String NAME = "America";

    public America(CountryFactory factory) {
        this.name = NAME;
        this.currency = factory.CreateCurrency();
        this.language = factory.CreateLanguage();
        this.government = factory.CreateGovernment();
    }
}
