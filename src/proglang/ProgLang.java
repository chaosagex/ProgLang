package proglang;

import java.util.ArrayList;

/**
 *
 * @author Hossam Nasr
 */
public class ProgLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input="foo=meh+teh;";
        ArrayList<String> ids=new ArrayList<>();
        ArrayList<String> ops=new ArrayList<>();
        String curId="";
        int numLines=0;
        for(char c:input.toCharArray())
        {
            switch (c) {
                case '=':
                case '+':
                case '-':
                case '*':
                case '/':
                    if(!curId.equals(""))
                        ids.add(curId);
                    curId="";
                    ops.add(String.valueOf(c));
                    break;
                case ';':
                    numLines++;
                    break;
                default:
                    curId+=c;
                    break;
            }
            }
        if(!curId.equals(""))
                    ids.add(curId);
        System.out.println("Identifiers");
        ids.forEach(System.out::println);
        System.out.println("Operations");
        ops.forEach(System.out::println);
        System.out.println("number of statements= "+numLines);
        }
    }
    
