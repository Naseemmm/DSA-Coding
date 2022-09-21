class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> table1 = new HashSet<>();
		HashSet<Integer> table2 = new HashSet<>();
		HashSet<Integer> table = new HashSet<>();

		for(int num : nums1) {
			table1.add(num);
		}

		for(int num : nums2) {
			table2.add(num);
		}

		for(int num : nums1) {
			if(table1.contains(num) && table2.contains(num)) {
				table.add(num);
			}
		}

		int[] res = new int[table.size()];

		int index = 0;

		for(int elem : table) {
			res[index] = elem;
			index++;
		}

		return res;
	}
}