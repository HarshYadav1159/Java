public class IntegerToRoman {
    public static void main(String args[]){
        int num=3999;
        int quo=0,rem=0;
        String s="";
        while(num>0){
            if((int)(Math.log10(num)+1 )== 4){
                quo = num/1000;
                s = s + "M".repeat(quo);
                num = num%1000;
            }
            else if((int)(Math.log10(num)+1 ) == 3){
                quo = num/100;
                if(quo>5 && quo<9){
                    rem = quo%5;
                    s = s + "D"+"C".repeat(rem);
                }
                else if(quo<4){
                    s = s + "C".repeat(quo);
                }
                else if(quo == 4){
                    s = s + "CD";
                }
                else if(quo == 9){
                    s = s+"CM";
                }
                else if(quo == 5){
                    s = s+"D";
                }
                num = num%100;
                // System.out.print("hi");
            }

            else if((int)(Math.log10(num)+1 )== 2){
                    quo = num/10;
                    if(quo>5 && quo<9){
                    rem = quo%5;
                    s = s + "L"+"X".repeat(rem);
                }
                else if(quo<4){
                    s = s + "X".repeat(quo);
                }
                else if(quo == 4){
                    s = s + "XL";
                }
                else if(quo == 9){
                    s = s+"XC";
                }
                else if(quo == 5){
                    s = s+"L";
                }
                
                num = num%10;
                // System.out.print(num);
               
            }

            else if((int)(Math.log10(num)+1 ) == 1){
                quo =num;
                    if(quo>5 && quo<9){
                    rem = quo%5;
                    s = s + "V"+"I".repeat(rem);
                }
                else if(quo<4){
                    s = s + "I".repeat(quo);
                }
                else if(quo == 4){
                    s = s + "IV";
                }
                else if(quo == 9){
                    s = s+"IX";
                }
                else if(quo == 5){
                    s = s+"V";
                }
                num =0;
            }
        }
        System.out.print(s);
    }
    
}
