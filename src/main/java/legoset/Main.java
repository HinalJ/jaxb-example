package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber(75211);
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoSet.setMinifigs(List.of(new Minifig(2, "Imperial Mudtrooper"), new Minifig(1 ,"Imperial Pilot"), new Minifig(1 ,"Mimban Stormtrooper")));
        legoSet.setWeight(new Weight("kg", 0.89));
        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoSet, System.out);
        JAXBHelper.toXML(legoSet, new FileOutputStream("legoSet.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoSet.xml")));
    }
}
