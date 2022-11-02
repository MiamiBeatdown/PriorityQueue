public class test
{
    public static void main(String args[]) 
    {
        priority_queue a = new priority_queue();
		System.out.println("Size: " + a.getSize());
        System.out.println("Array: ");
        a.printArray();
        a.addElement(1);
        a.addElement(4);
        a.addElement(3);
        a.addElement(5);
        a.addElement(7);
        a.addElement(8);
        a.addElement(2);
        a.addElement(6);
        a.addElement(17);
        a.addElement(15);
        a.addElement(9);
        a.addElement(10);
        a.addElement(12);
        a.addElement(16);
        System.out.println("Array: ");
        a.printArray();
		System.out.println("Size: " + a.getSize());
		System.out.println("Max: " + a.maxElement());
        System.out.println("Max deleted");
        a.deleteElement();
        a.printArray();
		System.out.println("Size: " + a.getSize());
        System.out.println("Max deleted");
        a.deleteElement();
		System.out.println("Max: " + a.maxElement());
        a.printArray();
		System.out.println("Size: " + a.getSize());
		System.out.println("Next array: ");
	    priority_queue b = new priority_queue();
        b.addElement("benedict cumberbatch");
        b.addElement("ccc");
        b.addElement("ddc");
        b.addElement("aaa");
        System.out.println("Array: ");
        b.printArray();
		System.out.println("Size: " + b.getSize());
		System.out.println("Max: " + b.maxElement());
        System.out.println("Max deleted");
        b.deleteElement();
        b.printArray();
		System.out.println("Size: " + b.getSize());
    }
}