public interface Drivable{
    public void steer(int dir);
    public void accelerate(int speed); //done in abstract
    public void decelerate(int speed); //done in abstract
    public void honk(String sound);
}