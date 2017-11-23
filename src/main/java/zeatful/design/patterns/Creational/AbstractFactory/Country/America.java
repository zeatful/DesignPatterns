package zeatful.design.patterns.Creational.AbstractFactory.Country;

import zeatful.design.patterns.Creational.AbstractFactory.Currency.Currency;
import zeatful.design.patterns.Creational.AbstractFactory.Factory.CountryFactory;
import zeatful.design.patterns.Creational.AbstractFactory.Government.Government;
import zeatful.design.patterns.Creational.AbstractFactory.Language.Language;

public class America {
    private Currency currency;
    private Language language;
    private Government government;

    public America(CountryFactory factory){
        currency = factory.CreateCurrency();
        language = factory.CreateLanguage();
        government = factory.CreateGovernment();
    }

    public void runCountry(){
        String output = getClass().getName() +
                "is a " +
                government.getClass().getName() +
                " where the language is " +
                language.getClass().getName() +
                " on the " +
                currency.getClass().getName() +
                " currency";

        System.out.println(output);
    }
}
