



package ch03_generic2;

public class Product<K, M> {
	
	private K kind;
	private M model;
	
	public Product() {}
	
	public Product(K kind, M model) {
		this.kind = kind;
		this.model = model;
	}
	
	public K getKind() { return kind; }
	public void setKind(K kind) { this.kind = kind; }
	
	public M getModel() { return model; }
	public void setModel(M model) { this.model = model; }
	
	public String toString() {
		return kind + " - " + model;
	}

}


















