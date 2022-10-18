package transport;

public interface Competing {

    void startMoving();

    void finishMoving();

    void pitStop();
    void maxSpeed();
    void bestTime();
}