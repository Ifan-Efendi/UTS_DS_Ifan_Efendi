public class Main {
    public static void main(String[] args) {
        int[] data = {1,9,7,8,4,6,3,2,5,10};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++) {
                boolean isUrutanSesuai = data[j] < data[j+1];
                if (!isUrutanSesuai) {
                    int baru = data[j];
                    data[j] = data[j+1];
                    data[j+1] = baru;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}