/*package whatever //do not write package name here */

class string {
    public static void main(String []a){
        String name = "Hello world!";
        name.replace("!",".");
        System.out.println(name);
        int count=0;
        System.out.println(name.replace("!","."));
        String []ss = name.split("");
        for(String i:ss){ // this is same as for(int i=0;i<ss.length;i++){ System.out.println(ss[i])}
            count++;
            System.out.print(i+" ");
        }
        System.out.println("\nThe number of String object created = "+(count+2));
    }
}