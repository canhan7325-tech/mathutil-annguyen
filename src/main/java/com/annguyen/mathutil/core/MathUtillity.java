package com.annguyen.mathutil.core;

public class MathUtillity {

    //class nay chua cac ham tien ich dung cho moi noi
    // ham tien ich dung cho moi noi co nghia la no ko luu lai ket qua xu li cua no ben trong
    // nhu vay no se duoc thiet ke static method

    //ham tinh n! =1.2.3.4....n trong do n>0
    // quy uocc 0!=1, 1!=1
    // 20! vua du vua du kieu long,18 con so 0, 21! vua qua long
    // ko co am giai thua
    // bai nay chi tinh tu 0 ->20, vuot qua khoang nay coi la khong hop le
    // 0->20 valid bounadary, validated bounadary -> vung gia tri hop le
    //0,20  bounadary value - gia tri bien cua tap gia tri
            // xich qua 1 xiu la sang vung invalid boundary

    public static long getFactorial(int n){
        if (n <0 || n > 20){
            // nem ngoai le, kem 1 cau chui,va dung ham nagy , ko co value nao dc tra ve
            throw new IllegalArgumentException("Must be  between 0 and 20");
        }
        // bien trung gian de tinh phep nhan
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i; // thuat toan con heo dat
        }
        return result;
    }
//public static long getFactorial(int n){
//    return 0;
//}

}
