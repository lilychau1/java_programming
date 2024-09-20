package p05_04_objects_and_references;

public class Example504 {
    public static void main(String[] args) {

        HealthStation childrensHospital = new HealthStation();
    
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
    
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.weighings());
    
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);
    
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.weighings());
    
        childrensHospital.feed(ethan);
        childrensHospital.feed(peter);
        
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
    
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
    
}
