
/// Digital Clock Project

/// Group 19
/// MD Shakil Hossain (192340)
/// Yeasmin Aktar Mitu (192309)
/// Md Asaduzzaman (180203)


#include<stdio.h>
#include <windows.h>/*we are including windows file
 (it's connected to function sleep()),
 which means that this will only work for windows,
  so if you're using another OS,
   search in google for other versions of sleep().*/

int main()

{

    int h, m, s;//we add hours, minutes and seconds to our program

    int D = 1000;/*we add Delay of 1000 milliseconds,
                  which makes a second and we will use that in sleep().*/

    printf("Please Set Hours:\n");/*printf writes on screen text that is inside of
                                   (" ") and \n writes in a new row.*/

    scanf("%d", &h);//scanf is where we insert our time, or our values.

    printf("Please Set Minutes:\n");/*printf writes on screen text that is inside of
                                     (" ") and \n writes in a new row.*/

    scanf("%d", &m);//scanf is where we insert our time, or our values.

    printf("Please Set Seconds:\n");/*printf writes on screen text that is inside of
                                     (" ") and \n writes in a new row.*/

    scanf("%d", &s);//scanf is where we insert our time, or our values.

    if (h > 12)
    {
        printf("ERROR!\n"); /*in this if function we examine
                              if the inserted value is bigger than 12.*/
        exit(0);
    }

    if (m > 60)
    {
        printf("ERROR!\n");    /*similar here and if it's bigger,
                                 program writes ERROR! and exits*/
        exit(0);
    }

    if (s > 60)
    {
        printf("ERROR!\n");    //similar
        exit(0);
    }

    while (1)//while (1) is an infinity loop and anything inside repeats itself to infinity.
    {

        s += 1;/* this tells program to increase seconds for 1,
                 everytime the while loop comes to this part.*/

        if (s > 59)
        {
            m += 1;    /*if the seconds are more than 59,
                         it increases the minutes and sets seconds to 0.*/
            s = 0;
        }

        if (m > 59)
        {
            h += 1;    //similar
            m = 0;
        }

        if (h > 12)
        {
            h = 1;    //similar
            m = 0;
            s = 0;
        }

         printf("\n\n\t\t\t\t     DIGITAL CLOCK");
                printf("\n\n\t\t\t\t HOUR : MINUTE : SECOND");
                printf("\n\n\t\t\t\t      %02d : %02d : %02d\n",h,m,s);/*this writes our time in
                                                                         this format "00:00:00"*/

        Sleep(D);/*this is our function sleep which slows down the
                  while loop and makes it more like a clock.*/

        system("cls");//this clears the screen.

    }

    getchar();
    return 0;

}
