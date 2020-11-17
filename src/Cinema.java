
import java.util.*;

public class Cinema {

    public static void main(String[] args) {
        int option = 0;
        ArrayList<Show> shows = new ArrayList<Show>();
        ArrayList<Theatre> theatres = new ArrayList<Theatre>();
        Scanner select = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        while(option!=4){
        System.out.println("------");
        System.out.println("Cinema");
        System.out.println("------\n");
        System.out.println("Please Enter 1 to Add Theatre");
        System.out.println("Please Enter 2 to Add Show");
        System.out.println("Please Enter 3 to Display Shows");
        System.out.println("Please Enter 4 to Exit\n");     
        System.out.print("Enter Option: ");
        option = select.nextInt();
        switch (option) {
            case 1: //add theatre
                System.out.println("ADD THEATRE Selected");
                System.out.println("-------------------------\n");
                System.out.print("Enter a name for the theatre: \n");
                String theatreName = choice.nextLine();
                System.out.print("Enter a number for the theatre: \n");
                int theatreNumber = choice.nextInt();
                System.out.println("Enter the number of rows:");
                int rowCount = choice.nextInt();
                Theatre theatre = new Theatre(theatreNumber, theatreName);
                theatre.createRows(1, 10, rowCount);
                theatre.createRows(1, 5, 5);
                theatres.add(theatre);                
                break;
            case 2 : //add movie show
                System.out.println("ADD SHOW Selected");
                System.out.println("-------------------------\n");
                System.out.println("Enter the date of the Show [DD/MM/YYYY]:");
                String showDate = choice.nextLine();
                System.out.print("Enter name of movie: \n");
                String showName = choice.nextLine();
                System.out.println("Select a theatre by typing the number:");
                for (int i = 0; i < theatres.size(); i++) {
                    System.out.println(i + 1 + " " + theatres.get(i).getDescription());
                }
                theatreNumber = choice.nextInt();
                shows.add(new Show(showName, showDate, theatres.get(theatreNumber - 1)));
                break;
            case 3 : //display movie show
                System.out.println("DISPLAY SHOWS Selected");
                System.out.println("-------------------------\n");
                for (int i = 0; i < shows.size(); i++) {
                int showNumber = i + 1;
                System.out.println("Show Number: " + showNumber);
                System.out.println("Show Name: " + shows.get(i).getShowName());
                System.out.println("Show Date: " + shows.get(i).getShowDate());
                System.out.println("\n");
            }
                System.out.println("List End\n");
                break;
            case 4 :
                System.out.println("End");;
                break;
        }
        }
    }	
}

