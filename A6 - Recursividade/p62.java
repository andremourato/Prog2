import static java.lang.System.*;

public class p62 {

  public static void main(String[] args) {
    printArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
   	if (N >= 1){
       	printArray(array, N-1);
       	System.out.println(array[N-1]);
      	}
  }
}