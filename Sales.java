package LAB9;

public class Sales {
	Item item;
	int qty;

	public Sales(Item r, int quantity) {
		this.item = r;
		this.qty = quantity;
	}

	public Double getSubTotal() {
		return this.qty * item.getRetail();
	}

	public Double getTax() {
		return .06 * item.getRetail();
	}

	public Double getTotal() {
		return getSubTotal() + getTax();
	}

	public String toString() {
		String str;
		str = String.format("-------------\nSubTotal: $%,.2f\nTax: $%,.2f\nTotal: $%,.2f", getSubTotal(), getTax(),
				getTotal());
		return item.toString() + str;
	}
}
