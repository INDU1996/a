package indu;

public class SudokuChecker {
	static int[][] sMatrix={

            {5,3,4,6,7,8,9,1,2},
            {6,7,2,1,9,5,3,4,8},
            {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},
            {4,2,6,8,5,3,7,9,1},
            {7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},
            {2,8,7,4,1,9,6,3,5},
            {3,4,5,2,8,6,1,7,9}
        };
static int rSum=0;

static int cSum=0;

static int[] rSumArray=new int[9];

static int[] cSumArray=new int[9];

static int[] boxSumArray=new int[9];

static boolean checkArrayStatus(int[] rSumArray,int[] cSumArray,int[] boxSumArray)
{   
int i=0;

boolean sudukoStatus=true;

while(i<9){
if(rSumArray[i]!=45&&cSumArray[i]!=45&&rSumArray[i]!=45)
{   
    sudukoStatus=false;
    break;
}
i++;}

return sudukoStatus;
}   

public static void main(String[] args) {
    for(int i=0 ; i<sMatrix.length ; i++){
        for(int j=0 ; j<sMatrix.length ; j++){
            rSum+=sMatrix[i][j];
            cSum+=sMatrix[j][i];
            }
        rSumArray[i]=rSum;
        cSumArray[i]=cSum;
        rSum=0;
        cSum=0;
    }

    for(int i=0 ; i< sMatrix.length ; i++){
        for(int j=0 ; j<sMatrix.length ; j++){
            if(i<=2&&j<=2)
            {
                boxSumArray[0]+=sMatrix[i][j];
            }
            if(i<=2&&(j>=3&&j<=5))
            {
                boxSumArray[1]+=sMatrix[i][j];
            }
            if(i<=2&&(j>=6&&j<=8))
            {
                boxSumArray[2]+=sMatrix[i][j];
            }
            if((i>=3&&i<=5)&&(j<=2))
            {
                boxSumArray[3]+=sMatrix[i][j];
            }
            if((i>=3&&i<=5)&&(j>=3&&j<=5))
            {
                boxSumArray[4]+=sMatrix[i][j];
            }
            if((i>=3&&i<=5)&&(j>=6&&j<=8))
            {
                boxSumArray[5]+=sMatrix[i][j];

            }
            if((i>=6)&&(j<=2))
            {
                boxSumArray[6]+=sMatrix[i][j];
            }
            if((i>=6)&&(j>=3&&j<=5))
            {
                boxSumArray[7]+=sMatrix[i][j];
            }
            if((i>=6)&&(j>=6))
            {
                boxSumArray[8]+=sMatrix[i][j];
            }
        }
    }

    if(checkArrayStatus(rSumArray,cSumArray,boxSumArray))
    {
        System.out.println("The matrix is sudoku compliant");
    }
    else
    {
        System.out.println("The matrix is not sudoku compliant");
    }
}
}
