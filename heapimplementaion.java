class heapimplementation{
	int size;
	int capacity;
	int []arr;
	heapimplementation(int c){
		capacity = c;
		size = 0 ;
		arr = new int[c];
		insert(10);
		insert(20);
		insert(15);
		insert(22);
		insert(23);
		insert(16);
		insert(19);
		print();
		System.out.println(extractmin());
		print();
	}
	
	void print(){
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	int left(int i){
		return 2*i+1;
	}
	
	int right(int i){
		return 2*i+2;
	}
	
	int parent(int i){
		return(i-1)/2;
	}
	
	void insert(int x){
		if(size == capacity)
			return ;
		arr[size++]=x;
		for(int i = size-1; parent(i)>=0 && arr[i]<arr[parent(i)];){
			int temp = arr[i];
			arr[i]=arr[parent(i)];
			arr[parent(i)]=temp;
			i = parent(i);
		}
	}
	
	void maxHeapify(int i){
		int lt = left(i);
		int rt = right(i);
		int largest = i;
		if(lt<size && arr[lt]>arr[largest])
			largest = lt;
		if(rt<size && arr[rt]>arr[largest])
			largest = rt;
		if(largest!=i){
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxHeapify(largest);
		}
	}
	
	void minHeapify(int i){
		int lt = left(i);
		int rt = right(i);
		int smallest = i;
		if(lt<size && arr[lt]<arr[smallest])
			smallest = lt;
		if(rt<size && arr[rt]<arr[smallest])
			smallest = rt;
		if(smallest!=i){
			int temp = arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
			minHeapify(smallest);
		}
	}
	int extractmin(){
		if(size==0)
			return -1;
		else if(size==1){
			int res = arr[0];
			size--;
			return res;
		}
	    else{
			int res = arr[0];
			arr[0]= arr[size-1];
			size--;
			minHeapify(0);
			return res;
		}
	}
	
	void decreasekey(int i, int key){
		arr[i]=key;
		while(i!=0 && arr[parent(i)]>arr[i]){
			int temp = arr[i];
			arr[i]=arr[parent(i)];
			arr[parent(i)]=temp;
			i = parent(i);
		}
	}
	
	void deletekey(int i){
		decreasekey(i,-1);
		extractmin();
	}
	
	void buildheap(){
		for(int i = (size-2)/2;i>=0;i--){
			minHeapify(i);
		}
	}
}