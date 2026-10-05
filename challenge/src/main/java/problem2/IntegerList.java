package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int curr_size;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        this.curr_size = size;
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        int[] temp = new int[list.length * 2];
        for (int i = 0; i < list.length; i++) temp[i] = list[i];
        list = temp;
    }

    public void addElement(int newVal) {
        if (this.curr_size == list.length) {
            increaseSize();
        }

        list[this.curr_size++] = newVal;
    }

    public void removeFirst(int newVal) {
        if (this.curr_size == 0) return;
        for (int i = 0; i < this.curr_size; ++i) {
            if (list[i] == newVal) {
                for (int j = i+1; j < list.length; ++j) list[j-1] = list[j];
                list[--this.curr_size] = 0;
                break;
            }
        }
    }

    public void removeAll(int newVal) {
        if (this.curr_size == 0) return;

        int count = 0;
        for (int i = 0; i < this.curr_size; ++i) {
            while (list[i] == newVal) {
                for (int j = i+1; j < list.length; ++j) list[j-1] = list[j];
                list[this.curr_size - count] = 0;
                count ++;
            }
        }

        this.curr_size -= count;
    }
}