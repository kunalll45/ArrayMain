import java.util.Scanner;

 class ArrayDemo {
    int arr[];
    int size;

    //constructor
    ArrayDemo(int n){
        size = n;
        arr = new int[size];
    }
    
    //Accept array elements
 void acceptArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter "+ size +" Elements:");
    
    for(int i =0;i < size; i++){
        arr[i] = sc.nextInt();
            }
 }
 //display array element
 void displayArray(){
    System.out.println("array elements: ");
    for(int i = 0;i < size;i++){
    System.out.println(arr[i] + " ");
    }
    System.out.println();
 }
 //insert element at specific position
 void insertElement(int pos,int value){
    if (pos<0 || pos>size) {
        System.out.println("Invalid Position!");
        return ;
    }
    int newArr[] = new int[size +1];
    for(int i =0,j=0;i< newArr.length;i++){
        if (i == pos) {
            newArr[i] = value;            
        }else{
            newArr[i] = arr[j++];
        }
        
    }
    arr = newArr;
    size++;
 }
 //delete element at position
 void deleteElement(int pos){
    if ((pos < 0|| pos >= size)) {
        System.out.println("invalid Position!");
        return ;        
    } 
  int newArr[]= new int[size - 1];
  for(int i = 0,j =0;i < size; i++){
    if (i != pos) {
        newArr[j++] = arr[i];
        
    }
  }
  arr = newArr;
  size--;
}

//linear search
void linearSearch(int key){
    boolean found = false;
    for(int i = 0;i < size; i++){
        if (arr[i] == key) {
            System.out.println("Elements "+key+" Found at position "+ i);
            found = true;
            break;
        }
    }
    if (!found) 
        System.out.println("Elements "+ key + " not found.");     
    }

    //bubble sort
    void bubbleSort(){
        for (int i = 0; i < size - i ; i++){
            for( int j = 0; j<size-i-1; j++){
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]=temp;                    
                }
            }
        }
        System.out.println("array after bubble sort: ");
        displayArray();
    }

}
public class ArrayMain {
public static void main(String[] args) {
    ArrayDemo obj = new ArrayDemo(5);
    obj.acceptArray();

    obj.displayArray();

    obj.insertElement(5,45);
    System.out.println("after insertion:");
    obj.displayArray();

    obj.deleteElement(9);
    System.out.println("after deletion");
    obj.displayArray();

    obj.linearSearch(90);
    obj.bubbleSort();
}
    }