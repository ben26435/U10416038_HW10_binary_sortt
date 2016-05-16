//Import API
import java.util.Scanner;
import java.util.ArrayList;
public class TestBST {
  public static void main(String[] args) {
	//Datafield
	int a;
	ArrayList<Integer> list = new ArrayList<>();
    //Create Scanner
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the numbers you want to put into the Collection.");
	System.out.println("If You want to stop,enter anything except numbers.");
	do{
			//Use Try&Catch to avoid the Error about the input type
			try{
				a = input.nextInt();
				list.add(a);
			}//end try
			catch(Exception ex){
				break;
			}//end catch
		}while(input.hasNextInt());//end do-while
	//if didn't enter any int
	if(list.isEmpty()) {
		System.out.println("You didn't enter any number!!");
	}
	//Transform ArrayList into Array
	Integer result[] = new Integer[list.size()];
	for(int i = 0;i<list.size();i++){
		result[i] = list.get(i);
	}
	//Show orginal Sort
	System.out.printf("%16s","Before Sorting: ");
	for(int i = 0;i<result.length;i++){
		System.out.print(result[i]+" ");
	}
	System.out.print("\n");
	BST<Integer> intTree = new BST<>(result);
	//Show Binary sort
	System.out.printf("%16s","After Sorting: ");
	intTree.inorder();
	
   
  }
}
