package co.algorithm.web;

import java.util.Scanner;

public class No1978 {

	// 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n];
		int cnt = 0;
		int find = 1;

		result[0] = find;
		
		for (int i = 0; i < n; i++) {

			do {

				if (!(find / result[i] == 0)) {
					// 1. 배열에 소수 입력하기 소수는 홀수만 비교해도 되고 배열에 저장되는 홀수를 새로 들어오는 수로나눠서 나눠진다 ? 소수X : 소수 O;
					// 1 ,3, 5, 7, 11, 13 ,17 ,19
					
					result[n] = find;
					System.out.println("소수임 !!! ==="+find);
				}

				find += 2;// 홀수만 찾을거니까 ++하기

			} while (cnt == n - 1);
		}

	}

}
