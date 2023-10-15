public class InverseTransformer extends TextTransformer {

    @Override
    public String stringTransform(String text){
        String result = "";
        char a;


        for (int i=0; i<text.length(); i++)
        {
            a= text.charAt(i);
            result = a + result;
        }
        return result;


    }


}
