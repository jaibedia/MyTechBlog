package MyTechBlog;

class Sleep extends Thread{

    @Override
    public void run() {
        for(int i=0; i<5;i++){
            System.out.println("Hello jai...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
 class myFirst {
    private static Sleep sleep;

    public static void main(String[] args) {
        System.out.println("hello java");
       Sleep sleep = new Sleep();
       sleep.setPriority(10);
       sleep.start();
       System.out.println("end main");
    }

}