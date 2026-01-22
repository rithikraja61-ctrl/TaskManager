public class User implements UserInterface{
    private String userName;
    private TaskInterface[] task=new TaskInterface[5];
    public User()
    {

    }
    public User(String name)
    {
         this.userName=name;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TaskInterface[] getTask() {
        return task;
    }

    public void setTask(TaskInterface[] task) {
        this.task = task;
    }
}
