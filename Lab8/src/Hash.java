import java.io.*;

class Hash {
    public static void main(String[] args) throws IOException {
        DataItems aDataItem = null;
        int aKey, size, n, keysPerCell;

        System.out.print("Enter size of hash table: ");
        size = getInt();// get sizes
        System.out.print("Enter initial number of items: ");
        n = getInt();// get initial number
        keysPerCell = size;

        HashTable theHashTable = new HashTable(keysPerCell);// make table
        for (int j = 0; j < n; j++) // insert data
        {
            aKey = (int) (java.lang.Math.random() * keysPerCell * size);
            aDataItem = new DataItems(aKey);
            theHashTable.insert(aDataItem);// insert data
        }
        while (true) // interact with user
        {
            System.out.print("Enter first letter of show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItems(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null)
                        System.out.println("Found " + aKey);
                    else
                        System.out.println("Could not find " + aKey);
                    break;
                default:
                    System.out.print("Error !!");
            } // end while
        }
    } // end main()
      // --------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // --------------------------------------------------------------
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    // -------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}

class HashTable {
    private DataItems[] hashArray; // array holds hash table
    private int arraySize;
    private DataItems nonItem; // for deleted items
    // -------------------------------------------------------------

    public HashTable(int size) // constructor
    {
        arraySize = size;
        hashArray = new DataItems[arraySize];
        nonItem = new DataItems(-1); // deleted item key is -1
    }

    // -------------------------------------------------------------
    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null)
                System.out.print(hashArray[j].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }

    // -------------------------------------------------------------
    public int hashFunc(int key) {
        return key % arraySize;// hash function ;
    }

    // -------------------------------------------------------------
    public void insert(DataItems item) // insert a DataItem
    // (assumes table not full)
    {
        int key = item.getKey(); // extract key
        int hashVal = hashFunc(key); // hash the key

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) // until empty cell or -1,
        {
            ++hashVal;// go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        hashArray[hashVal] = item;// insert item
    } // end insert()
      // -------------------------------------------------------------

    public DataItems delete(int key) // delete a DataItem
    {
        int hashVal = hashFunc(key);// hash the key
        while (hashArray[hashVal] != null) // until empty cell,
        {
            // found the key?
            if (hashArray[hashVal].getKey() == key) {
                DataItems item = hashArray[hashVal];// save item
                hashArray[hashVal] = nonItem;// delete item
                return item;// return item
            }
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        return null; // canâ€™t find item
    } // end delete()
      // -------------------------------------------------------------

    public DataItems find(int key) // find item with key
    {
        int hashVal = hashFunc(key);// hash the key
        while (hashArray[hashVal] != null) // until empty cell,
        {
            // found the key?
            if (hashArray[hashVal].getKey() == key)
                return hashArray[hashVal];// yes, return item
            ++hashVal;// go to next cell
            hashVal %= arraySize;// wraparound if necessary
        }
        return null;
    }
}

class DataItems {

    private int iData;

    public DataItems(int ii) {
        iData = ii;
    }

    public int getKey() {
        return iData;
    }

}