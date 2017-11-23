package zeatful.design.patterns.Creational.AbstractFactory.Country;

import org.junit.jupiter.api.Test;
import zeatful.design.patterns.Creational.AbstractFactory.Factory.EnglandFactory;

class EnglandTest {

    @Test
    public void testRunCountry() {
        England england = new England(new EnglandFactory());
        england.runCountry();
    }
}