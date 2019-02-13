public class Guest {

	private String name;
	public int wallet;

	public Guest(String name, int wallet) {
		this.name = name;
		this.wallet = wallet;
	}

	public String getGuestName() {
		return this.name;
	}

	public int getGuestWalletValue(){
		return this.wallet;
	}

	public int removeMoneyFromWallet(int roomCost){
		return this.wallet - roomCost;
	}

}
