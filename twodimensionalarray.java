class twodimensionalarray{
	public static void main(String []args){
		int arr[][] = {{1,2,3,4,5},{2,3,4},{3,2,4,2,9,8,23,67}};
		
		int arr1[][] = new int[3][];
		
		int arr2[][] = new int[6][];
		
		for(int i=0;i<arr.length;i++){
			arr1[i]= new int[arr[i].length];
			for(int j=0;j<arr[i].length;j++){
				arr1[i][j] = arr[i][j];
			}
		}
		
		for(int i=0;i<arr2.length;i++){
			arr2[i]= new int[i+1];
			for(int j=0;j<arr2[i].length;j++){
				arr2[i][j]=i+1;
			}
		}
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}