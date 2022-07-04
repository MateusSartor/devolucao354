
public class att_04 {
    public static void main(String[] args) {
        int imp = 0;
        long par = new Long(0);

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                if (i > 2) {
                    par = par * i;
                }

                else {
                    par = new Long(i);
                }
            }

            else {
                imp = imp + i;
            }

        }
        System.out.println(imp);
        System.out.println(par);
    }
}
