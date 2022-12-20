public class Main {
    public static void main(String[] args) {
        int clasaDePoluare = 4;
        int taxaDePoluare = 0;
        if(clasaDePoluare==1)
        {
            taxaDePoluare = 1;
            System.out.println(taxaDePoluare);

        }else if(clasaDePoluare==2)
        {
            taxaDePoluare = 2;
            System.out.println(taxaDePoluare);

        }else if(clasaDePoluare==3)
        {
            taxaDePoluare = 3;
            System.out.println(taxaDePoluare);

        }else if(clasaDePoluare==4)
        {
            taxaDePoluare = 4;
            System.out.println(taxaDePoluare);

        }
        else if(clasaDePoluare==5)
        {
            taxaDePoluare = 5;
            System.out.println(taxaDePoluare);

        }
        else{
            System.out.println("clasa de poluare trb sa fie intre 0 si 5");
        }

        switch(clasaDePoluare){
            case 1:
            {
                taxaDePoluare = 1;
                System.out.println(taxaDePoluare);
                break;
            }
            case 2:
            {
                taxaDePoluare = 2;
                System.out.println(taxaDePoluare);
                break;
            }
            case 3:
            {
                taxaDePoluare = 3;
                System.out.println(taxaDePoluare);
                break;
            }
            case 4:
            {
                taxaDePoluare = 4;
                System.out.println(taxaDePoluare);
                break;
            }
            case 5:
            {
                taxaDePoluare = 5;
                System.out.println(taxaDePoluare);
                break;
            }
            default:
                System.out.println("clasa de poluare trb sa fie intre 0 si 5");
        }
        //pb 2
        int currentMonth = 12;
        int noOfDays = 0;
        switch(currentMonth){
            case 1: {
                noOfDays = 31;
                System.out.println("Ianuarie are "+noOfDays+" de zile");
                break;
            }
            case 2: {
                noOfDays = 28;
                System.out.println("Februarie are "+noOfDays+" de zile");
                break;
            }
            case 3: {
                noOfDays = 31;
                System.out.println("Martie are "+noOfDays+" de zile");
                break;
            }
            case 4: {
                noOfDays = 30;
                System.out.println("Aprilie are "+noOfDays+" de zile");
                break;
            }
            case 5: {
                noOfDays = 31;
                System.out.println("Mai are "+noOfDays+" de zile");
                break;
            }
            case 6: {
                noOfDays = 30;
                System.out.println("Iunie are"+noOfDays+"de zile");
                break;
            }
            case 7: {
                noOfDays = 31;
                System.out.println("Iulie are "+noOfDays+" de zile");
                break;
            }
            case 8: {
                noOfDays = 31;
                System.out.println("August are "+noOfDays+" de zile");
                break;
            }
            case 9: {
                noOfDays = 30;
                System.out.println("Septembrie are "+noOfDays+" de zile");
                break;
            }
            case 10: {
                noOfDays = 31;
                System.out.println("Octombrie are "+noOfDays+" de zile");
                break;
            }
            case 11: {
                noOfDays = 30;
                System.out.println("Noiembrie are "+noOfDays+" de zile");
                break;
            }
            case 12: {
                noOfDays = 31;
                System.out.println("Decembrie are "+noOfDays+" de zile");
                break;
            }
            default:
                System.out.println("numarul lunii trb sa fie intre 1 si 12");
        }
    }
}