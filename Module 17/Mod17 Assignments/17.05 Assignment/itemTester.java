
/**
 * Write a description of class itemTester here.
 *
 * @author Luis Vega
 * @version 3/26/20
 */
public class itemTester
{
    public static void main(String[] args)
    {
        storeItem[] items = new storeItem[10];
        storeItem[] items1 = new storeItem[10];
        
        items[0] = new storeItem("T-Shirt",1000,30,9.99);
        items[1] = new storeItem("Jacket",2000,20,14.99);
        items[2] = new storeItem("Hoodie",2500,15,19.99);
        items[3] = new storeItem("Pants",3000,5,24.99);
        items[4] = new storeItem("Jeans",3500,7,29.99);
        items[5] = new storeItem("Shoes",4000,4,59.99);
        items[6] = new storeItem("Charger",5000,9,12.99);
        items[7] = new storeItem("Phone Case",5100,3,5.99);
        items[8] = new storeItem("Phone Stand",5110,4,2.99);
        items[9] = new storeItem("Headphones",5500,8,49.99);
        
        System.out.println("\t   <<< Results without sorting >>> \n");
        print(items);
        System.out.println();
        
        mergeSort(items,0,items.length - 1);
        System.out.println("   <<< Results After Merge Sorting Product Numbers >>> \n");
        print(items);
        System.out.println();
        
        items = insertionSort(items);
        System.out.println("  <<< Results After Insertion Sorting Product Names >>> \n");
        print(items);
        System.out.println();
        
        selectionSort(items);
        System.out.println("   <<< Results After Selection Sorting By Price >>> \n");
        print(items);
        System.out.println();
        
        selectionSort1(items);
        System.out.println("  <<< Results After Selection Sorting By Quantity >>> \n");
        print(items);
        System.out.println();
    }
    
    public static void print(storeItem[] items)
    {
        System.out.printf("%-10s%15s%15s%13s\n","Name","Product Number","Quantity","Price");
        System.out.println("--------------------------------------------------------");
        for(int i = 0; i < items.length; i++)
        {
            System.out.printf("%-11s %10d %15d %16s\n",items[i].getName(),items[i].getProductNumber(),items[i].getQuantity(),("$" + items[i].getPrice()));
        }
    }
    
    public static void mergeSort(storeItem[] items,int low,int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low + high) / 2;
        mergeSort(items,low,mid);
        mergeSort(items,mid + 1,high);
        
        merge(items,low,mid,high);
    }
    
    public static void merge(storeItem[] items,int low,int mid,int high)
    {
        storeItem[] temp = new storeItem[ high - low + 1 ];
        
        int i = low;    int j = mid + 1;    int n = 0;
        
        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = items[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else if( items[ i ].getProductNumber() < items[ j ].getProductNumber() )
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else
            {
                temp[ n ] = items[ j ];
                j++;
            }
            n++;
        }
        for( int k = low; k <= high; k++ )
        {
            items[ k ] = temp[ k - low ];
        }
    }
    
    public static storeItem[] insertionSort(storeItem[] source)
    {
        storeItem[] dest = new storeItem[ source.length ];
        
        for( int i = 0 ; i < source.length ; i++ )
        {
            storeItem next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getName().compareTo( dest[k-1].getName() ) > 0 )
              
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }
            dest[ insertIndex ] = next;
        }
        return dest;
    }
    
    public static void selectionSort(storeItem[] source)
    {
        int i;  int k;  int posMax;
        storeItem temp;
        
        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( source[ k ].getPrice() > source[ posMax ].getPrice() )
                {
                    posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[ posMax ];
            source[ posMax ] = temp;
        }
    }
    
    public static void selectionSort1(storeItem[] source)
    {
        int i;  int k;  int posMax;
        storeItem temp;
        
        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( source[ k ].getQuantity() > source[ posMax ].getQuantity() )
                {
                    posMax = k;
                }
            }
            temp = source[ i ];
            source[ i ] = source[ posMax ];
            source[ posMax ] = temp;
        }
    }
}
