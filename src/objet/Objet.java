package objet;

public class Objet{
	



	String Name;
	String Type;
	public Objet(String name, String type) {
		super();
		Name = name;
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public static Objet drop(Objet[] inv) {
		int num = (int) (Math.random()*100);
		Objet obj = inv[num%inv.length];
		return obj;
	}
	
}

