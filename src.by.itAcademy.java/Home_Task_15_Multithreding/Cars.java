package Home_Task_15_Multithreding;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = {"producer", "model", "typeAutos"})
@XmlRootElement
public class Cars {
    private String producer;
    private String model;
    private List<TypeAuto> typeAutos;

    public List<TypeAuto> getTypeAutos() {
        return typeAutos;
    }

    public void setTypeAutos(List<TypeAuto> typeAutos) {
        this.typeAutos = typeAutos;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", typeAutos=" + typeAutos +
                '}';
    }
}
