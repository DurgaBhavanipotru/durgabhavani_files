package org.tnsif.capgemini.c2tc.oops;

		class Human
		{
			 int age;
			String name;
		}


		public class BeforeEncapsulation {

			public static void main(String[] args) {
				Human obj=new Human();
				obj.age=20;
				obj.name="durga";
				System.out.println("Age is "  +obj.age);
				System.out.println("Name is " +obj.name);

				obj.age=21;
				obj.name="vani";
				System.out.println("Age is "  +obj.age);
				System.out.println("Name is " +obj.name);

			}

		}
	


