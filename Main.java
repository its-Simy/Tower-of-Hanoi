public class Main {
    public static void main(String[] args) {


        int num = 3;//number of cylinders

        solveTower(num,'A','C','B');

    }

    public static void solveTower(int num, char source,char destination, char aux){

        if(num == 0)
            return;

        solveTower(num-1,source,aux,destination);
        System.out.println("Move node " + (num-1) + " from " + source + " to " + destination);
        solveTower(num-1,aux,destination,source);
        //System.out.println("Move node " + (num-1) + " from " + destination + " to " + source);

        }
}
