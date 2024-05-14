package d017Arrays;

public class ArraysContinue {
    public static void main(String[] args) {
        int [] age = new int[5];
        age [0]=12;
        age [1]=45;
        age [2]=67;
        age [3]=27;
        age [4]=36;

        int youngest = age[0];
        int oldest = age[0];

        for (int i = 1; i < age.length; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
            if (age[i] > oldest) {
                oldest = age[i];
            }
        }

        System.out.println("En genç yaş: " + youngest);
        System.out.println("En yaşlı yaş: " + oldest);
        System.out.println("Yaşların toplamı: " + (youngest + oldest));
            }
        }



