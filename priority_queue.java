import java.util.*;

public class priority_queue
{
	private ArrayList<Comparable> array;
	int size;
	public priority_queue()
	{
		array = new ArrayList<>();
		this.size = 0;
	}
	public Comparable maxElement()
	{
		if(empty() == false) 
		{	
			return array.get(0);
		}
		else
		{
			System.out.println("Array is empty");
			return -1;
		}
	}
	public int getSize()
	{
		return size;
	}
	void printArray()
	{
		if(empty() == false)
		{
			int i;
			for(i = 0; i < size; i++)
			{
				System.out.println(i + ") " + array.get(i));
			}
		}
		else
		{
			System.out.println("Array is empty");
		}
	}
	boolean empty() // true - пустой, false - нет
	{
		return array.isEmpty();
	}
	void addElement(Comparable data)
	{
		int i,j;
		int steps = 1;
		int f = 0;
		Comparable tmp;
		array.add(size, data);
		if(empty() == false)
		{
			j = size; // потомок
			i = (j-1)/2;// родитель	
			while(array.get(j).compareTo(array.get(i)) > 0) // если больше родителя, меняем местами
			{
				if(f == 0)
				{
					steps = 0;
					f = 1;
				}
				tmp = array.get(j);
				array.set(j, array.get(i));
				array.set(i, tmp);	
				j = i;
				i = (j-1)/2;
				steps++;
			}
		}
		size++;
		System.out.println("Steps for add: " + steps);
	}
	void deleteElement()
	{
		int steps = 1;
		int indexLarge, indexRight, indexLeft, index; 
		Comparable tmp;
		if(empty() == false)
		{
			index = 0;
			size--;
			tmp = array.get(size);
			array.set(size, array.get(index));
			array.set(index, tmp);	
			array.remove(size);
			while(index*2 + 2 < size)// остановка, если мы внизу пирамиды
			{	
					indexLeft = index*2 + 1;
					indexRight = index*2 + 2;
					if (indexRight < size && array.get(indexLeft).compareTo(array.get(indexRight)) < 0) 
					{
						indexLarge = indexRight;
					}
					else 
					{
						indexLarge = indexLeft;
					}
					if (array.get(index).compareTo(array.get(indexLarge))>= 0)
					{
						break;
					}
					tmp = array.get(index);
					array.set(index, array.get(indexLarge));
					array.set(indexLarge, tmp);
					index = indexLarge;
					steps++;
			}
			System.out.println("Steps for delete: " + steps);
		}
	}
}
// для a[i] потомки a[2i+1] и a[2i+2]
// для a[j] родитель a[округление вниз от ((j-1)/2)]