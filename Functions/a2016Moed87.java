public class a2016Moed87
{
        //************שאלה 1****************     
       // הרעיון היה לסכום בשיטה נפרדת את כל המערך ואז כל פעם להוריד מהסכום הכללי ולהוסיף לסכום זמני ולשמור את הערך הכי נמוך של ההפרש אבל זה            
     //לא עבד כי זה דילג על האפשרויות של סכום של איברים שלא עוקבים ז"א יכול להיות שהאיבר הראשון והאחרון ייתנו את הפיתרון אבל התכנית לא הגיע לאפשרות הזאת אם לפנייה היתה אופציה יותר טובה            
    //פיתרון מלא במגה           
    //*******quest2********
    // update count of east, when we hit west we add to counter the num of east (because all of the east until the wast are passing him by defination.
    
    public static int passingCars(int [] a)
    {
        int west = 0;
        int east = 0;
        int counter = 0;
        int i = 0;
        while(i<a.length)
        {
            if(a[i] == 0)
                east++;
            else{
                counter = counter + east;
            }
            i++;
        }
        return counter;
    }
}
