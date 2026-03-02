import java.nio.file.Paths;
import java.util.Scanner;

public class YourFirstBankTransfer{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String filename = scanner.nextLine();

        System.out.println("Team: ");
        String teamCheck = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(filename))) {
            
            int count=0;
            int winTimes = 0;
            int loseTimes =0;
            
            while(reader.hasNextLine()){ 
                String row = reader.nextLine();

                if(row.isEmpty()){
                    continue;
                }

                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamScore = Integer.parseInt(parts[2]);
                int visitingTeamScore = Integer.parseInt(parts[3]);

                if(teamCheck.equals(homeTeam)){
                    count++;
                    if(homeTeamScore > visitingTeamScore){
                        winTimes++;
                    }else if ( homeTeamScore < visitingTeamScore){
                        loseTimes++;
                    }
                    
                }

                if(teamCheck.equals(visitingTeam)){
                    count++;
                     if(visitingTeamScore > homeTeamScore){
                        winTimes++;
                    }else if (visitingTeamScore < homeTeamScore){
                        loseTimes++;
                    }


                }




            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + winTimes);
            System.out.println("Losses: "+ loseTimes);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }


        













    }


















}