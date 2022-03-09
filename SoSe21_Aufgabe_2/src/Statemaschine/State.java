package Statemaschine;

public interface State {
    void start();
    void select();
    void stop();
}
