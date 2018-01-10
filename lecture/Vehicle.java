public abstract class Vehicle implements Drivable{
    private int dir;
    private String make;
    private String model;
    private int speed = 0;
    private String sound;
    private Double cost;


    public void accelerate(int speed){
        this.speed += speed;
    }
    public void decelerate(int speed){
        this.speed -= speed;
    }
    



    public static void main(String[] args){
        Vehicle merc = Mercedes(750000.00, "BEEP!!", 0);
        merc.accelerate(10);
        merc.decelerate(5);
        merc.dir(260);
        merc.honk("MEEP!!");
    }

	/**
	 * @return the dir
	 */
	public int getDir() {
		return dir;
	}

	/**
	 * @param dir the dir to set
	 */
	public void setDir(int dir) {
		this.dir = dir;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}
	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}
}