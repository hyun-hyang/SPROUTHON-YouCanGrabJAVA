import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ItemList {
	ArrayList<Item> itemList;
	static ArrayList<String> classificationList;
	File sourceFile;
	
	public ItemList() {
		ArrayList<Item> itemList = new ArrayList<> ();
		ArrayList<String> classificationList = new ArrayList<>(Arrays.asList("커피", "콜드브루", "논 커피", "티/에이드", "프라페/블렌디드", "디저트"));

		classificationList.add("커피");
		fileload();
		//printItemList();
	}
	
	public static boolean checkClassification (String newclassification) {
		/* classification이 맞게 들어왔나 확인하는 메서드
		 * 만약 올바르다면 true를 리턴, 항목분류리스트에 없다면 false를 리턴*/
		
		
		if (classificationList.contains(newclassification)) {
			return true;
		} else {
			System.out.println("Wrong Classification! Please Check it again.");
			return false;
		}
	
	}
	
	public void fileload() {
		File sourceFile = new File("txtsrc/메뉴리스트.txt");
		try {
			BufferedReader bis = new BufferedReader(new FileReader(sourceFile));
			String lineString = "";
			String[] array = new String[4];
			while((lineString = bis.readLine()) != null) {
				array = lineString.split(",", 4);
				for(int i = 0; i < array.length ; i++) {
					array[i].trim();
					if ( (array[i] == null) && (array[i].isBlank()) ){
						array[i] = "";
					}
				}
				if(!checkClassification(array[0])) continue;
				itemList.add(new Item(array[0], array[1], Integer.parseInt(array[2]), Boolean.parseBoolean(array[3])));
			}
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void printItemList() {
		File targetFile = new File("txtsrc/gui용 메뉴리스트.txt");
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(targetFile));
			objectOutputStream.writeObject(itemList);
			System.out.println(itemList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int getNumOfItemList() {
		return itemList.size();
	}
	
	public Item getItem (int index) {
		return itemList.get(index);
	}

}
