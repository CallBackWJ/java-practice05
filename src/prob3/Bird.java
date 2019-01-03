package prob3;

public abstract class Bird {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public abstract void sing();
	public abstract void fly();
	public abstract String toString();
	

}
