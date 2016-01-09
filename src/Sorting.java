import java.util.ArrayList;

public class Sorting {

	public static void sort(String[] testArray) {
		// TODO Auto-generated method stub
		String[] list = testArray.clone();
		boolean first = true;
		int k = 0;
		int l = testArray.length;
		while(k < l - 1)
		{
			for(int i = 0; i < list.length; i++)
			{
				for(int j = 0; j < list.length; j++)
				{
					//System.out.println(list[i] + " " + list[j]);
					if(list[i].compareToIgnoreCase(list[j]) > 0)
					{
						first = false;
						break;
					}
				}
				if(first == true && k < l)
				{
					testArray[k] = list[i];
					list[i] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
					//System.out.println(list[i] + " + " + testArray[k]);
					System.out.println(k + " = " + testArray[k]);
					k++;
				}
				first = true;
			}
		}
	}

}
