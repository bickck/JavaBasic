package ch10_Quiz;

public class BankBookManager {

	public static void main(String[] args) {
		BankBook bankBook = new BankBook(10000, "USER", "522-633-4444");

		bankBook.show_BankBook();

		bankBook.insert_money(10000);

		bankBook.show_BankBook();

	}
}
