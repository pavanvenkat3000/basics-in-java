class stringbuilder{
	
	public static void main(String []args){
		StringBuilder sb = new StringBuilder();
		sb.append("pavan ");
		System.out.println(sb);
		sb.append("venkat ");
		System.out.println(sb);
		sb.append('H');
		System.out.println(sb);
		sb.insert(6,"insert ");
		System.out.println(sb);
		sb.replace(6,7, "replace");
		System.out.println(sb);
		sb.delete(3,5);
		System.out.println(sb);
	}
	
}

