public class Evaluateur {
    public Evaluateur() {
    }
    public void verifierNote(int n)throws NoteInvalideException{
        if (n<0||n>20) {
            throw new NoteInvalideException( n );
        }
       System.out.println("le nombre "+n+ " est valide ");
    }
}
