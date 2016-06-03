public class BubSort {

	public static void main(String[] args) {
		System.out.println("Случайные числа : ");
		int a[] = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 100);
            System.out.print(a[i] + " ");
		}
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a.length-1; j++){
				if(a[j]>a[j+1]){
					int d =a[j];
					a[j]=a[j+1];
					a[j+1]=d;
				}
			}
		}
		System.out.println ("\n" + "Полученная сортировка : ");
		for (int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
