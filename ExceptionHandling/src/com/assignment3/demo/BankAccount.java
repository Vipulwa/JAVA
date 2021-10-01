package com.assignment3.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in) ) {
			List<Customer> list=new ArrayList<Customer>();
			boolean exit=true;
			while(exit) {
				System.out.println("1. Add Customer \n2.Delete Customer \n3.Display Customer Details \n4.Exit");
				System.out.println("Enter your choice");
				try {
					switch (scanner.nextInt()) {
					case 1:
						System.out.println("Enter Customer name");
						String customerName=scanner.next();
						System.out.println("Enter address");
						String address=scanner.next();
						System.out.println("Enter Account Number");
						long acctNum=scanner.nextLong();
						System.out.println("Current Balance");
						double currentBalance=scanner.nextDouble();
						list.add(new Customer(customerName, address, acctNum, currentBalance));
						break;
					case 2:
						System.out.println("Enter Account Number to delete customer");
						Long accountNum=scanner.nextLong();
						if(true) {
							list.removeIf(c->accountNum.equals(c.getAccountNum()));
							System.out.println("Removed Successfully");
						}	
						break;
															
					case 3:
						list.forEach(p->System.out.println(p));
						break;
						
					case 4:
						exit=false;
						break;
						
					default:
						System.out.println("Invalid option selected");
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
