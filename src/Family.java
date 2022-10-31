public class Family {

    private static final int MAX_FAM_MEMBERS = 10;
    private int numberOfFamMembers;
    private int index;


    Person[] family;

    public Family(){
        family = new Person[MAX_FAM_MEMBERS];
        numberOfFamMembers = 0;
    }
    public void display(){
        for(int index = 0; index < numberOfFamMembers; index++){
            System.out.println(family[index]);
        }
    }
    public boolean addPerson(String name, int age){
        if(numberOfFamMembers < MAX_FAM_MEMBERS){
            family[numberOfFamMembers] = new Person(name, age);
            numberOfFamMembers++;
            return true;
        } else {
            return false;
        }
    }
    public void birthday(String name){
        for(int index = 0; index < this.index; index++){
            if(family[index].getName().equals(name)){
                family[index].incrementAge();
            }
        }
    }
    public int getTotalAge(){
        int totalAge = 0;
        for(int index = 0; index < numberOfFamMembers; index++){
            totalAge += family[index].getAge();
        }
        return totalAge;
    }
    public int getNumberOfPeople(){
        return numberOfFamMembers;
    }
}