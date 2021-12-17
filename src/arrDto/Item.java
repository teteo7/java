package arrDto;

public class Item {
	
	int ItemNo;
	String name;
	
	public Item() {
		super();
	}
	
	public Item(int itemNo, String name) {
		ItemNo = itemNo;
		this.name = name;
	}

	public int getItemNo() {
		return ItemNo;
	}

	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [ItemNo=" + ItemNo + ", name=" + name + "]";
	}
	
	
	
	

}
