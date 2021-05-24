package java_Array;

public class Homework {

	public static void main(String[] args) {
	       
        int[] data = { 10, 29, 13, 14, 37 };
       
        for(int i=0;i<data.length-1;i++){
           
            for(int j=0; j< data.length-1-i;j++){
                if(data[j]>data[j+1]){                   
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;                  
                }              
            }          
            ShowArray(data); //현재 i번째 데이터 출력
        }      
        
        System.out.println("\r\n/////////////bubble sort 결과");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+"  ");
        }
        System.out.println();
 
    }
	
    private static void ShowArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
}