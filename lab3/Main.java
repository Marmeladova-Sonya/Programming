import class_.Kozlik;
import class_.Neznayka;
import class_.Provodnik;
import class_.Korotyshka;
import class_.Gazety;
import class_.Vagon;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Neznayka neznayka = new Neznayka();
        neznayka.setName("Незнайка");
        Kozlik kozlik = new Kozlik();
        kozlik.setName("Козлик");
        Korotyshka korotyshka = new Korotyshka();
        korotyshka.setName("толстенький коротышка");
        Provodnik provodnik = new Provodnik();
        provodnik.setName("Проводник");
        Vagon vagon = new Vagon();
        vagon.setName("вагон");
        Gazety gazety = new Gazety();
        gazety.setName("газеты");
        story(korotyshka, neznayka, kozlik, provodnik, vagon, gazety);
    }

    private static void story(Korotyshka korotyshka, Neznayka neznayka, Kozlik kozlik, Provodnik provodnik, Vagon vagon, Gazety gazety) {
        System.out.println(neznayka + " и " + kozlik + " " + neznayka.zashli() + " в " + vagon);
        System.out.println(provodnik + " " + provodnik.proveril() + " билеты");
        System.out.println(neznayka + " и " + kozlik + " " + kozlik.nablyudali());
        System.out.println(vagon + " " + vagon.napolnyalsya());
        System.out.println(korotyshka + " " + korotyshka.zashel() + " в " + vagon + ", " + korotyshka.vitashil() + " " + gazety + " и " + korotyshka.chital() + " " + gazety);
        System.out.println(gazety + " '" + gazety.description(1) + "', '" + gazety.description(2) + "', '" + gazety.description(3) + "', '" + gazety.description(4) + "', '" + gazety.description(5) + "', '" + gazety.description(6) + "'");
    }
}
