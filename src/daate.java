import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarNameProvider;
import java.util.Scanner;

public class daate {
    private final static String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static void main(String[] args){
        Date data = new Date(); //make new Date format and give him this Date
        //String data2 = new Date(); this doesn't work
        System.out.println(data);
        SimpleDateFormat data2 = new SimpleDateFormat(" YYYY.MM.dd HH:mm:SS\n");  //Year.Month.Day Hour.Minute.Second
        System.out.println(data2.format(data)); //From this Date print only ^


        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        if(day==7 || day==1) {
            System.out.println("There is weekend");
        }
        else {
            System.out.println("Weekend will be for: " + (7 - day) + "\n");
        }

        Calendar calendar1 = Calendar.getInstance();
        int day2 = calendar1.get(Calendar.DAY_OF_WEEK);
        if(day==7 || day==1){
            System.out.println("We have weekend!\n");
        }
        else{
            switch(day){
                case(2):
                    System.out.println("We have Monday!\n");
                    break;

                case(3):
                    System.out.println("We have Tuesday!\n");
                    break;

                case(4):
                    System.out.println("We have Wednesday!\n");
                    break;

                case(5):
                    System.out.println("We have thursday!\n");
                    break;

                default:
                    System.out.println("We have Friday!\n");
                    break;

            }
        }


        System.out.println("Now is: "+ days[Calendar.getInstance().get(Calendar.DAY_OF_WEEK)-2] + " We need to wait for weekend: "+ (7 - Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) + " days!" + "\n");


        Scanner input = new Scanner(System.in); //make scanner variable
        System.out.println("Take arguments: ");
        String innput = input.nextLine();       //take arguments
        String[] words = innput.split(" ");     //make single word
        System.out.println("Length: " + words.length);
        for(int i=0;i< words.length;i++)
        {
            System.out.println(i + ": " + words[i]);
        }
        System.out.println(" ");
        /*for(String word : words){
            System.out.println(word);       //I don't know how to count the number of word
        }*/

        input.close();  //close taking in

        for(int x=1; x<20; x+=2){
            if(x++<5) continue;
            if(x%2==0) continue;
            System.out.println(++x);
        }
    }
}
