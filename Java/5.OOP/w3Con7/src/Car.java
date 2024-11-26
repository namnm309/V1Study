public class Car {
    private String make;
    private String model;
    private int year;

    // public Car(){
    //     this.make="Unknown Make";
    //     this.model="Unknown Model";
    //     this.year=2000;
    // }
    
    // public Car (String make,String model,int year){
    //     this.make=make;
    //     this.model=model;
    //     this.year=year;
    // }

    public Car(String make,String model,int year){
        this.make=(make ==null||make.isEmpty())? "Unknown Make" : make;
        this.model=(model ==null ||model.isEmpty()) ? "Unknown Model " : model;
        this.year=(year < 0) ? 2000 : year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    
}
