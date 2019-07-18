import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        System.out.println("How many participants: ");
        Scanner sc = new Scanner(System.in);
        int numPart = sc.nextInt();
        Participant[] participants = new Participant[numPart];

        for (int i = 0; i < numPart; i++) {
            System.out.println("Please enter the sex: ");
            char sex = sc.next().charAt(0);
            System.out.println("Do u have a job: ");
            String job = sc.next();
            boolean hasJob = job.toLowerCase().equals("y") || job.toLowerCase().equals("yes");
            int salary = 0;
            if(hasJob){
                System.out.println("How much do you make? ");
                salary = sc.nextInt();
            }
            participants[i] = new Participant(i, sex, hasJob, salary);
        }
        int numMen = 0, numWomen = 0, numMenWork = 0, numWomenWork = 0, totalSalMen = 0, totalSalWomen = 0;
        for(Participant part : participants)
        {
            if(part.getSex() == 'M' || part.getSex() == 'm')
            {
                numMen++;
                if(part.isHasJob()){
                    numMenWork++;
                    totalSalMen += part.getSalary();
                }
            }
            else {
                numWomen++;
                if (part.isHasJob()) {
                    numWomenWork++;
                    totalSalWomen += part.getSalary();
                }
            }
        }
        System.out.println("The percentage of men is: " + percentage(numMen, participants.length));
        System.out.println("The percentage of men who work is: "+ percentage(numMenWork, numMen));
        System.out.println("and their avg salary is: "+ totalSalMen/numMenWork);
        System.out.println("The percentage of women is: "+ percentage(numWomen, participants.length));
        System.out.println("The percentage of women who work is: "+ percentage(numWomenWork, numWomen));
        System.out.println("and their avg salary is: "+ totalSalWomen/numWomenWork);
    }
    public static float percentage(int value, int total){
        return ((float)value/total) * 100;
    }
}
