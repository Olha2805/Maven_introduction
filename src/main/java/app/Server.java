package app;

public class Server {

    private String [] arr = {"Vasia", "Vova", "Sasha"};

    public String getUsers (){
        String result = "";
        for (int i = 0; i < this.arr.length; i++){
            result += this.arr[i] + (i < this.arr.length - 1 ? ", " : "");
        }
        return result;
    }
}
