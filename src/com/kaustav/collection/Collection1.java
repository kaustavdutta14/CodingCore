package com.kaustav.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
public class Collection1 {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collection1 other = (Collection1) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	public List<Object> list;
	public List<Object> addObject(List<Object> list, int position){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Object obj;
			try {
				System.out.println("What data type do you like to add:\n1.Integer\n2.Float\n3.Char\n4.String\n5.Boolean");
				int i = Integer.parseInt(br.readLine());
				System.out.println("What do you want to add:");
				if(i == 1) {
					int x = Integer.parseInt(br.readLine());
					x = x+1;
					//obj = x;
					list.add(position-1,x);
				}else if(i == 2) {
					float f = Float.parseFloat(br.readLine());
					f = (float) (f + 2.0);
					list.add(position-1,f);
				}
				else if(i == 3) {
					char c = br.readLine().charAt(0);
					c = (char)(c+1);
					//obj = c;
					list.add(position-1,c);
				}
				else if(i == 4) {
					String str = br.readLine();
					str = StringUtils.swapCase(str);
					list.add(position-1,str);
				}
				else if(i == 5) {
					boolean bool = Boolean.parseBoolean(br.readLine());
					bool = !bool;
					list.add(position-1,bool);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			return list;
	}
	
	public void printList() {
		System.out.println(this.list);
	}
	
	public static void main(String []args) {
		
		Collection1 col = new Collection1();
		col.list = new ArrayList<Object>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Select an option:\n1.Do you want to add an element\n2.Show the list added\n3.Stop the loop");
			try {
				int i = Integer.parseInt(br.readLine());
				if(i == 1) {
					System.out.println("Please enter at what location you would like to add it (from 1 to 5 only):");
					int y = Integer.parseInt(br.readLine());
					if(1 <= y && y <= 5) col.list = col.addObject(col.list,y);
					else {
						System.out.println("Value should be within the boundry. Re do the selection.");
						continue;
					}
				}
				else if(i == 2) {
					System.out.println(col.list);
				}
				else if(i == 3) break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}while(true);
		
		
	}
}
