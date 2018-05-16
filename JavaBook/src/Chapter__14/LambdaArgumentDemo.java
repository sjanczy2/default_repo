interface StringFunc{
    String func(String str);
}

class LambdaArgumentDemo{

    /*This method takes a functional interface as
      the first parameter. Thus, an implementation can
      be applied to any input string */
      static String changeStr(StringFunc sf, String s){
        return sf.func(s);
      }

      public static void main(String args[]){
          String inStr = "Lamba Expressions Expand Java";
          String outStr;

          System.out.println("Input string: " + inStr);

          StringFunc reverse = (str) -> {
            String result = "";
            for(int i = str.length() -1 ; i>=0; i--)
				result += str.charAt(i);
            return result;
		};

		  outStr = changeStr(reverse, inStr);
		  System.out.println("Output of reverse: " + outStr);

		  outStr = changeStr((str)-> {
			  String result = "";
			  char ch;

			  for(int i = 0; i < str.length(); i ++){
				  ch = str.charAt(i);
				  if(Character.isUpperCase(ch))
				  	result += Character.toLowerCase(ch);
				  else
				  	result += Character.toUpperCase(ch);
			  }
			  return result;
		  }, inStr);
		  System.out.println("Output of case: " + outStr);

		  outStr = changeStr((str) ->str.replace(' ', '-') , inStr);
		  System.out.println("Output of replace: " + outStr);
      }


}
