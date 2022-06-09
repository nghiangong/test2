import java.util.Scanner; 
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = 0 ;
		try {
			System.out.println("Nhap vao so nguyen n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhap du lieu khong dung");
		}
		System.out.println("Gia trij nhap la: "+n);
		System.out.println("Ket thuc chuong trinh.");
}
}
