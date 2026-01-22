import java.util.Scanner;

public class UserManager implements UserManagerInterface{
    Scanner sc = new Scanner(System.in);
    private UserInterface[] user = new UserInterface[5];
    public UserInterface login()
    {
        UserInterface currentUser = null;
        try {
            System.out.println("Enter  User Name ");
            String currentUsername = sc.nextLine();//getting username from terminal
            for (int i = 0; i < user.length; i++)// loop until all the user array length
            {
                if (user[i] == null)// we skip null part because we can check username in user only when user is in the user array
                {
                    continue;// for skip the rest of code in for loop
                } else if (user[i].getUserName().equals(currentUsername))// checking the newly enter username is already stored in user
                {
                    currentUser = user[i];
                    break;
                }
            }

            if (currentUser == null) {
                currentUser = new User(currentUsername);
                for (int i = 0; i < user.length; i++) {

                    if (user[i] == null) {
                        user[i] = currentUser;
                        break;
                    }

                }
            }
        }catch(Exception e)
        {
          System.out.println("USER LIMIT REACH");
        }
        return currentUser;
    }
}
