import java.io.*;
 class Triples
 {
 public static void main(String[] args) 
 {
        int x1, x2, x3; 

        for(x1 = 1; x1 < 100; x1++)
        {
            for(x2 = 1; x2 < 100; x2++)
            {
                for(x3 = 1; x3 < 100; x3++)
                {
                    int a= x1, b=x2, c=x3;
                    
                     if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
                    {
                        if(a < b)
                        {
                            System.out.println(x1 +"  "+ x2 +"   "+ x3);
                        }
                    }
                }
            }
}
}
}


output

3  4   5
5  12   13
6  8   10
7  24   25
8  15   17
9  12   15
9  40   41
10  24   26
11  60   61
12  16   20
12  35   37
13  84   85
14  48   50
15  20   25
15  36   39
16  30   34
16  63   65
18  24   30
18  80   82
20  21   29
20  48   52
21  28   35
21  72   75
24  32   40
24  45   51
24  70   74
25  60   65
27  36   45
28  45   53
30  40   50
30  72   78
32  60   68
33  44   55
33  56   65
35  84   91
36  48   60
36  77   85
39  52   65
39  80   89
40  42   58
40  75   85
42  56   70
45  60   75
48  55   73
48  64   80
51  68   85
54  72   90
57  76   95
60  63   87
65  72   97
