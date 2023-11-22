package vladproduction.com.IronMan;

public class IronRating extends Triathlon {
    public void world(String division,int points) {
        super.rating("World");
        //points=0;
        boolean TopMaster = points >= 800;
        if (TopMaster) {
            System.out.println("Your rating: TopMaster");
        } else {
            boolean Master = points >= 400;
            if (Master) {
                System.out.println("Your rating: Master");
            } else {
                boolean Candidate = points >= 200;
                if (Candidate) {
                    System.out.println("Your rating: Candidate");
                } else {
                    boolean toCandidate = points >= 100;
                    if (toCandidate) {
                        System.out.println("Your rating: to Candidate");
                    } else {
                        System.out.println("Your rating: Amateur");
                    }
                }
            }
        }
    }

    public void country(String division, int points) {
        super.rating("Country");
        boolean Master = points >= 1000;
        if (Master) {
            System.out.println("Your rating: Master");
        } else {
            boolean Candidate = points >= 500;
            if (Candidate) {
                System.out.println("Your rating: Candidate");
            } else {
                boolean toCandidate = points >= 200;
                if (toCandidate) {
                    System.out.println("Your rating: to Candidate");
                } else {
                    System.out.println("Your rating: Amateur");
                }

            }

        }

    }

    public void local(String division,int points) {
        super.rating("Local");
        boolean Candidate = points >= 100;
        if (Candidate) {
            System.out.println("Your rating: Candidate");
        } else {
            boolean Cat1 = points >= 50;
            if (Cat1) {
                System.out.println("Your rating: Cat1");
            } else {
                boolean Cat2 = points >= 20;
                if (Cat2) {
                    System.out.println("Your rating: Cat2");
                } else {
                    boolean Cat3 = points >= 10;
                    if (Cat3) {
                        System.out.println("Your rating: to Cat3");
                    } else {
                        boolean Cat4 = points >= 5;
                        if (Cat4) {
                            System.out.println("Your rating: to Cat4");
                        } else {
                            System.out.println("Your rating: Amateur");
                        }


                    }

                }

            }


        }
    }
}




