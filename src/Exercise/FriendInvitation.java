package Exercise;

import java.util.Scanner;

public class FriendInvitation {
    public static void main(String[] args){
        String friendName;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Friend's name:");
        friendName = scanner.nextLine();

        System.out.println("Hey " + friendName + " , it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!");
    }
}
