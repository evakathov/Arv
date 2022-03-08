import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthCareApp {

    public static void main(String[] args) {
        //tre forskellige måder at instansiere mine objekter
        HealthCare healthCarePerson = new Nurse();

        Doctor doc = new Doctor();

        HealthCare nurse = new Nurse();

        healthCarePerson.setName("Johnny");
        doc.setName("HollyWood");
        nurse.setName("Rachel");


        List<HealthCare> hcp = new ArrayList<>();
        hcp.addAll(Arrays.asList(healthCarePerson, doc, nurse));

        for(int i=0; i < hcp.size(); i++){


            System.out.println(hcp.get(i).getName() + hcp.get(i).getClass());



        }
        /*
        HealthCare[] HC = new HealthCare[3];
        HC[0] =
        HC[1] =
        */


    }

}
