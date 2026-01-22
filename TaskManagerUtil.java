public  class TaskManagerUtil {
    static void display(UserInterface currentUser) {
        for (int i = 0; i < currentUser.getTask().length; i++) {
            if (currentUser.getTask()[i] != null) {
                System.out.print(i + 1);
                System.out.print(" : ");
                System.out.println(currentUser.getTask()[i].getTitle());
            }
        }
    }
    static boolean isTaskEmpty(UserInterface currentUser)
    {
        for (int i = 0; i < currentUser.getTask().length; i++) {
            if (currentUser.getTask()[i] != null) {

               return false;
            }
        }
        return true;
    }
    static void displayStatus(UserInterface currentUser, String status) {
        TaskInterface[] taskStatus = new Task[currentUser.getTask().length];
        for (int i = 0; i < currentUser.getTask().length; i++) {
            if (currentUser.getTask()[i] != null) {
                if (currentUser.getTask()[i].getStatus().equals(status)) {
                    for (int count = 0; count < taskStatus.length; count++) {
                        if (taskStatus[count] == null) {
                            taskStatus[count] = currentUser.getTask()[i];
                            break;
                        }
                    }
                }
            }
        }
        if (isTaskEmpty(currentUser)) {
            System.out.println("Task is Empty.");
        } else {
            boolean isEmpty = true;
            System.out.println("===========================");
            System.out.println(status);
            for (int i = 0; i < taskStatus.length; i++) {
                if (taskStatus[i] != null) {
                    System.out.print(i + 1);
                    System.out.println("]");
                    System.out.print("Title :");
                    System.out.println(taskStatus[i].getTitle());
                    if(taskStatus[i].getDescription()!=null) {
                        System.out.print("Description :");
                        System.out.println(taskStatus[i].getDescription());
                    }
                    else{
                        System.out.println(" Description Empty");
                    }
                    isEmpty = false;
                }
            }
            if (isEmpty) {
                System.out.print(status);
                System.out.println(" : No Task ");
            }
        }


    }
}
