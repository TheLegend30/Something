package com.company;

public class Main {
    public static void main(String[] args)  {
        System.out.println(MinMaxUtil.min(1,3));
    }
}

class MinMaxUtil {
    public static int min(int a, int b){
        return OverComp.Min(a,b);
    }
    public static int min(int a, int b, int c){
        return OverComp.Min(a,b,c);
    }
    public static int min(int a, int b, int c, int d){
        return OverComp.Min(a,b,c,d);
    }
    public static int min(int a, int b, int c, int d, int e){
        return OverComp.Min(a,b,c,d,e);
    }

    public static int max(int a, int b){
        return OverComp.Max(a,b);
    }
    public static int max(int a, int b, int c){
        return OverComp.Max(a,b,c);
    }
    public static int max(int a, int b, int c, int d){
        return OverComp.Max(a,b,c,d);
    }
    public static int max(int a, int b, int c, int d, int e){
        return OverComp.Max(a,b,c,d,e);
    }
}

class OverComp{
    public static int Min(int...a){
        int min = a[0];
        for(int buf : a){
            min = Math.min(min,buf);
        }
        return min;
    }
    public static int Max(int...a){
        int max = a[0];
        for(int buf : a){
            max = Math.max(max,buf);
        }
        return max;
    }
}
