public class Screen {
    private String header;
    private String menuStartOpen;
    private String menuOperation;
    private String userInput;
    private String userResult;

    public Screen(){
        this.header = "++++++++++++ CALCULATOR ++++++++++++" ;
        this.menuStartOpen="1: Open Calculator\r\n99: Exit";
        this.menuOperation="Please Enter Calculation Operation:\r\n1. Add Value\r\n2. Sub Value\r\n3. Multiply Value\r\n4. Divide Value";
        this.userInput="Masukkan pilihan anda:";
        this.userResult="Hasil :";
    }

    public void addHeader(){
        System.out.println(header);
    }
    public void menuStart(){
        System.out.println(menuStartOpen);
    }
    public void menuInput(){
        System.out.println(userInput);
    }

    public void value1(){
        System.out.println("Masukkan Value 1 :");
    }

    public void value2(){
        System.out.println("Masukkan Value 2 :");
    }

    public void operation(){
        System.out.println(menuOperation);
    }

    public void result(){
        System.out.println(userResult);
    }
}
