public class Singleton {
    private static Singleton book = new Singleton();
        private Singleton(){}
        public static Singleton saran() {
        return book;
        }
        public void pencil() {
            System.out.println("I am Saran");
        }
}

