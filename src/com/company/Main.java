package com.company;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();
    	main.SingleReferencesList();
    	main.DoubleReferencesList();


	}


	public void SingleReferencesList(){
		System.out.println("Egyszeresen láncolt lista");
		System.out.println();
		SingleReferenceList list = new SingleReferenceList();
		list.add("Nem");
		list.add("Tom");
		list.add("Teso");
		list.add("De");
		list.add("meg");
		list.add("oldom");
		list.add("ma");

		String[] values = list.getValues();
		for (String value: values)
			System.out.println(value);
		System.out.println();
		System.out.println();
	}

    private void DoubleReferencesList(){
		System.out.println("Kétszeresen láncolt lista");
		System.out.println();
		DoubleReferencesList list = new DoubleReferencesList();
		list.add("Nem");
		list.add("Tom");
		list.add("Teso");
		list.add("De");
		list.add("meg");
		list.add("oldom");
		list.add("ma");

		String[] values = list.getValues();
		for (String value: values)
			System.out.println(value);
		System.out.println();
		System.out.println();
	}
}


