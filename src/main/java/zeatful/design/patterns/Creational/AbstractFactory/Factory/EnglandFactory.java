package zeatful.design.patterns.Creational.AbstractFactory.Factory;

import zeatful.design.patterns.Creational.AbstractFactory.Currency.Currency;
import zeatful.design.patterns.Creational.AbstractFactory.Currency.GBP;
import zeatful.design.patterns.Creational.AbstractFactory.Government.Government;
import zeatful.design.patterns.Creational.AbstractFactory.Government.Monarchy;
import zeatful.design.patterns.Creational.AbstractFactory.Language.English;
import zeatful.design.patterns.Creational.AbstractFactory.Language.Language;

public class EnglandFactory extends CountryFactory {

    public Government CreateGovernment() {
        return new Monarchy();
    }

    public Language CreateLanguage() {
        return new English();
    }

    public Currency CreateCurrency() {
        return new GBP();
    }
}
