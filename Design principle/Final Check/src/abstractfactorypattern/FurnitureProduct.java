package abstractfactorypattern;

public class FurnitureProduct extends Order {

	public FurnitureProduct(Channel channel) {
		super(channel, ProductType.FURNITURE);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Processing furniture product order");
	}

}
