//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Evaluateur eval = new Evaluateur();
try{
    eval.verifierNote(15);
}catch (NoteInvalideException e){
    e.printStackTrace();;
}
        try{
            eval.verifierNote(25);
        }catch (NoteInvalideException e){
            e.printStackTrace();;
        }



    }
}