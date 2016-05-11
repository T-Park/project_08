package problemDomain;

import java.util.Scanner;
import java.util.ArrayList;

public class Function {

	Scanner scan = new Scanner(System.in);

	ArrayList<Product> list = new ArrayList<>();

	void display() {
		System.out.println(" ");
		System.out.println("1.��ǰ���");
		System.out.println("2.��ǰ����");
		System.out.println("3.��ǰ���");
		System.out.println("4.��ǰ�˻�");
		System.out.println("0.����\n");
		System.out.println("���ϴ� ����� �����ÿ� :");

	}

	public void regist(int productId,String name, int price, String kind, String discrpt, int inven) { //��ǰ��� ���

		//String Y_N;

		//do {

			Product i = new Product();

			System.out.println("��ǰID�� �Է��Ͻÿ�");
			i.setProductid(productId);
			System.out.println("��ǰ��  �̸��� �Է��Ͻÿ�");
			i.setProductname(name);
			System.out.println("��ǰ�� ������ �Է��Ͻÿ�.");
			i.setPrice(price);
			System.out.println("��ǰ�� ������ �Է��Ͻÿ�.");
			i.setProducttype(kind);
			System.out.println("��ǰ�� ������ �Է��Ͻÿ�.");
			i.setExplanation(discrpt);
			System.out.println("����� �Է��Ͻÿ�");
			i.setInventory(inven);

			list.add(i);
			sort();
			System.out.println("��ϵǾ����ϴ�. ");
			//Y_N = scan.next();

			//if (Y_N.equals("N") || Y_N.equals("n"))
			//	break;
		//} while (true);

	}

	void delete() { // ��ǰ���� ���
		int menu, ID, c;
		String name, Y_N, del;

		do {

			System.out.println("1.��ǰ ID�� ����");
			System.out.println("2.��ǰ �̸����� ����");
			System.out.println("0.���ư���");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("��ǰ ID�� �Է��Ͻÿ�.");
				ID = scan.nextInt();
				for (c = 0; c < list.size(); c++) {
					Product i = new Product();
					i = list.get(c);
					if (i.getProductid() == ID) {
						System.out.println("���� �����Ͻðڽ��ϱ�? (Y/N)");
						del = scan.next();

						if (del.equals("N") || del.equals("n"))
							break;
						list.remove(c);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}			
				break;
			case 2:
				System.out.println("��ǰ �̸��� �Է��Ͻÿ�.");
				name = scan.next();
				for (c = 0; c < list.size(); c++) {
					Product i = new Product();
					i = list.get(c);
					if (name.equals(i.getProductname())) {
						System.out.println("���� �����Ͻðڽ��ϱ�? (Y/N)");
						del = scan.next();
						
						if (del.equals("N") || del.equals("n"))
							break;
						list.remove(c);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}			
				break;
			case 0:
				break;
			}

			if (menu == 0)
				break;

			System.out.println("��� �����Ͻðڽ��ϱ�? (Y/N) : ");
			Y_N = scan.next();

			if (Y_N.equals("N") || Y_N.equals("n"))
				break;

		} while (true);
	}

	public String[][] catalog() { //��ǰ��� ���
		String[][] result;
		String back;

		result = new String[list.size()][6];
		for (int a = 0; a < list.size(); a++) {

			Product i = new Product();
			i = list.get(a);
			
			result[a][0] = Integer.toString(i.getProductid());
			result[a][1] = i.getProductname();
			result[a][2] = Integer.toString(i.getPrice());
			result[a][3] = i.getProducttype();
			result[a][4] = i.getExplanation();
			result[a][5] = Integer.toString(i.getInventory());
		}
		
		return result;
	}

	void search() { //��ǰ�˻� ���
		int menu, ID, c;
		String name, type, Y_N;

		do {
			System.out.println("1.��ǰ ID�� ã��");
			System.out.println("2.��ǰ �̸����� ã��");
			System.out.println("3.������ ã��");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("��ǰ ID�� �Է��Ͻÿ�.");
				ID = scan.nextInt();
				for (c = 0; c < list.size(); c++) {
					Product i = new Product();
					i = list.get(c);
					if (i.getProductid() == ID) {
						System.out.print("��ǰID :" + i.getProductid() + "  ��ǰ�̸� :" + i.getProductname() + "  ���� :"
								+ i.getPrice() + "��" + "  ���� :" + i.getProducttype() + "  ���� :" + i.getExplanation()
								+ "  ��� :" + i.getInventory());
						System.out.println(" ");
					}
				}
				break;
			case 2:
				System.out.println("��ǰ �̸��� �Է��Ͻÿ�.");
				name = scan.next();
				for (c = 0; c < list.size(); c++) {
					Product i = new Product();
					i = list.get(c);
					if (name.equals(i.getProductname())) {
						System.out.print("��ǰID :" + i.getProductid() + "  ��ǰ�̸� :" + i.getProductname() + "  ���� :"
								+ i.getPrice() + "��" + "  ���� :" + i.getProducttype() + "  ���� :" + i.getExplanation()
								+ "  ��� :" + i.getInventory());
						System.out.println(" ");
					}
				}
				break;
			case 3:
				System.out.println("������ �Է��Ͻÿ�.");
				type = scan.next();
				for (c = 0; c < list.size(); c++) {
					Product i = new Product();
					i = list.get(c);
					if (type.equals(i.getProducttype())) {
						System.out.print("��ǰID :" + i.getProductid() + "  ��ǰ�̸� :" + i.getProductname() + "  ���� :"
								+ i.getPrice() + "��" + "  ���� :" + i.getProducttype() + "  ���� :" + i.getExplanation()
								+ "  ��� :" + i.getInventory());
						System.out.println(" ");
					}
				}
			}
			System.out.println("��� �˻��Ͻðڽ��ϱ�? (Y/N) : ");
			Y_N = scan.next();

			if (Y_N.equals("N") || Y_N.equals("n"))
				break;

		} while (true);

	}

	void sort() { //��ǰID �������� (ID ���� �ͺ��� ����)

		Product list_1 = new Product();
		Product list_2 = new Product();
		for (int i = 0; i < list.size() - 1; i++) {

			list_1 = list.get(i);

			for (int j = i + 1; j < list.size(); j++) {

				list_2 = list.get(j);

				if (list_1.getProductid() > list_2.getProductid()) {
					list.set(i, list_2);
					list.set(j, list_1);
				}

			}

		}
	}
	void cash(){
		
	}
	
}