public class UpDownTransformer extends TextTransformer {

    @Override
    public String stringTransform(String text){
        String result = "";
        String text_upper = text.toUpperCase();
        String text_lower = text.toLowerCase();
        char a;


        for (int i=0; i<text.length(); i++)
        {


            if ((i + 1) % 2 == 1){
                a = text_upper.charAt(i);

            }else{
                a = text_lower.charAt(i);
            }

            result = result + a;
        }
        return result;


    }


}