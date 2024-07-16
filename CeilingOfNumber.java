public class CeilingOfNumber {
    public static int cielingOfNumber(int arr[],int target) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid=(start+end)/2;
			
			boolean asc=arr[start]<arr[end];

			if(arr[mid]==target) {
				
				return mid;
			}
			
			if(asc) {
				
				if(arr[mid]<target) {
					start=mid+1;
				}
				else if(arr[mid]>target) {
					end=mid-1;
				}
				
			}
			
			else {
				if(arr[mid]>target) {
					start=mid+1;
				}
				else if(arr[mid]<target) {
					end=mid-1;
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,9,14,16,18};
		int target=15;
		int res=cielingOfNumber(arr, target);
		System.out.println(res);
		

	}
}
