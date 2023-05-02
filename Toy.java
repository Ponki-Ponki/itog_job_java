/**
 * Toy
 */
public class Toy {
	
	private Integer id;
	private String name;
	private Integer value;
	private Integer dropoutPercent;
	
	public Toy(Integer id, String name, Integer value, Integer dropoutPercent) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.dropoutPercent = dropoutPercent;
	}
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public Integer getDropoutPercent() {
		return dropoutPercent;
	}
	
	public void setDropoutPercent(Integer dropoutPercent) {
		this.dropoutPercent = dropoutPercent;
	}
	
	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + "]";
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
}