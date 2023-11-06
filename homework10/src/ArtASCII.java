import java.util.HashMap;
public class ArtASCII {
    HashMap<Character, String> asciiAlphabet = new HashMap<>();
    public void addCharsASCIIArt() {
        asciiAlphabet.put('A', "  A  \n A A \nAAAAA\nA   A\nA   A");
        asciiAlphabet.put('B', "BBBB \nB   B\nBBBB \nB   B\nBBBB ");
        asciiAlphabet.put('C', " CCCC\nC    \nC    \nC    \n CCCC");
        asciiAlphabet.put('D', "DDD  \nD  D \nD   D\nD  D \nDDD  ");
        asciiAlphabet.put('E', "EEEEE\nE    \nEEE  \nE    \nEEEEE");
        asciiAlphabet.put('F', "FFFFF\nF    \nFFF  \nF    \nF    ");
        asciiAlphabet.put('G', " GGG \nG    \nG  GG\nG   G\n GGG ");
        asciiAlphabet.put('H', "H   H\nH   H\nHHHHH\nH   H\nH   H");
        asciiAlphabet.put('I', " III \n  I  \n  I  \n  I  \n III ");
        asciiAlphabet.put('J', "   JJ\n    J\n    J\n    J\nJJJ  ");
        asciiAlphabet.put('K', "K  K \nK K  \nKK   \nK K  \nK  K ");
        asciiAlphabet.put('L', "L    \nL    \nL    \nL    \nLLLLL");
        asciiAlphabet.put('M', "M   M\nMM MM\nM M M\nM   M\nM   M");
        asciiAlphabet.put('N', "N   N\nNN  N\nN N N\nN  NN\nN   N");
        asciiAlphabet.put('O', " OOO \nO   O\nO   O\nO   O\n OOO ");
        asciiAlphabet.put('P', "PPPP \nP   P\nPPPP \nP    \nP    ");
        asciiAlphabet.put('Q', " QQQ \nQ   Q\nQ   Q\nQ  QQ\n QQ Q");
        asciiAlphabet.put('R', "RRRR \nR   R\nRRRR \nR R  \nR  RR");
        asciiAlphabet.put('S', " SSS \nS    \n SSS \n    S\n SSS ");
        asciiAlphabet.put('T', "TTTTT\n  T  \n  T  \n  T  \n  T  ");
        asciiAlphabet.put('U', "U   U\nU   U\nU   U\nU   U\n UUU ");
        asciiAlphabet.put('V', "V   V\nV   V\nV   V\n V V \n  V  ");
        asciiAlphabet.put('W', "W   W\nW   W\nW W W\nWW WW\nW   W");
        asciiAlphabet.put('X', "X   X\n X X \n  X  \n X X \nX   X");
        asciiAlphabet.put('Y', "Y   Y\n Y Y \n  Y  \n  Y  \n  Y  ");
        asciiAlphabet.put('Z', "ZZZZZ\n   Z \n  Z  \n Z   \nZZZZZ");
        asciiAlphabet.put(',', "\n\n\n**\n *");
        asciiAlphabet.put('.', "\n\n\n\n *");
        asciiAlphabet.put(' ', "\n\n");
        asciiAlphabet.put('!', "*\n*\n*\n\n*");
    }

    public void printTerminalArt(String str){
        char letter;
        for(int i = 0; i <str.length(); i++){
            letter = str.toUpperCase().charAt(i);
            System.out.println(asciiAlphabet.get(letter));
            System.out.println();
        }
    }

}
