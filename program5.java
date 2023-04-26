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
			int sum=0;
			for(int j=1;j<arr[i];j++){
				if(arr[i]%j==0){
					sum=sum+j;
				}
			}if(sum==arr[i]){
				System.out.println("Perfect Number is"+arr[i]+"index is="+i);
			}
		
		}
	
	}
}
