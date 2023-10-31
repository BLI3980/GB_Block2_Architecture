package ru.gb.seminar03.lsp.exampleAfter;

/**
 * Тип S будет подтипом Т тогда и только тогда, когда каждому объекту oS типа S соответствует объект oT типа Т
 * таким образом, что для всех программ Р, реализованные в терминах Т, поведение Р не будет меняться, если
 * oT заменить на oS.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();             // oT
        bird.fly();
        Bird bird1 = new Bird();             // oT
        Bird bird2 = new Bird();             // oT
        Bird bird3 = new Bird();             // oT

        Ostrich ostrich1 = new Ostrich();    // oS

        Bird[] birds = new Bird[4];
        birds[0] = bird1;
        birds[1] = bird2;
        birds[2] = bird3;
        birds[3] = ostrich1;

        flyBirds(birds);                    // P

    }

    public static void flyBirds(Bird[] birds) {
        for (Bird bird : birds) {
            if (bird.isCanFly()) {
                bird.fly();
            }
        }
    }
}
