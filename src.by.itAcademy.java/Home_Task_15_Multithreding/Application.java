package Home_Task_15_Multithreding;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import static java.awt.SystemColor.text;

public class Application {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setProducer("Audi");
        car1.setModel("A6");

        TypeAuto typeAuto1 = new TypeAuto();
        typeAuto1.setType("sedan");
        TypeAuto typeAuto2 = new TypeAuto();
        typeAuto2.setType("hatch-back");

        List<TypeAuto> typeAutos = Arrays.asList(typeAuto1, typeAuto2);
        car1.setTypeAutos(typeAutos);
        System.out.println(car1);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("text.xml");
            marshaller.marshal(car1, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        // блок unMarshall
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
            Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
            FileReader fileReader = new FileReader("text.xml");
            Cars cars = (Cars) unMarshaller.unmarshal(fileReader);
            System.out.println(cars);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
