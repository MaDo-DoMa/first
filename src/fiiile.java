
public class fiiile {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Brak argumentów programu");
        }
        else{
            /*int number = 0;
            if(args.length==1)
            {
                number = Integer.parseInt(args[0]);
                System.out.println("There is only one element: " + args[0]);
            }
            else{                                                           //software for intiger
                int sum = 0;
                for(String arg: args){
                    number=Integer.parseInt(arg);
                    sum+=number;
                }
                System.out.println("Average is: "+ sum/args.length);
            }*/
            double number = 0.0f;
            if(args.length==1)
            {
                number = Double.parseDouble(args[0]);
                System.out.println("There is only one element: " + args[0]);
            }
            else{
                double sum = 0.0;
                for(String arg: args){
                    number = Double.parseDouble(arg);
                    sum+=number;
                    System.out.println(String.format("%.3f",number));
                }
                System.out.println("-------");
                System.out.println(String.format("%.3f",sum));
                System.out.println("Average: " +String.format("%.4f",sum/args.length));

            }
        }
    }
}
