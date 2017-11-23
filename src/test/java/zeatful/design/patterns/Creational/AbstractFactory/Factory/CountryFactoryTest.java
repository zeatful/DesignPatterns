package zeatful.design.patterns.Creational.AbstractFactory.Factory;

import org.junit.jupiter.api.Test;
import zeatful.design.patterns.Creational.AbstractFactory.Country.*;
import zeatful.design.patterns.Creational.AbstractFactory.Currency.*;
import zeatful.design.patterns.Creational.AbstractFactory.Government.*;
import zeatful.design.patterns.Creational.AbstractFactory.Language.English;
import zeatful.design.patterns.Creational.AbstractFactory.Language.Korean;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CountryFactoryTest {

    @Test
    public void testAmericaFactory() throws Exception {
        Country america = new America(new AmericaFactory());
        assertThat(america.getName(), is(America.NAME));
        assertThat(america.getLanguage().getName(), is(English.NAME));
        assertThat(america.getGovernment().getName(), is(DemocraticRepublic.NAME));
        assertThat(america.getCurrency().getName(), is(USD.NAME));
    }

    @Test
    public void testEnglandFactory() throws Exception {
        Country england = new England(new EnglandFactory());
        assertThat(england.getName(), is(England.NAME));
        assertThat(england.getLanguage().getName(), is(English.NAME));
        assertThat(england.getGovernment().getName(), is(Monarchy.NAME));
        assertThat(england.getCurrency().getName(), is(GBP.NAME));
    }

    @Test
    public void testNorthKoreaFactory() throws Exception {
        Country northKorea = new NorthKorea(new NorthKoreaFactory());
        assertThat(northKorea.getName(), is(NorthKorea.NAME));
        assertThat(northKorea.getLanguage().getName(), is(Korean.NAME));
        assertThat(northKorea.getGovernment().getName(), is(Dictatorship.NAME));
        assertThat(northKorea.getCurrency().getName(), is(NKW.NAME));
    }

}