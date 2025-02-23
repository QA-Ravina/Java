package Abstact_Interface;

public abstract class bird implements flyable{

    public String breed;

    public String getBreed() {
        return breed;
    }

    public bird(){
        this.breed = "breed";


    }
}
