import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int [size];
		System.out.println("Enter the elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int rev=0;
			int temp=arr[i];
			while(temp!=0){
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			System.out.println("Reverse Numbers ="+rev);
		}
		{
	}
}
