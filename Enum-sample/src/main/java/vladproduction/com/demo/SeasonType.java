package vladproduction.com.demo;

public enum SeasonType {
    WINTER {
        public String toString() {
            return "Winter - cold season";
        }
    },
    SPRING {
        public String toString() {
            return "Spring - cold-warm season";
        }
    },
    SUMMER {
        public String toString() {
            return "Summer - hot season";
        }
    },
    AUTUMN {
        public String toString() {
            return "Auturn - cool season";
        }
    };
    public static void main(String[] arg) {
        System.out.println(SeasonType.SPRING);
        System.out.println(SeasonType.SUMMER);
        System.out.println(SeasonType.WINTER);
        System.out.println(SeasonType.AUTUMN);
        /*Spring - cold-warm season
        Summer - hot season
        Winter - cold season
        Auturn - cool season*/
    }
}
