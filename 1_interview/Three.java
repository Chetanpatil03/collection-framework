import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Three {
	public static void printBooks(){
		System.out.println("+---------+----------------------+--------+----------+-------------------+");
		System.out.println("| book_id | title                | year   | quantity | author            |");
		System.out.println("+---------+----------------------+--------+----------+-------------------+");
		
		System.out.printf("| %-7d | %-20s | %-6d | %-8d | %-15s   |\n",1,"Chetan rav",2024,15,"Prakash");
		System.out.println("+---------+----------------------+--------+----------+-------------------+");
	}
	
	public static void printUser() {
		System.out.println("+---------+--------------------+--------------------+---------------+----------+");
		System.out.println("| user_id | name               | email              | phone         | status   |");
		System.out.println("+---------+--------------------+--------------------+---------------+----------+");
		System.out.printf("| %-7d | %-18s | %-18s | %-13s | %-8s |\n",1,"Chetan rav","chetan@email","9284691048","ACTIVE");
		System.out.println("+---------+--------------------+--------------------+---------------+----------+");
	}
    public static void main(String[] args) {
		printUser();
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","Pyton","Springboot"));
		currentBorrowedBooks(list);
		
		printTransaction();
        
    }
	
	public static void currentBorrowedBooks(ArrayList<String> books) {
		
		
		if (!books.isEmpty()) {
			System.out.println("Books borrowed by user :: "+"Chetan"+" [ "+102+"]");
			System.out.println("+---------+--------------------+");
			System.out.println("| Sr.No.  | Book name          |");
			System.out.println("+---------+--------------------+");
			
			for (int i = 0; i < books.size(); i++) {
				System.out.printf("| %-7d | %-18s |\n",i+1, books.get(i));
			}
			System.out.println("+---------+--------------------+");
			
			return;
		}
		
		System.out.println("There are no books borrowed by user :: "+"Chetan"+" [ "+102+"]");
	}
	
	public static void printTransaction(){
		System.out.println("+----------------+----------+----------+-------------+-------------+");
		System.out.println("| transaction_id | user_id  | book_id  | issue_date  | return_date |");
		System.out.println("+----------------+----------+----------+-------------+-------------+");
		System.out.printf("| %-14d | %-8s | %-8d | %-11s | %-11s |\n",1,1,2,"26-11-2025",null);
		
		System.out.println("+----------------+----------+----------+-------------+-------------+");
	}
}