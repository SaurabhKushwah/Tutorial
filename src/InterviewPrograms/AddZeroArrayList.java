package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddZeroArrayList {

	int a[] = { 3, 5, 0, 2, 0, 6 };

	ArrayList<Integer> al = new ArrayList<Integer>();

	public void addZero() {

		int size = a.length;
		int counter = 0;

		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
			if (a[i] == 0) {
				al.add(0);
				counter++;
			}

		}
		System.out.println(counter);
		int k = 0;
		while (k < counter) {
			al.remove(al.size() - 1);
			k++;
		}

		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddZeroArrayList az = new AddZeroArrayList();
		az.addZero();
	}

}
