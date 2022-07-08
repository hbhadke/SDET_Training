package main.java.com.atyeti.java;

public class Book {
private  int noOfCopies= 200;

void setNoOfCopies(int noOfCopies){
    this.noOfCopies=noOfCopies;
}
public int getNoOfCopies() {
        return noOfCopies;
    }
public int increaseNoOfCopies(int byHowMuch) {

   return this.noOfCopies + byHowMuch;
}
    public int decreaseNoOfCopies(int byHowMuch) {

        return this.noOfCopies - byHowMuch;
    }

}
