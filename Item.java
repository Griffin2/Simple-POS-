package LAB9;

import java.text.DecimalFormat;

public class Item {
	// This class uses an inner class
	// Instance variables
	DecimalFormat df = new DecimalFormat("0.00");
	private String description;
	private int itemNumber;
	private CostData cost;

	// overloaded constructors
	public Item(String desc, double wholesale, double retail) {
		// this reference
		this.description = desc;
		this.itemNumber = 0;
		this.cost = new CostData(wholesale, retail);
	}

	// constructors
	public Item(String desc, int itemNum, double wholesale, double retail) {
		this.description = desc;
		this.itemNumber = itemNum;
		this.cost = new CostData(wholesale, retail);
	}

	// Overrode String
	public String toString() {
		String str;

		str = String.format("Description: %s\n" + "ItemNumber: %d\n" + "Unit Price: ", description, itemNumber);
		// decimal format
		return str + df.format(cost.retail);
	}

	// instance Method
	public Double getRetail() {
		return cost.retail;
	}

	// INNER CLASS
	private class CostData {
		public double wholesale, retail;

		public CostData(double w, double r) {
			this.wholesale = w;
			this.retail = r;
		}
	}
}