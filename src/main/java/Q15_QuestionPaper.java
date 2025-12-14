public class Q15_QuestionPaper {

    //A question paper has 15 questions worth either 5 marks or 10 marks.
    //You need to total exactly 100 marks.
    //Find the number of 5-mark and 10-mark questions.

    public static void main(String[] args) {

        for(int fivemark=0; fivemark<=15; fivemark++)
        {
            int tenmark = 15 - fivemark;

            if(5*fivemark + 10*tenmark == 100)
            {
                System.out.println("5-mark questions: " +fivemark);
                System.out.println("10-mark questions: " + tenmark);
            }
        }
    }
}
