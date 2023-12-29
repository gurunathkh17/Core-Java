package string;

public class StringDemo3StringBuilder {
	
	public static void main(String[] args) {
		/*		
				String str = "h";
				str += "e";
				str +="l";
				str +="l";
				str += "o";
				
				System.out.println(str);
				*/
				
				//StringBuilder:
				
				StringBuilder sb = new StringBuilder("Guru");
				
				System.out.println(sb);
				
				//to read character we use index value:
				System.out.println(sb.charAt(0));
				
				//Set character at specific index using setCharAt(position,newCharacter) method
				sb.setCharAt(0, 'H');
				System.out.println(sb);
				
				//We can insert a new Character using insert(position,'newCharacter') method
				sb.insert(0, 'S');
				System.out.println(sb);
				
				sb.insert(5, 'U');
				System.out.println(sb);
				
				//We can delete a particular character using delete(position,'Character to be deleted') method
				sb.delete(1, 2);
				System.out.println(sb);
				
				//append() method to add new value at the end of the string
				
				StringBuilder sb1 = new StringBuilder("H");
				sb1.append("e");
				sb1.append("l");
				sb1.append("l");
				sb1.append("o");
				System.out.println(sb1);
				
				//To find the length of a String
				System.out.println(sb1.length());
				
				
			}

}
