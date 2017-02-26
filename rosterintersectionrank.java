	import java.io.*;
	import java.util.*;
	
	public class solution {
	
		static ArrayList<String> rosterintersection(String rosterone, String rostertwo) {
		
			String[] rosteronearray = rosterone.trim().split("[,]");
			String[] rostertwoarray = rostertwo.trim().split("[,]");
			
			HashSet<String> rosteronehash = new HashSet<String>();
			
			for (String s: rosteronearray) {
			
				rosteronehash.add(s);
				
			}
			
			ArrayList<String> solution = new ArrayList<String>();
			
			for (String s : rostertwoarray) {
				
				if (rosteronehash.contains(s)) {
					
					System.out.println("duplicate spotted!" + s);
					solution.add(s);
				}
				
			}
			
			return solution;
			
		}
		
		static void assignrankbyscore(int[] scores) {
			
			Arrays.sort(scores);
			
			Hashtable<Integer, Integer> rankscore = new Hashtable<Integer, Integer>();
			
			int rankcount = 1;
			
			for (int s: scores) {
				
				if (rankscore.containsKey(s)) {
					System.out.println("score: " + s + " @ rank: " + rankscore.get(s));
				}
				
				else {
					
					rankscore.put(s, rankcount);
					System.out.println("score: " + s + " @ rank: " + rankcount);
					rankcount += 1;
					
				}
				
				
			}
			
			
		}
		
		/*1. Given a one dimensional array of data write a function that returns
	   a new array with the data reversed.  Don't just use the reverse
	   function that is built into your environment.*/
		
		static int[] reverseprimitive(int[] array) {
			
			int[] solution = new int[array.length];
			
			for (int x = 0; x < array.length; x++) {
				
				solution[x] = array[array.length - 1 - x];
				
			}
			
			return solution;
					
		}
		
		static int[] swap(int[] array) {
			
			for (int x = 0; x < array.length/2; x++) {
				
				int temp = array[x];
				System.out.println("swap " + array[x] + " with " + array[array.length - 1 -x]);
				array[x] = array[array.length - 1 - x];
				array[array.length - 1 - x] = temp;
				
			}
			
			return array;
			
		}
		
		//EntryID | userName | TotalScore | CompetituionRank EntryID int UserName String TotalScore Int CompeitionRank Integer
			/* Coding Question: Given an array of fantasy entry objects   : EntryID | userName | TotalScore | CompetituionRank EntryID int UserName String TotalScore Int CompeitionRank Integer 
			 * Example: 100, 89,89,71,50 would be ranked: 1,2,2,4,5 (3 is skipped since 2 and 3 tied) input: Entry[] entries */
			
		static void rankbyscore(String[] data) {
		
			Hashtable<String, ArrayList<String>> mainhash = new Hashtable<String, ArrayList<String>>();
			ArrayList<String> arraylist = new ArrayList<String>();
			
			for (int x = 0; x < data.length; x++) {
				
				String[] stringsplit = data[x].trim().split("\\|");
				System.out.println("0 = " + stringsplit[0]);
				System.out.println("1 = " + stringsplit[1]);
				System.out.println("2 = " + stringsplit[2]);
				System.out.println("3 = " + stringsplit[3]);
				
				arraylist.add(stringsplit[0]);
				arraylist.add(stringsplit[2]);
				ArrayList<String> arraycopy = new ArrayList<String>();
				arraycopy.addAll(arraylist);
				
				mainhash.put(stringsplit[1], arraycopy);
				
				arraylist.clear();
			}
			
			Set<String> users = mainhash.keySet();
			ArrayList<Integer> userscores = new ArrayList<Integer>();
			
			for (String s: users) {
				
				System.out.println("USER= " + s + " DATA = " + mainhash.get(s));
				userscores.add(Integer.parseInt(mainhash.get(s).get(1)));
	
			}
			
		
			
			int temp = 0;
			int rank = 0;
			
			Hashtable<Integer, Integer> assignrankstoscores = new Hashtable<Integer, Integer>();
			
			for (int x: userscores) {
				
				if (x == temp) {
					
					System.out.println("score = " + x + " rank = " + rank);
					assignrankstoscores.put(x, rank);
					rank += 1;
				}
				
				else {
				
					rank+= 1;
					System.out.println("score = " + x + " rank =" + rank);
					assignrankstoscores.put(x, rank);
				}
				
				temp = x;
				
			}
			
			System.out.println("printing users");
			
			for (String s: users) {
				//System.out.println(s + " score: " + mainhash.get(s).get(1) + " rank:" + assignrankstoscores.get(Integer.parseInt(mainhash.get(s).get(1))));
				mainhash.get(s).add(assignrankstoscores.get(Integer.parseInt(mainhash.get(s).get(1))) + "");
			}
			
			for (String s: users) {
				System.out.println("user: " + s + " data = " + mainhash.get(s));
			}
			
		}
		
		static int fibonnaci(int n) {
			
			if (n == 1 || n == 0) {
				return 1;
			}
			
			else {
				return fibonnaci(n-1) + fibonnaci(n-2);
			}
			
		}
		
		static void missingint(int[] input, int totalcount) {
			
			int idealsum = (totalcount * (totalcount + 1)/2);
			System.out.println(idealsum);
	        int runsum = 0;
			
			for (int x: input) {
				runsum += x;
			}
			
			System.out.println("missing int = " + (idealsum - runsum));
			
		}
		
		static void finddupes(int[] array) {
			
			HashSet<Integer> arraycheck = new HashSet<Integer>();
			
			for (int x : array) {
				
				if (arraycheck.contains(x)) {
					System.out.println("DUPLICATE SPOTTED: " + x);
				}
				else {
					arraycheck.add(x);
				}
				
			}
			
		}
		
		static void binarysearch(int[] array, int target) {
			
			Arrays.sort(array);
			
			int low = 0;
			int high = array.length - 1;
			
			while (high >= low) {
				
				int middle = (low + high)/2;
				
				if (array[middle] == target) {
					
					System.out.println("found " + target + " @ " + middle);
					break;
				}
				
				else if (array[middle] < target) {
					
					System.out.println("going high");
					low = middle + 1;
					
				}
				
				else if (array[middle] > target) {
					
					System.out.println("going low");
					high = middle - 1;
					
				}
				
			}
				
		}
		
		static void findpairssum(int[] array, int target) {
			
			for (int x = 0; x < array.length; x++) {
				
				int difference = target - array[x];
				
				for (int y = 1; y < array.length; y++) {
				
					if (array[y] == difference) {
						System.out.println("spotted pairs = " + array[y] + array[x]);
					}
					
				}
					
			}
		}
		
		static void findalldupes(int[] array) {
			
			Hashtable<Integer, Integer> arrayhash = new Hashtable<Integer, Integer>();
			
			for (int x: array) {
				
				if (arrayhash.containsKey(x)) {
					
					arrayhash.put(x,  1 + arrayhash.get(x));
					
				}
				
				else {
					arrayhash.put(x, 1);
				}
			}
			
			Set<Integer> hashkeys = arrayhash.keySet();
			
			for (int x: hashkeys) {
				System.out.println("int = " + x + "frequency = " + arrayhash.get(x));
			}

		}
		
		static int[] removeduplicates(int[] array) {
			
			HashSet<Integer> arrayhash = new HashSet<Integer>(); 
			
			for (int x: array) {
				
				if (arrayhash.contains(x)) {
					continue;
				}
				
				else {
					arrayhash.add(x);
				}
				
			}
			
			int[] solution = new int[arrayhash.size()];
			int count = 0;
			
			for (int x: arrayhash) {
				System.out.println(x);
				solution[count] = x;
				count+= 1;
			}
			
			return solution;
			
		}
		
		/*public static void sort(int[] array) {
			
			quicksort(0, array.length - 1, array);
			
		}
		
		private static void quicksort(int low, int high, int[] array) {
			
			int i = low;
			int j = high;
			
			int pivot = array[low + (high-low)/2];
			
			while (i <= j) {
				
				while (array[i] < pivot) {
					i++;
				}
				while (array[j] > pivot) {
					j--;
				}
				if (i <= j) {
					swap(i, j, array);
					i++;
					j--;
				}
				
				if (low < j) {
					quicksort(low, j, array);
				}
				if (i < high) {
					quicksort(i, high, array);
				}
			
			}
			
		}
		
		private static void swap(int i, int j, int[] array) {
			
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
		}*/
		
		private static void intersection(int[] array1, int[] array2) {
			
			HashSet<Integer> array1hash = new HashSet<Integer>();
			
			for (int x: array1) {
				array1hash.add(x);
			}
			
			for (int x: array2) {
				
				if (array1hash.contains(x)) {
					System.out.println("intersection = " + x);	
				}	
			}
		}
		
		static void everyelementtwice(int[] array) {
			
			Hashtable<Integer, Integer> mainhash = new Hashtable<Integer, Integer>();
			
			for (int x : array) {
				
				System.out.println(x);
								
				if (mainhash.containsKey(x)) {
					mainhash.put(x, 1 + mainhash.get(x));
				}
				else {
					mainhash.put(x,  1);
				}
				
			}
			
			Set<Integer> mainhashkeys = mainhash.keySet();
			
			for (int x: mainhashkeys) {
				
				if (mainhash.get(x) == 1) {
					System.out.println("only once = " + x);
				}
				
			}	
		}
		
		static void kthsmallest(int[] array, int k) {
			
			Arrays.sort(array);
			
			System.out.println("kth smallest = " + array[k-1]);
			
			
		}
		
		static void kthlargest(int[] array, int k) {
			
			Arrays.sort(array);
			
			int[] bylargest = new int[array.length];
			int count = 0;
			
			for (int x: array) {
				bylargest[count] = x;
				count += 1;
			}
			
			System.out.println("kth largest = " + bylargest[k-1]);
			
			
		}
		
		/*static void threecommon(int[] array1, int[] array2, int[] array3) {
			
			HashSet<Integer> hashsetone = new HashSet<Integer>();
			HashSet<Integer> hashsettwo = new HashSet<Integer>();
			HashSet<Integer> hashsetthree = new HashSet<Integer>();
			
			for (int x: array1) {
				hashsetone.add(x);
			}
			
			for (int x: array2) {
				hashsettwo.add(x);
			}
			
			for (int x: array3) {
				hashsetthree.add(x);
			}
			
			for (int x: array1) {
				if (hashsettwo.contains(x) && hashsetthree.contains(x)) {
					System.out.println("common elements = " + x);
				}
			}
		}*/
		
		static void firstrepeat(int[] array) {
			
			Hashtable<Integer, ArrayList<Integer>> mainhash = new Hashtable<Integer, ArrayList<Integer>>();
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			
			int index = 0;
			int smallindex = 0;
			int smallnum = 0;
			boolean foundone = false;
			
			for (int x: array) {
				
				if (mainhash.containsKey(x)) {
					
					System.out.println("DUPLICATE!");
					int updatedfreq = mainhash.get(x).get(0) + 1;
					mainhash.get(x).set(0, updatedfreq);
					System.out.println(x + " data = " + mainhash.get(x));
					
					if (foundone == false) {
						smallindex = mainhash.get(x).get(1);
						smallnum = x;
						foundone = true;
					}
					else {
						
						if (mainhash.get(x).get(1) < smallindex) {
							smallindex = mainhash.get(x).get(1);
							smallnum = x;
						}
						
					}
					
					
				}
				
				else {
					
					arraylist.add(1);
					arraylist.add(index);
					ArrayList<Integer> arraycopy = new ArrayList<Integer>();
					arraycopy.addAll(arraylist);
					mainhash.put(x, arraycopy);
					arraylist.clear();
					index += 1;
					
				}
				
			}
	
		System.out.println("earliest repeating number = " + smallnum + " @ index = " + smallindex);
	
		}
		
		static void firstnonrepeat(int[] array) {
			
			Hashtable<Integer, ArrayList<Integer>> mainhash = new Hashtable<Integer, ArrayList<Integer>>();
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			
			int index = 0;
			
			for (int x: array) {
				
				if (mainhash.containsKey(x)) {
					
					int updatefreq = mainhash.get(x).get(0) + 1;
					mainhash.get(x).set(0, updatefreq);
					
				}
				
				else {
					arraylist.add(1);
					arraylist.add(index);
					ArrayList<Integer> arraycopy = new ArrayList<Integer>();
					arraycopy.addAll(arraylist);
					mainhash.put(x, arraycopy);
					index += 1;
					arraylist.clear();
				}
			}
			
			Set<Integer> mainkeys = mainhash.keySet();
			
			boolean foundone = false;
			int smallestindex = -1;
			int smallestnum = -1;
			
			for (int x: mainkeys) {
				
				if (mainhash.get(x).get(0) == 1) {
					
					if (foundone == false) {
						
						smallestindex = mainhash.get(x).get(1);
						smallestnum = x;
						foundone = true;
					
					}
					
					else {
						
						if (mainhash.get(x).get(1) < smallestindex) {
							
							smallestindex = mainhash.get(x).get(1);
							smallestnum = x;
							
						}
						
						
					}
					
				}
				
			}
			
			System.out.println("first nonrepeat = " + smallestnum + " @ smallestindex = " + smallestindex);
			
		}
		
		static void findsmallpos(int[] array) {
			
			Arrays.sort(array);
			int count = 1;
			
			HashSet<Integer> allnums = new HashSet<Integer>();
			
			for (int x: array) {
				
				allnums.add(x);

			}
			
			for (int x = 1; x < array.length; x++) {
				
				if (allnums.contains(x)) {
					
				}
				else {
					
					System.out.println("DOESN'T CONTAIN: " + x);
				
				}
				
				
			}
			
		}
	
		static void sort(int[] array) {
			
			mergesort(0, array.length-1, array);
			
		}
		
		static void mergesort(int low, int high, int[] array) {
			
			int i = low;
			int j = high;
			
			int pivot = array[low + (high-low)/2];
			
			while (i <= j) {
				while(array[i] < pivot) {
					i++;
				}
				while (array[j] > pivot) {
					j--;
				}
				if (i <= j) {
					swap(i, j, array);
					i++;
					j--;
				}
			}
			
			if (low < j) {
				mergesort(low, j, array);
			}
			if (i < high) {
				mergesort(i, high, array);
			}
			
		}
		
		private static void swap(int i, int j, int[] array) {
			
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			 
		}
		
		/*static void binarysearch(int[] array, int target) {
			
			Arrays.sort(array);
			
			int low = 0;
			int high = array.length - 1;
			
			while (high >= low) {
				
				int middle = (low + high)/2;
				
				if (array[middle] == target) {
					
					System.out.println("found " + target + " @ " + middle);
					break;
				}
				
				else if (array[middle] < target) {
					
					System.out.println("going high");
					low = middle + 1;
					
				}
				
				else if (array[middle] > target) {
					
					System.out.println("going low");
					high = middle - 1;
					
				}
				
			}
				
		}*/
		
		static void binarysearchfinal(int[] array, int target) {
			
			int low = 0;
			int high = array.length-1;
			
			while (low <= high) {
				
				int middle = (low + high)/2;
				
				if (array[middle] == target) {
					System.out.println("found this shit! " + target + " @ " + middle);
					break;
				}
				else if (array[middle] > target) {
					high = middle - 1;
				}
				else if (array[middle] < target) {
					low = middle + 1;
				}
				
			}
	
			
		}
		
		static void giveranks(int[] array) {
			
			Hashtable<Integer, Integer> mainhash = new Hashtable<Integer, Integer>();
			int rank = 0;
			
			for (int x: array)  {
				
				if (mainhash.containsKey(x)) {
				
					System.out.println("score = " + x + "rank = " + mainhash.get(x));
					rank += 1;
				}
				
				else {
				
				rank += 1;
				mainhash.put(x, rank);
				
				System.out.println("score = " + x + "rank = " + mainhash.get(x));

				
				}
			}
			
		}
		
		static void binarysearchyo(int[] array, int target) {
			
			Arrays.sort(array);
			
			int low = 0;
			int high = array.length-1;
			
			while (low <= high) {
				int middle = (low + high)/2;
				
				if (array[middle] == target) {
					
					System.out.println("found " + target + " @ " + middle + "!");
					break;
					
				}
				
				else if (array[middle] > target) {
					
					high = middle - 1;
					
				}
				
				else if (array[middle] < target) {
					low = middle + 1;
				}
					
			}
			
			
		}
		
		public static void main(String[] args) {
			//100, 89,89,71,50 would be ranked: 1,2,2,4,5 
			
			//int[] rankarray = {100, 89, 89, 71, 50};
			
			//giveranks(rankarray);
			
			int[] trickarray = {1, 3, 6, 10, 15, 11};
			
			binarysearchyo(trickarray, 1);
			
			findsmallpos(trickarray);
			
			int[] firstrepeat = {10, 5, 3, 4, 3, 5, 6};
			
			//firstrepeat(firstrepeat);
			//firstnonrepeat(firstrepeat);
			
			int[] mainarray = {10, 5, 3, 4, 3, 5, 6};
			
			int[] array1 = {21, 34, 41, 22, 35};
			int[] array2 = {61, 34, 45, 21, 11};
			int[] array3 = {1, 1, 2, 2, 3, 4, 4, 5, 5};
			int[] array4 = {1, 2, 3, 9, 4};
			int[] array5 = {10, 20, 30, 50, 40};
			int[] array6 = {1, 5, 10, 20, 40, 80};
			int[] array7 = {6, 7, 20, 80, 100};
			int[] array8 = {3, 4, 15, 20, 30, 70, 80, 120};
			
			//threecommon()
			
			//kthsmallest(array4, 2);
			//kthlargest(array5, 3);
			
			//everyelementtwice(array3);
			
			//intersection(array1, array2);
			
			int[] missingintinput = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,100};
			
			int[] array = {0, 3, 1, 2, 6, 7, 9, 4, 5, 2, 3, 1, 3, 6, 2, 3};

			int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
		
			sort(unsorted);
			System.out.println(Arrays.toString(unsorted));
			
			//removeduplicates(array);
			
			//findalldupes(array);
			
			//findpairssum(array, 4);
			//binarysearch(array, 6);
			
			//finddupes(array);
			
			//missingint(missingintinput, 100);
			
			//System.out.println(fibonnaci(6));
			
			//allocate("south");
			//allocate("south");
			//allocate("south");
			//allocate("south");
			
			//deallocate("south1");
			
			//fiish both problems
			//implement mergesort, quicksort, bubblesort
			//redo 
			
			//allocate("south");
			//allocate("south");
			//allocate("south");
			
			/*int[] array1 = {5, 3, 1};
			//1, 3, 5
			//1, *2*, 3, 4, 5
			System.out.println(nextservernumber(array1));
			//2
			
			int[] array2 = {5, 4, 1, 2};
			//1, 2, 4, 5
			//1, 2, **3**
			nextservernumber(array2);
			//3
			
			int[] array3 = {3, 2, 1};
			nextservernumber(array3);
			//1, 2, 3
			//1, 2, 3, 4
			int[] array4 = {2, 3};
			nextservernumber(array4);
			//*1*
			
			int[] array5 = {};
			nextservernumber(array5);
			//1*/
			
			//EntryID | userName | TotalScore | CompetituionRank EntryID int UserName String TotalScore Int CompeitionRank Integer
			//100, 89,89,71,50 would be ranked: 1,2,2,4,5 (3 is skipped since 2 and 3 tied)
			
			//String[] data = {"1|yishan|100|null", "2|daniel|89|null", "3|dajang|89|null", "4|mille|71|null", "5|finn|50|null"};
			
			//rankbyscore(data);
			
			/*int[] array = {1, 2, 3, 4};
			
			for (int x: swap(array)) {
				
				System.out.println(x);
				
			}
			
			String saints = "drew brees, mark ingram, michael thomas, brandin cooks, willie snead";
			String falcons = "matt ryan, devonta freeman, julio jones, taylor gabriel, tevin coleman, mark ingram";
			
			int[] scores = {72, 98, 82, 9, 80, 67, 50, 80, 74, 13, 75, 33};
			
			assignrankbyscore(scores);
			
			rosterintersection(saints, falcons);*/
		}
	}
