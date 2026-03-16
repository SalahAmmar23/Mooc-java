
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
            
        int col = size/2;
        int row = 0;

        for(int i =1; i <= size*size; i++){
            square.placeValue(col, row, i);
            System.out.println("Placing " + i + " at row=" + row + " col=" + col);

            row--;
            col++;
            if(row<0) {
                row = size-1;
            }
            if(col == size){
                col =0;
            }
            if(square.readValue(col, row) > 0){
               row = (row + 2) % size;
                col--;
                if(col < 0){
                    col = size-1;
                }
            }
        }
        return square;
    }

}
