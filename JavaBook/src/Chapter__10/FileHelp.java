
package Chapter__10;


public class FileHelp {

    
    public static void main(String[] args) {
        String filepath = "/Users/stevenjanczy/Documents/Notes/Java/JavaBook/src/Chapter__10/helpfile.txt";
        Help helpobj = new Help(filepath);
        String topic;
        
        System.out.println("Try help system. "
                +           "Enter 'stop' to end.");
        do{
            topic = helpobj.getSelection();
            if(!helpobj.helpOn(topic))
                System.out.println("Topic not found");
        }while(topic.compareTo("stop") != 0 );
    }

}
