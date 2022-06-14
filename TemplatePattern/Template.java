package TemplatePattern;

public class Template {
    public static void main(String[] args) {
        BubbleShooter bubbleShooter = new BubbleShooter();
        bubbleShooter.play();

        CircleJumper circleJumper = new CircleJumper();
        circleJumper.play();
    }
}
