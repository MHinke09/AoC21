import java.io.*;

public class day2{

    public static void main(String args[]) throws Exception {
        System.out.println("test");
        int horz = 0;
        int vert = 0;
        int aim = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
           
            for(String line; (line = br.readLine()) != null; ) {
                String[] splited = line.split("\\s+");
                if(splited[0].equals("forward")){
                    horz += Integer.parseInt(splited[1]);
                    vert += Integer.parseInt(splited[1]) * aim;
                }
                else if(splited[0].equals("down")){
                    //vert += Integer.parseInt(splited[1]);
                    aim += Integer.parseInt(splited[1]);
                }
                else{
                    //vert -= Integer.parseInt(splited[1]);
                    aim -= Integer.parseInt(splited[1]);
                }
            }
            // line is not visible here.
        }
        System.out.println(horz);
        System.out.println(vert * horz);
    }
}