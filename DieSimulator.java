import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args)
    {Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(7);
            if(rand !=0) break;
        }
        System.out.print(rand);
    }
}
