package main.java.com.Atyeti4.Interface;

public class GameRunner {
    public static void main(String []args){
        com.Atyeti4.Interface.MarioGame m = new com.Atyeti4.Interface.MarioGame();
        ((com.Atyeti4.Interface.MarioGame) m).up();
        m.down();
        m.left();
        m.right();
    }
}
