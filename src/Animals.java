public class Animals {

    private String name;
    private String animalType;
    private int animalAge;
    private int animalPower;
    private int animalSpeed;

    private boolean animalGender;


    public Animals() {
    }

    public Animals(String name, String animalType, int animalAge, int animalPower, int animalSpeed, boolean animalGender) {
        this.name = name;
        this.animalType = animalType;
        this.animalAge = animalAge;
        this.animalPower = animalPower;
        this.animalSpeed = animalSpeed;
        this.animalGender = animalGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalPower() {
        return animalPower;
    }

    public void setAnimalPower(int animalPower) {
        this.animalPower = animalPower;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public boolean getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(boolean animalGender) {
        this.animalGender = animalGender;



    }

    public void getAll(){
        System.out.println("Name: "+getName() +" Type: "+getAnimalType()+" Age: "+getAnimalAge()+" Speed: "+getAnimalSpeed()+" Power: "+getAnimalPower()+" Gender: "+ getAnimalGender());
    }

    public void makeNoise(){

       String type = getAnimalType();
       if(type.equals("dog")){
           System.out.println("hrr!");
           
       }else{
           System.out.println("miavvv!");
       }


    }

    public void callIt(){
        String gender = getAnimalGender() ? "boy!" : "baby!";
        System.out.println("Tsskk, " + getName() + " come here my " +gender);


    }

}
