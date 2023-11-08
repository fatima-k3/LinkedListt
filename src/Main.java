//FatemehKarami
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		LinkedListt list =new LinkedListt();
		Scanner input = new Scanner(System.in);
		System.out.print("add ");
		int num1 = input.nextInt();
		list.add(num1);
		System.out.print("add ");
		int num2 = input.nextInt();
		list.add(num2);
		System.out.print("addFirst ");
		int num3 = input.nextInt();
		list.addFirst(num3);
		System.out.print("addFirst ");
		int num4 = input.nextInt();
		list.addFirst(num4);
		System.out.print("print list: ");
		list.print();
		System.out.println();
		System.out.print("findMiddle ");
		list.findMiddle();
		System.out.print("contains ");
		int num8 = input.nextInt();
		list.contains(num8);
		System.out.println("removeMiddle ");
		list.removeMiddle();
		System.out.print("print list: ");
		list.print();
		System.out.println();
		System.out.print("removeIndex ");
		int num5 = input.nextInt();
		list.removeIndex(num5);
		System.out.print("print list: ");
		list.print();
		System.out.println();
		System.out.print("removeIndex ");
		int num6 = input.nextInt();
		list.removeIndex(num6);
		System.out.print("print list: ");
		list.print();
		System.out.println();
		System.out.print("removeIndex ");
		int num7 = input.nextInt();
		list.removeIndex(num7);
		System.out.print("print list: ");
		list.print();
	}

}
