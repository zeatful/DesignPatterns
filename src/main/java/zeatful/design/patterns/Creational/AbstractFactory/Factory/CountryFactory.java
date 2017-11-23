package zeatful.design.patterns.Creational.AbstractFactory.Factory;

import zeatful.design.patterns.Creational.AbstractFactory.Currency.Currency;
import zeatful.design.patterns.Creational.AbstractFactory.Government.Government;
import zeatful.design.patterns.Creational.AbstractFactory.Language.Language;

public abstract class CountryFactory {
    public abstract Government CreateGovernment();
    public abstract Language CreateLanguage();
    public abstract Currency CreateCurrency();
}
