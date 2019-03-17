package main;

public class Cat {
	private int age;
	private String species;
	private String eyeColor;
	private double weight;

	public Cat(int age, String species, String eyeColor, double weight) {
		super();
		this.age = age;
		this.species = species;
		this.eyeColor = eyeColor;
		this.weight = weight;
	}

	public Cat() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void meow() {
		System.out.println("Meow");
	}

	public void overWeight(double over) {
		weight += over;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", species=" + species + ", eyeColor=" + eyeColor + ", weight=" + weight + "]";
	}

}
