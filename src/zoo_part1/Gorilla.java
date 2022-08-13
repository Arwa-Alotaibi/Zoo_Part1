package zoo_part1;


public class Gorilla  extends Mammal{
	public void throwSomething() {
		energyLevel= energyLevel-5;
		 System.out.println("the Gorilla has thrown something :( decrease the energy level by "+":"+energyLevel);
		 
	 }
	 
	 
	 public void eatBananas() {
		 energyLevel = energyLevel +10;
		 System.out.println("the gorilla's satisfaction :) and increase its energy:"+" "+energyLevel);
		 
	 }
	 
	 public void climb() {
		 energyLevel = energyLevel -10;
		 System.out.println("gorilla has climbed a tree and decrease its energy by 10"+":"+energyLevel);

		 
}
}
