package clase3;

import javax.swing.JOptionPane;

public class MatriTranspuesta
{
  private int matriz[][];
  private int matrizTransp[][];
  private int i ;
  private  int j;
  private int valores;
  
  public MatriTranspuesta()
  {
    i=Integer.parseInt(JOptionPane.showInputDialog("ingresar filas" ));
    j=Integer.parseInt(JOptionPane.showInputDialog("ingresar columnas " ));
    this.matriz= new int[i][j];
    this.matrizTransp = new int [i][j];
       
  }
  public void establecerMatriz()
  {
      
   for(int i=0; i < this.matriz.length;i++)
    {
      for(int j=0; j< this.matriz.length; j++)
      {
        this.valores=Integer.parseInt(JOptionPane.showInputDialog("ingresar los numeros de a["+i+"]["+j+"] "+" de la matriz"));
        this.matriz[i][j]=this.valores;
      }       
    }
  }
  public void obtenerMatriz()
  {
   for(int i=0; i< this.matriz.length;i++)
    {
      for(int j=0; j< this.matriz.length; j++)
      {
        System.out.print(this.matriz[i][j]+" ");
      } 
      System.out.println(); 
    }   
  } 
  public void matrizTransp()
  {      
   for(int i=0; i< this.matriz.length;i++)
   {
     for(int j=0; j< this.matriz[i].length; j++)     
      {      
       this.matrizTransp[j][i]=this.matriz[i][j];

      } 
      System.out.println();
                  
    }         
  }
  public void mostrarMatrizTransp()
  {
   System.out.println("la matriz trampuesta es ");
   for(int i=0; i< this.matriz.length;i++)
    {
     for(int j=0; j< this.matriz.length; j++)
      {
        System.out.print(this.matrizTransp[i][j]+" "); 
      }
      System.out.println();
    }     
  }               
  public static void main(String[] args)
  {
   MatriTranspuesta matriTranspuesta = new MatriTranspuesta();
   matriTranspuesta.establecerMatriz();
   matriTranspuesta.obtenerMatriz();  
   matriTranspuesta.matrizTransp();
   matriTranspuesta.mostrarMatrizTransp();
   
  }
  
}
