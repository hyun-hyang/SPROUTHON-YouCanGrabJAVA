package machine;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ItemList {
	public static ArrayList<Item> itemList;
	static ArrayList<String> classificationList = new ArrayList<>(Arrays.asList("커피", "콜드브루", "논 커피", "티/에이드", "프라페/블렌디드", "디저트"));
	File sourceFile;
	
	public ItemList() {
		this.itemList = new ArrayList<> ();
		fileload();
//		printItemList();
//		filesave();
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
		File sourceFile = new File("txt-src/메뉴리스트.txt");
		BufferedReader bis = null;
		try {
			bis = new BufferedReader(new FileReader(sourceFile));
			String lineString = "";
			while((lineString = bis.readLine()) != null) {
				if(!(lineString.isBlank())) {
					String[] array = lineString.split(",", 4);
					for(int i = 0; i < array.length ; i++) {
						array[i] = array[i].trim();
						if ( (array[i] == null) && (array[i].isBlank()) ){
							array[i] = "";
						}
					}
					if(!checkClassification(array[0])) continue;
					if(array.length == 3) {
						itemList.add(new Item(array[0], array[1], Integer.parseInt(array[2])));
					} else if (array.length == 4) {
						itemList.add(new Item(array[0], array[1], Integer.parseInt(array[2]), Boolean.parseBoolean(array[3])));
					}
					
				}
			}
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unknown MenuList data File");
			return;
		}
		
		
		
	}
//	public void filesave() {
	/* 파일 직렬화 실패*/
//		File targetFile = new File("txt-src/gui용 메뉴리스트.txt");
//		try {
//			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(targetFile));
//			objectOutputStream.writeObject(itemList. get(0).printItem());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	public int getNumOfItemList() {
		return itemList.size();
	}
	
	public Item getItem (int index) {
		return itemList.get(index);
	}
	
	public void printItem (int index) {
		getItem(index).printItem();
	}
	
	public void printItemList() {
		for(int i = 0; i < getNumOfItemList(); i++) {
			getItem(i).printItem();
		}
	}

}
