class Stringmethods{
	public static void main(String []args){
		String str = "  pavan   is a good   boy   !         ";
		System.out.println(str.length());
		String trimed = str.trim();
		System.out.println(trimed);
		System.out.println(trimed.length());
		
		//String singlesplit[] = str.split(" ");
		//String singlesplit[] = str.split(" +");
		String singlesplit[] = trimed.split(" +");
		
		for(String word : singlesplit)
		System.out.println(word);
	}
}