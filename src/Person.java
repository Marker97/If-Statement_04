public class Person {
    public int age;
    public Person(){
        this.age = (int) Math.floor(Math.random()*(80-5+1)+5);
        System.out.println("Random age: " + this.age);
    }

    public void getStageLife(){
        if(this.age <= 12 ){
            System.out.println("The person is a Child");
        }else if (this.age >= 13 && this.age <= 19) {
            System.out.println("The person is a Teen");
        }else if (this.age >= 20 && this.age <= 59){
            System.out.println("The person is an Adult");
        }else{
            System.out.println("The person is a Senior Adult");
        }

    }
}

