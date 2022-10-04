import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Les5 {
    public static void main(String[] args) {
        dz1();dz2();dz3();
        dz4();
    }

    /*1. ������� ���������� ������ �� ����� �����.
        � ������� ������ "������" �� ����� ������� � ��������� ������
        ������� �� �������� �����. ����� �����, �� ������� �����
        ������������� ������ �������, �������� �� �������.*/
    public static void dz1() {
        System.out.println("������� ����� �� ������� ��������� ������ ������� �������:");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int num[][][] = new int[3][3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    num[i][j][k] = k + w;
                }
            }
        }
        System.out.println(Arrays.deepToString(num));
    }

    /*2. ��������� �����
    ������� ��������� ��� ��������� ��������� ����� � ������� �����.
    ������� ��������� ������ String'�� 8�8. � ������� ������ ������
    ��������� ������ �������� B(Black) ��� W(White).*/
    public static void dz2() {
        System.out.println("��������� �����");
        String lan[][] = new String[8][8];
        for (int i = 0; i < lan.length; i++) {
            for (int j = 0; j < lan[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    lan[i][j] = "W";
                } else {
                    lan[i][j] = "B";
                }
                System.out.print(lan[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*3. �������� ��������� ������ ����� �����. �������� �� ������� �����
    ���� ��������� �������.*/
    public static void dz3() {
        int[][] num = new int[5][5];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
                sum += num[i][j];
            }
        }
        System.out.println("����� ���� ��������� ������� �����: " + sum);
    }

    /*4. �������� ��������� ������ ����� �����. ������������ �������� �
        ������� ���������� ������� �� �����������.*/
    public static void dz4() {
        System.out.println("������������ �������� � ������� ���������� ������� �� �����������.");
        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
            Arrays.sort(num[i]);
        }
        System.out.println(Arrays.deepToString(num));
    }
}

