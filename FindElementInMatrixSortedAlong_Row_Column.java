/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findelementinmatrixsortedalong_row_column;

/**
 *
 * @author rumanaaktar
 */
class Position{
    int x, y;
    Position(int a, int b){x=a;y=b;}
}

public class FindElementInMatrixSortedAlong_Row_Column {
    Position pos;
    
    public static Position getLocation(int mat[][], int val){
        int i=0, j=mat[0].length-1;
        
        while(i<mat.length && j>=0){
            if(val==mat[i][j]){
                return new Position(i,j);
            }else if(val<mat[i][j])
                j--;
            else
                i++;
        }
        
        return new Position(-1, -1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat[][]={{10, 20, 30, 40},
                     {15, 25, 35, 45},
                     {27, 29, 37, 48},
                     {32, 33, 39, 50},
                     {35, 53, 69, 70}};
        Position pos=getLocation(mat, 68);
        System.out.println(pos.x+" "+pos.y);
        
    }
    
}
