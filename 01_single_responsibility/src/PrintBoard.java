public class PrintBoard extends Board {

    // Poor code — can you improve this?
    // Answer to above question - Create a new class that handles the functionality of printing the board.
    public void display() {
        String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n"
                + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n"
                + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
