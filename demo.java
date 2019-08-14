class demo{
	public static void main(String...s){
	int a[]={1,3,5,2,4};
	int l=a.length;
	int temp;
	for(int i=0;i<l;i++)
	{
	 for(int j=1;j<(l-i);j++)
	  {
		if(a[j-1]>a[j]){
		 temp=a[j-1];
		 a[j-1]=a[j];
		 a[j]=temp;
		}
		
	  }
	}
	for(int k:a)
	{
		System.out.println(k);
	}

}
}