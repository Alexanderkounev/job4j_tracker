package ru.job4j.oop;

public class BallStory  {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        fox.tryEat(ball.tryRun(true));
        hare.tryEat(ball.tryRun(false));
        wolf.tryEat(ball.tryRun(false));
    }
}
