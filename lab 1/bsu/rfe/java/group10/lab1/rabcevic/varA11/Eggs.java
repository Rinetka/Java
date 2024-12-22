package bsu.rfe.java.group10.lab1.rabcevic.varA11;

public class Eggs extends Food {

	private String qual;
	
	public Eggs(String qual) {
		super("Яйца");
		this.qual = qual;
	}
	
	public String getSize() {
		return qual;
	}

	public void setSize(String qual) {
		this.qual = qual;
	}

	@Override
	public String toString() {
		return super.toString() + " в количестве '" + qual.toUpperCase() + "'";
		}
	
	@Override
	public void consume() {
		System.out.println(this + " съедено");
	}
}