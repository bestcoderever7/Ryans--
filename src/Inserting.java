
public class Inserting {

	public static void insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		orderedArray[orderedArray.length + 1] = string;
		String[] list = orderedArray.clone();
		boolean first = true;
		int k = 0;
		int l = orderedArray.length;
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
					orderedArray[k] = list[i];
					list[i] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
					//System.out.println(list[i] + " + " + testArray[k]);
					System.out.println(k + " = " + orderedArray[k]);
					k++;
				}
				first = true;
			}
		}
	}

	public static int[] insertAt(int[] testArray, int i, int j) {
		// TODO Auto-generated method stub
		int[] newArray = {};
		boolean plusOne = false;
		for(int k = 0; k < testArray.length; k++)
		{
			if(plusOne == false && k < i)
			{
				newArray[k] = testArray[k];
			}
			else if (plusOne == true)
			{
				newArray[k + 1] = testArray[k];
			}
			else
			{
				newArray[k] = j;
				plusOne = true;
			}
		}
		return newArray;
	}

}
