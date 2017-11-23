package zeatful.design.patterns.Creational.AbstractFactory.Country;

import zeatful.design.patterns.Creational.AbstractFactory.Currency.Currency;
import zeatful.design.patterns.Creational.AbstractFactory.Government.Government;
import zeatful.design.patterns.Creational.AbstractFactory.Language.Language;

public abstract class Country {
    protected String name;
    protected Currency currency;
    protected Language language;
    protected Government government;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) {
        this.government = government;
    }
}
