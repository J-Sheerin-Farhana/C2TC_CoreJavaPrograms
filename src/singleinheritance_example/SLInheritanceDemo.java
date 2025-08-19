package singleinheritance_example;

public class SlInheritanceDemo {
	public static void main(String[] args) {
		Trainer t=new Trainer(112,"Sheerin","Pondicherry",211,"Software Developer","Chennai");
		System.out.println(t);
		
		Person p=new Person(113,"Vishnuprya","Puducherry");
		System.out.println(p);
	}
}