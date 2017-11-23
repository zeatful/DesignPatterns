package zeatful.design.patterns.Creational.AbstractFactory.Factory;

import zeatful.design.patterns.Creational.AbstractFactory.Currency.Currency;
import zeatful.design.patterns.Creational.AbstractFactory.Currency.NKW;
import zeatful.design.patterns.Creational.AbstractFactory.Government.*;
import zeatful.design.patterns.Creational.AbstractFactory.Language.*;

public class NorthKoreaFactory extends CountryFactory {

    public Government CreateGovernment() {
        return new Dictatorship();
    }

    public Language CreateLanguage() {
        return new Korean();
    }

    public Currency CreateCurrency() {
        return new NKW();
    }
}
