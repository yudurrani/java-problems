package iti1121Exercise;

import java.util.*;

public class Algothems {
	
	public static void main(String[] args) {
		
	int[] A = new int[]{1,5,3,2,6,7,8};
	int[] B = new int[]{10,3,22,6,97,10};
	
//	Arrays.parallelSort(A);
//	Arrays.parallelSort(B);
//	
	
	HashSet<Integer> chkA = new HashSet<Integer>();
	
	for(int i=0;i<A.length;i++) {
		chkA.add(A[i]);
	}
	
//	HashSet<Integer> chkB = new HashSet<Integer>();
//		chkB.add(B[i]);
	
	for(int i=0;i<B.length;i++) {
		
		if (chkA.contains(B[i])) {
			System.out.println(B[i]);
		};
	}
	
	
	
	
	}

}

//	public static void main(String[] args) {
//		Integer[] numbers = new Integer[]{1,5,3,2,6,7,8};
//		
//		HashSet<Integer> chkDub = new HashSet<Integer>();
//		
//		for(int i=0;i<numbers.length;i++) {
//			chkDub.add(numbers[i]);
//		}
//		
//		System.out.println(chkDub);
//		Arrays.parallelSort(a);
//		
//		
//	}
//}

//
//	// given thousands of telephone bill, and thousand of bills
//	// assume telephone numbers are printed on cheques
//	// find who did not pay
//
//	// let telephone number be the common ground between bills and cheques..
//	// solution 1: for loops
//	// solution 2: arrange bills in sequence and apply binary search with cheques..
//	// solution 3
//
//	static class TelephoneBill {
//
//		int phoneNumber;
//		int billNumber;
//
//		TelephoneBill(int phoneNumber, int billNumber) {
//			this.phoneNumber = phoneNumber;
//			this.billNumber = billNumber;
//		}
//
//		public String toString() {
//			return "Phone Number :" + phoneNumber + "   Bill Number :" + billNumber;
//		}
//	}
//
//	static class Chq {
//		int chqPhoneNumber;
//
//		Chq(int chqPhoneNumber) {
//			this.chqPhoneNumber = chqPhoneNumber;
//		}
//
//	}
//
//	public static boolean checkIfPaid(TelephoneBill TelephoneBill, Chq[] Chq) {
//
//		for (int i = 0; i < Chq.length; i++) {
//
//			if (TelephoneBill.phoneNumber == Chq[i].chqPhoneNumber) {
//				return true;
//			}
//		}
//		return false;
//
//	}
//
//	public static void main(String[] args) {
//		
//		HashMap<Integer, Chq> chqMap = new HashMap<Integer, Chq>();
//		int cphoneNumber = 5454;
//		for (int i = 0; i < 10; i++) {
//			chqMap.put(cphoneNumber, new Chq(cphoneNumber));
//			cphoneNumber += 4;
//		}
//		
//		
//		TelephoneBill[] newTelephoneBill = new TelephoneBill[10];
//		int phoneNumber = 5454;
//		int billNumber = 1;
//
//		for (int i = 0; i < 10; i++) {
//			newTelephoneBill[i] = new TelephoneBill(phoneNumber, billNumber);
//
//			phoneNumber += 1;
//			billNumber += 1;
//		}
//		
//		
//		
//		for (int i = 0; i < 10; i++) {
//			if(!chqMap.containsKey(newTelephoneBill[i].phoneNumber)) {
//				System.out.println(newTelephoneBill[i]);
//			};
//			
//		}
//		
//	}
//}
//
////
////		Chq[] newChqArr = new Chq[10];
////		int cphoneNumber = 5454;
////		for (int i = 0; i < 10; i++) {
////			newChqArr[i] = new Chq(cphoneNumber);
////			cphoneNumber += 4;
////
////		}
////
////		TelephoneBill[] newTelephoneBill = new TelephoneBill[10];
////		int phoneNumber = 5454;
////		int billNumber = 1;
////
////		for (int i = 0; i < 10; i++) {
////			newTelephoneBill[i] = new TelephoneBill(phoneNumber, billNumber);
////
////			phoneNumber += 1;
////			billNumber += 1;
////		}
////		
////		for(int i =0; i<10; i++) {
////			
////			if (!checkIfPaid(newTelephoneBill[i], newChqArr)) {
////				System.out.println(newTelephoneBill[i]);
////			
////			//			checkIfPaid(newTelephoneBill[i], newChqArr);
////			
////			}
////		}
//
//
