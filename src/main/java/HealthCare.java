public abstract class HealthCare {
    // abstract betyder at klassen ikke findes i virkeligheden, vi har nemlig ikke en person som der er ansat som HealthCare
    protected String name; //privat vio medføre at andre klasser ikke kan arve atributter i denne klasse
    //protected tilsvarer privat men gør at vi kan nedarve i andre klasser

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){ return name;
    }


}
