
package exam;
public class largest {
    int [] num = {12,13,14};
    int n = num.length;
    
    largest(){
        for(int i=0;i <n; i++){
            for(int j=i+1 ; j<n ; j++){
                if(num[i]<num [j]){
                int temp = num[i];
                num[i]=num[j];
                num[j]= temp;
            }
            }      
           
        }
        
    }
        
    public void display(){
        System.out.println(" largest number is  " + num[0]);
    }
    public static void main(String[] args) {
        largest d1 = new largest();
        d1.display();
        
        
    }
    
}

