    String Original="abcdef";
		String reverse="";
		
		System.out.println(Original.length());
		
		for (int i=Original.length()-1;i>=0;i--)
		{
			reverse=reverse+Original.charAt(i);
		}
		
		System.out.println("The Reverse String is "+ reverse);
