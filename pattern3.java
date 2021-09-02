class pattern3 {

        public static void main(String[] args) {
                byte row = 5;

                for (int i = 1; i < row; i++) {

                        for (int j = row; j >= i; j--) {

                                System.out.print("* ");

                        }

                        System.out.println();

                }

                for (int i = 1; i <= row; i++) {

                        for (int k = 1; k <= i; k++) {

                                System.out.print("* ");

                        }

                        System.out.println();

                }
        }

}
