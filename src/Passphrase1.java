/**
 * Created by ajgarcia09 on 10/1/17.
 */
public class Passphrase1 {
    boolean foundC;
    boolean foundS;
    boolean foundExclamation;

    public static void main(String[]args){
        checkTrigger1(args[0],args[1]);
        if(foundC && foundS) {
            System.out.println("Welcome reverser. Recently I discovered that a malicious mad scientist");
            System.out.println("will release the T-virus into the world. Our only hope is to release");
            System.out.println("the triggering mechanism by entering a 5 passphrase sequence. The world is in danger");
            System.out.println("unless you (yes, you, the cs5375 student) discover the 5 passphrases before");
            System.out.println("all of the earth is taken over by flesh eating zombies ... :( ");
            System.out.println();
            System.out.println("Please help!");
            System.out.println("Now what about the 2nd?");
        }
    }

    public static void checkTrigger1(String char1, String char2){
        while(!foundC && !founS){
            if(char1.indexOf(0).equals('c') || char1.indexOf(0).equals('s')){
                foundC = true;
                foundS = true;
            }
            if(char2.indexOf(0).equals('c') || char2.indexOf(0).equals('s')){
                foundC = true;
                foundS = true;
            }
            if(char1.indexOf(0).equals('!') || char2.indexOf(0).equals('!')){
                foundExclamation = true;
                break;
            }
        }
    }



}
