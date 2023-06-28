//question number 1
//recursive boolean - true if there is a devide of the array with 3 equal grupes. else - false
public class b2021Moed60
{
    public static boolean split3(int [] arr)
{
	return split3(arr,0,0,0,0);
}
private static boolean split3(int [] arr, int i, int sum1, int sum2, int sum3)
{
	if(i==arr.length)
	{
		if(sum1==sum2 && sum2==sum3)
			return true;
		return false;
	}
	return (split3(arr, i+1, sum1+arr[i],sum2, sum3) || split3(arr, i+1, sum1,sum2+arr[i], sum3) || split3(arr, i+1, sum1,sum2, sum3+arr[i]));
}

//question number 2

public static int smallestSub(int []a, int k)//O(n) , O(1)
{
	int smallest = a.length+1;
	int counter = 0;
	int i = 0;
	int j = 0;
	int sum = 0;
	while(i!=a.length)// array contain positive number so if i==a.length and sum <= k - its true for every j start point
	{
		sum+=a[i];
		counter++;
		if(sum>k)
		{
			if (counter<smallest)
				smallest = counter;
			counter = 0;
			sum = 0;
			j++;
			i = j;
			continue;
		}//end if
		i++;
	}//end while
	return smallest;
}
}