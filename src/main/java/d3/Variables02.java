package d3;

public class Variables02 {
    public static void main(String[] args) {
        //3) int data type: covers memory 32 bit(4byte)
        //-2,147483,648<>
        //create a data print total value of them on consule
        int a=19 , b=13;
        System.out.println("total value: " + (a+b));
        //2. way
        int totalValue=a+b;
        System.out.println("value: " + totalValue);
        //long data type covers 8 byte (64 bit) in memory
        //example: create a variable and store number of cells in human body
        long numOfCells=12345578901L;
        //typing long as data type is not enough to make data long so put L at the end
        long myAge=42;
        System.out.println("numOfCells: " + numOfCells);
        System.out.println(numOfCells);



        float priceOfBook=13.99F;
        float priceOFCoffe=15.99f;
        float totalPrice=priceOFCoffe+priceOfBook;
        System.out.println("total price: "+totalPrice);
    }
}
