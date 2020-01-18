
public class Animal {
	private int age;
	private float weight;
	
	//保留無參數的建構子
	//1.為了設計上的彈性
	//2.給工具或框架可以呼叫使用
	//******************************
	public Animal() {
		
	}
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("Age is ： "+age);
		System.out.println("Weught is ： "+weight);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getWeught() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
