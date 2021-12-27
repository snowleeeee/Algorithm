package co.algorithm.class3;

public class Question04 {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		for (int i = 0; i < n; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("---------");
		}

		do {
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.print("\t" + a[i]);
			}
			System.out.println();
			int pc = (pl + pr) / 2;
			System.out.print(pc + "|\t");
			for (int i = 0; i < a.length; i++) {

				if (i == pl) {
					System.out.print("<-");
				} else if (i == pr) {
					System.out.print("->");
				} else if (i == pc)
					System.out.print(i);
				else
					System.out.print("\t");
			}

			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;

			} else {
				pr = pc - 1;
			}

		} while (pl <= pr);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 8, 9, 10 };
		int search = 8;
		int result = binSearch(arr, arr.length, search);
		System.out.println("\n");
		System.out.println("정답 : " + result);
	}
}
