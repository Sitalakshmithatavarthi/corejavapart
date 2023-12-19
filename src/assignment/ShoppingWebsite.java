package assignment;
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);

	}
}

class ItemOutOfStockException extends Exception {
	public ItemOutOfStockException(String msg) {
		super(msg);

	}

}

class Customer {
	int id;
	String name;
	double WalletBalance;
	String Adress;

	public Customer(int id, String name, double walletBalance, String adress) {

		this.id = id;
		this.name = name;
		this.WalletBalance = walletBalance;
		this.Adress = adress;
	}
}
	class Item {
		int id;
		String name;
		String companyName;
		double price;
		boolean isInStock;

		public Item(int id, String name, String companyName, double price, boolean isInStock) {
			super();
			this.id = id;
			this.name = name;
			this.companyName = companyName;
			this.price = price;
			this.isInStock = isInStock;
		}
	}
		class ShoppingException {
			public String PurchaseItem(Item i, Customer c)
					throws InsufficientBalanceException, ItemOutOfStockException {

				if (!i.isInStock) {
					throw new ItemOutOfStockException("item out of stock");
				} else if (i.price > c.WalletBalance) {
					throw new InsufficientBalanceException("customer wallet balance is not sufficient");

				} else {
					return "Order Successful";
				}
			}
		}

		public class ShoppingWebsite {

			public static void main(String[] args) {

				Customer c = new Customer(927392, "Steve", 5000, "USA");
				Item i = new Item(04354, "Tshirt", "US pole", 800, false);

				ShoppingException obj = new ShoppingException();
				try {
					String out = obj.PurchaseItem(i, c);
					System.out.println(out);
				} catch (InsufficientBalanceException | ItemOutOfStockException e) {

					System.out.println(e.getMessage());
				}

			}
		}

		
	


