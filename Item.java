package project;

public class Item {
	private String product;
	private Integer unitPrice;
	private Integer gst;
	private Integer qty;
	
	public Item() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Item [product=" + product + ", unitPrice=" + unitPrice + ", gst=" + gst + ", qty=" + qty + "]";
	}



	public Item(String product, Integer unitPrice, Integer gst, Integer qty) {
		super();
		this.product = product;
		this.unitPrice = unitPrice;
		this.gst = gst;
		this.qty = qty;
	}



	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getGst() {
		return gst;
	}

	public void setGst(Integer gst) {
		this.gst = gst;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	
}
