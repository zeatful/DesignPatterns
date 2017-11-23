package zeatful.design.patterns.Creational.AbstractFactory.Factory;

import zeatful.design.patterns.Creational.AbstractFactory.Currency.Currency;
import zeatful.design.patterns.Creational.AbstractFactory.Currency.USD;
import zeatful.design.patterns.Creational.AbstractFactory.Government.DemocraticRepublic;
import zeatful.design.patterns.Creational.AbstractFactory.Government.Government;
import zeatful.design.patterns.Creational.AbstractFactory.Language.English;
import zeatful.design.patterns.Creational.AbstractFactory.Language.Language;

public class AmericaFactory extends CountryFactory {

    public Government CreateGovernment() {
        return new DemocraticRepublic();
    }

    public Language CreateLanguage() {
        return new English();
    }

    public Currency CreateCurrency() {
        return new USD();
    }
}
