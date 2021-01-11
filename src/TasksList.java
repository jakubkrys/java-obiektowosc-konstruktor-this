public class TasksList {
    public static void main(String[] args) {

        char[] title1 = {'M','y','c','i','e'};
        char[] description1 = {'N','a','c','z','y','ń'};
        Task t1 = new Task(title1,description1,true);
        char[] title2 = {'M','y','c','i','e'};
        char[] description2 = {'P','o','d','ł','ó','g'};
        Task t2 = new Task(title2,description2,false);
        char[] title3 = {'Z','b','i','e','r','a','n','i','e'};
        char[] description3 = {'O','w','o','c','ó','w'};
        Task t3 = new Task(title3,description3,true);

        Task[] tasks = new Task[3];
        tasks[0] = t1;
        tasks[1] = t2;
        tasks[2] = t3;

        for(Task task : tasks){
            System.out.print("Title: ");
            for (char t : task.title){
                System.out.print(t);
            }
            System.out.println();
            System.out.print("Description: ");
            for (char d : task.description){
                System.out.print(d);
            }
            System.out.println();
            System.out.print("Status: ");
            if(task.done){
                System.out.println("Done");
            } else {
                System.out.println("To do");
            }
            System.out.println();
        }
    }
}

