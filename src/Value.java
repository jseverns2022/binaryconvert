public class Value {
    private int InitialVal;

    public Value(int init){
        this.InitialVal = init;
    }

    public int[] convertToBinary() {
        int[] binary = new int[8];
        int i = 0;
        while (InitialVal > 0) {

/*If the number is odd, the program will run the if statement.
If the number is odd, it will run the else statement.
 */
            if (InitialVal %2 == 1)//This is how it identifies if the code is odd
            {
                binary[i++]=1;//This assigns a "1" to the binary code
                InitialVal--; //This subtracts 1 from the InitialValue
                InitialVal/=2;//Then the initial value is divided by 2
            }
        else{//If the number is even, this "else" statement will run
                binary[i++]=0; //A zero is assigned to the binary
                InitialVal/=2; // Then the InitialValue is divided by two and the if statement is repeated with the new value assigned to the "InitialVal"

            }
            }
           return binary; //Once the InitialVal is not greater than zero, the program will exit the "If else" statement and the binary number will be returned.
        }

    public void printBinary(){
        int[] array = convertToBinary();
        for (int i = array.length-1; i >= 0; i--){//assign the array with elements. I am also reversing the order of the binary numbers so that the program returns a correct binary.
            System.out.print(array[i]);

        }
    }
    /*The code below is unnecessary because I used the "for loop" above to reverse the binary.
    Using the for loop was a much more efficient way to reverse the binary than the code you see below
     */



    /*public void reverse(int[] binary){
        int max = binary.length - 1;
        int min = 0;
        for(int i = 0; i < binary.length/2; i++){

            int temp = binary[max];
            binary[max] = binary[min];//temp is a temporary variable
            binary[min] = temp;
            min++;
            max--;

        }

    }
    */


    //TODO: print InitialVal as a binary, (Hint you might want to call converToBinary() here)
    }

