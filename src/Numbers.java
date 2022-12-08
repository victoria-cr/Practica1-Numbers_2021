import java.util.Locale;
import java.util.Objects;

public class Numbers {

    public static Object say(long n) {
        // Números del 0 al 19 (noms únics). Si el número que ens donen és menor que 20, es crida al mètode "menor20".
        if (n < 20) {
            return menor20((int)n);
        }

        long numOrig = n;

        // Números del 100.000.000.000.000 al 999.999.999.999.999. Dividim entre 100.000.000.000 el número "n" que ens donen per així treure la centena de quintilió.
        long uquintilio = (n / 1_000_000_000_000_000_000L);
        // Es fa el residu de "n" per poder calcular la centena de trilió.
        n = n % 1_000_000_000_000_000_000L;

        // Números del 100.000.000.000 al 999.999.999.999. Dividim entre 100.000.000.000 el número "n" que ens donen per així treure la centena de quadrilió.
        long cquadrilio = (n / 100_000_000_000_000_000L);
        // Es fa el residu de "n" per poder calcular la desena de quadrilió.
        n = n % 100_000_000_000_000_000L;
        long dquadrilio = 0;
        long uquadrilio;
        if ((n > 19_999_999_999_999_999L) && (n < 100_000_000_000_000_000L)) {
            // Números del 10.000.000.000 al 99.999.999.999. Dividim entre 10.000.000.000 el número "n" que ens donen per així treure la desena de quadrilió.
            dquadrilio = (n / 10_000_000_000_000_000L);
            // Es fa el residu de "n" per poder calcular la unitat de quadrilió.
            n = n % 10_000_000_000_000_000L;
            // Dividim entre 1.000.000.000 el número "n" que ens donen per així treure la unitat de quadrilió.
            uquadrilio = (n / 1_000_000_000_000_000L);
            // Es fa el residu de "n" per poder calcular la centena de trilió.
            n = n % 1_000_000_000_000_000L;
        } else {
            // Números del 1.000.000.000 al 19.999.999.999. Dividim entre 1.000.000.000 el número "n" que ens donen per així treure la unitat de quadrilió.
            uquadrilio = (n / 1_000_000_000_000_000L);
            // Es fa el residu de "n" per poder calcular la centena de trilió.
            n = n % 1_000_000_000_000_000L;
        }


        // Números del 100.000.000.000 al 999.999.999.999. Dividim entre 100.000.000.000 el número "n" que ens donen per així treure la centena de trilió.
        long ctrilio = (n / 100_000_000_000_000L);
        // Es fa el residu de "n" per poder calcular la desena de trilió.
        n = n % 100_000_000_000_000L;
        long dtrilio = 0;
        long utrilio;
        if ((n > 19_999_999_999_999L) && (n < 100_000_000_000_000L)) {
            // Números del 10.000.000.000 al 99.999.999.999. Dividim entre 10.000.000.000 el número "n" que ens donen per així treure la desena de trilió.
            dtrilio =(n / 10_000_000_000_000L);
            // Es fa el residu de "n" per poder calcular la unitat de trilió.
            n = n % 10_000_000_000_000L;
            // Dividim entre 1.000.000.000 el número "n" que ens donen per així treure la unitat de trilió.
            utrilio = (n / 1_000_000_000_000L);
            // Es fa el residu de "n" per poder calcular la centena de bilió.
            n = n % 1_000_000_000_000L;
        } else {
            // Números del 1.000.000.000 al 19.999.999.999. Dividim entre 1.000.000.000 el número "n" que ens donen per així treure la unitat de trilió.
            utrilio = (n / 1_000_000_000_000L);
            // Es fa el residu de "n" per poder calcular la centena de bilió.
            n = n % 1_000_000_000_000L;
        }


        // Números del 100.000.000.000 al 999.999.999.999. Dividim entre 100.000.000.000 el número "n" que ens donen per així treure la centena de bilió.
        long cbilio = (n / 100_000_000_000L);
        // Es fa el residu de "n" per poder calcular la desena de bilió.
        n = n % 100_000_000_000L;
        long dbilio = 0;
        long ubilio;
        if ((n > 19_999_999_999L) && (n < 100_000_000_000L)) {
            // Números del 10.000.000.000 al 99.999.999.999. Dividim entre 10.000.000.000 el número "n" que ens donen per així treure la desena de bilió.
            dbilio =(n / 10_000_000_000L);
            // Es fa el residu de "n" per poder calcular la unitat de bilió.
            n = n % 10_000_000_000L;
            // Dividim entre 1.000.000.000 el número "n" que ens donen per així treure la unitat de bilió.
            ubilio = (n / 1_000_000_000);
            // Es fa el residu de "n" per poder calcular la centena de milió.
            n = n % 1_000_000_000;
        } else {
            // Números del 1.000.000.000 al 19.999.999.999. Dividim entre 1.000.000.000 el número "n" que ens donen per així treure la unitat de bilió.
            ubilio = (n / 1_000_000_000);
            // Es fa el residu de "n" per poder calcular la centena de milió.
            n = n % 1_000_000_000;
        }


        // Números del 100.000.000 al 999.999.999. Dividim entre 100.000.000 el número "n" que ens donen per així treure la centena de milió.
        long cmilio = (n / 100_000_000);
        // Es fa el residu de "n" per poder calcular la desena de milió.
        n = n % 100_000_000;
        long dmilio = 0;
        long umilio;
        if ((n > 19_999_999) && (n < 100_000_000)) {
            // Números del 10.000.000 al 99.999.999. Dividim entre 10.000.000 el número "n" que ens donen per així treure la desena de milió.
            dmilio = (n / 10_000_000);
            // Es fa el residu de "n" per poder calcular la unitat de milió.
            n = n % 10_000_000;
            umilio = (n / 1_000_000);
            // Dividim entre 1.000.000 el número "n" que ens donen per així treure la unitat de milió.
            umilio = (n / 1_000_000);
            // Es fa el residu de "n" per poder calcular la centena de mil.
            n = n % 1_000_000;
        } else {
            //Números del 1.000.000 al 19.999.999. Dividim entre 1.000.000 el número "n" que ens donen per així treure la unitat de milió.
            umilio = (n / 1_000_000);
            // Es fa el residu de "n" per poder calcular la centena de mil.
            n = n % 1_000_000;
        }

        // Números del 100.000 al 999.999. Dividim entre 100.000 el número "n" que ens donen per així treure la centena de mil.
        long cmil = (n / 100_000);
        // Es fa el residu de "n" per poder calcular la desena de mil.
        n = n % 100_000;
        long dmil = 0;
        long umil;
        if ((n > 19_999) && (n < 100_000)) {
            // Números del 10.000 al 99.999. Dividim entre 10.000 el número "n" que ens donen per així treure la desena de mil.
            dmil = (n / 10_000);
            // Es fa el residu de "n" per poder calcular la unitat de mil.
            n = n % 10_000;
            // Dividim entre 1.000 el número "n" que ens donen per així treure la unitat de mil.
            umil = (n / 1_000);
            // Es fa el residu de "n" per poder calcular la centena.
            n = n % 1_000;
        } else {
            // Números del 1.000 al 19.999. Dividim entre 1.000 el número "n" que ens donen per així treure la unitat de mil.
            umil = (n / 1_000);
            // Es fa el residu de "n" per poder calcular la centena.
            n = n % 1_000;
        }

        // Números del 100 al 999. Dividim entre 100 el número "n" que ens donen per així treure la centena.
        long cent = (n / 100);
        // Es fa el residu de "n" per poder calcular la desena.
        n = n % 100;
        // Números del 20 al 99. Dividim entre 10 el número "n" que ens donen per així treure la desena.
        long des = (n / 10);
        // El residu de "n" dividit 10 serà la unitat.
        long unit = (n % 10);

        String u = menor20((int)unit);
        String d = desena((int)des);
        String c = centena((int)cent);
        String um = menor20((int)umil) + " thousand";
        String dm = desena((int)dmil);
        String cm = centena((int)cmil);
        String umi = menor20((int)umilio) + " million";
        String dmi = desena((int)dmilio);
        String cmi = centena((int)cmilio);
        String ub = menor20((int)ubilio) + " billion";
        String db = desena((int)dbilio);
        String cb = centena((int)cbilio);
        String ut = menor20((int)utrilio) + " trillion";
        String dt = desena((int)dtrilio);
        String ct = centena((int)ctrilio);
        String uq = menor20((int)uquadrilio) + " quadrillion";
        String dq = desena((int)dquadrilio);
        String cq = centena((int)cquadrilio);
        String uqu = menor20((int)uquintilio) + " quintillion";

        if (numOrig > 19) {
            return resultat(numOrig, d, u, c, um, dm, cm, umi, dmi, cmi, ub, db, cb, ut, dt, ct, uq, dq, cq, uqu, des, unit);
        }
        return "";
    }


    static Object resultat(long numOrig, String d, String u, String c, String um, String dm, String cm, String umi, String dmi, String cmi, String ub, String db, String cb, String ut, String dt, String ct, String uq, String dq, String cq, String uqu, long des, long unit) {
        if ((numOrig > 19) && (numOrig < 100)) {
            return resultatDesena(d, u);
        } else if ((numOrig > 99) && (numOrig < 1_000)) {
            return resultatCentena(c, d, u, des, unit);
        } else if ((numOrig > 999) && (numOrig < 20_000)) {
            return resultatUnitatDeMil(um, c, d, u, des, unit);
        } else if ((numOrig > 9_999) && (numOrig < 100_000)) {
            return resultatDesenaDeMil(dm, um, c, d, u, des, unit);
        } else if ((numOrig > 99_999) && (numOrig < 1_000_000)) {
            return resutatCentenaDeMil(cm, dm, um, c, d, u, des, unit);
        } else if ((numOrig > 999_999) && (numOrig < 1_000_000_000)) {
            return resultatUnitatDeMilio(umi, cm, dm, um, c, d, u, des, unit);
        } else if ((numOrig > 999_999_999) && (numOrig < 100_000_000_000L)) {
            return resultatUnitatDeBilio(ub, cmi, dmi, umi, cm, dm, um, c, d, u, des, unit);
        } else if ((numOrig > 99_999_999_999L) && (numOrig < 1_000_000_000_000L)) {
            return resultatCentenaDeBilio(cb, db, ub, cmi, dmi, umi, cm, dm, um, c, d, u);
        } else if ((numOrig > 999_999_999_999L) && (numOrig < 20_000_000_000_000L)) {
            return resultatUnitatDeTrilio(ut, cb, db, ub, umi, cm, dm, c, d, u);
        } else if ((numOrig > 19_999_999_999_999L) && (numOrig < 100_000_000_000_000L)) {
            return resultatDesenaDeTrilio(dt, ut, cb, db, ub, cmi, dmi, umi, cm, dm, um, c, d, u);
        } else if ((numOrig > 999_999_999_999_999L) && (numOrig < 1_000_000_000_000_000_000L)) {
            return resultatCentenaDeQuatrilio(cq, dq, uq, ct, dt, ut, cb, db, ub, cmi, dmi, umi, cm, dm, um, c, d, u);
        } else if (numOrig > 1_000_000_000_000_000_000L) {
        return resultatUnitatDeQuintilio(uqu, cq, dq, uq, ct, dt, ut, cb, db, ub, cmi, dmi, umi, cm, dm, um, c, d, u, des, unit);
        }
        return "";
    }


    static String menor20 (int n) {
        if (n == 0) {
            return "Zero";
        }
        if (n == 1) {
            return "One";
        }
        if (n == 2) {
            return "Two";
        }
        if (n == 3) {
            return "Three";
        }
        if (n == 4) {
            return "Four";
        }
        if (n == 5) {
            return "Five";
        }
        if (n == 6) {
            return "Six";
        }
        if (n == 7) {
            return "Seven";
        }
        if (n == 8) {
            return "Eight";
        }
        if (n == 9) {
            return "Nine";
        }
        if (n == 10) {
            return "Ten";
        }
        if (n == 11) {
            return "Eleven";
        }
        if (n == 12) {
            return "Twelve";
        }
        if (n == 13) {
            return "Thirteen";
        }
        if (n == 14) {
            return "Fourteen";
        }
        if (n == 15) {
            return "Fifteen";
        }
        if (n == 16) {
            return "Sixteen";
        }
        if (n == 17) {
            return "Seventeen";
        }
        if (n == 18) {
            return "Eighteen";
        }
        if (n == 19) {
            return "Nineteen";
        }
        return "";
    }

    static String desena (int des) {
        if (des == 2) {
            return "Twenty";
        }
        if (des == 3) {
            return "Thirty";
        }
        if (des == 4) {
            return "Forty";
        }
        if (des == 5) {
            return "Fifty";
        }
        if (des == 6) {
            return "Sixty";
        }
        if (des == 7) {
            return "Seventy";
        }
        if (des == 8) {
            return "Eighty";
        }
        if (des == 9) {
            return "Ninety";
        }
        return "";
    }

    static String centena(int cent) {
        if (cent == 1) {
            return "One hundred";
        }
        if (cent == 2) {
            return "Two hundred";
        }
        if (cent == 3) {
            return "Three hundred";
        }
        if (cent == 4) {
            return "Four hundred";
        }
        if (cent == 5) {
            return "Five hundred";
        }
        if (cent == 6) {
            return "Six hundred";
        }
        if (cent == 7) {
            return "Seven hundred";
        }
        if (cent == 8) {
            return "Eight hundred";
        }
        if (cent == 9) {
            return "Nine hundred";
        }
        return "";
    }


    static String resultatDesena(String d, String u) {
        if (u.equalsIgnoreCase("zero")) {
            return d;
        } else {
            return d + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static String resultatCentena(String c, String d, String u, long des, long unit) {
        if ((d.equals("")) && (u.equalsIgnoreCase("zero"))) {
            return c;
        } else if (des == 1) {
            return c + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else if (d.length() == 0) {
            return c + " and " + u.toLowerCase(Locale.ROOT);
        } else {
            return c + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static String resultatUnitatDeMil(String um, String c, String d, String u, long des, long unit) {
        if (c.equals("") && (u.equalsIgnoreCase("zero"))) {
            return um;
        } else if (u.equalsIgnoreCase("zero")) {
            return um + " " + c.toLowerCase(Locale.ROOT);
        } else if (des == 1) {
            return um + " " + c.toLowerCase(Locale.ROOT) + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else if (d.length() == 0) {
            return um + " " + c.toLowerCase(Locale.ROOT) + " and " + u.toLowerCase(Locale.ROOT);
        } else {
            return um + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatDesenaDeMil(String dm, String um, String c, String d, String u, long des, long unit) {
        if (c.equals("") && (u.equalsIgnoreCase("zero"))) {
            return dm + "-" + um.toLowerCase(Locale.ROOT);
        } else if (u.equalsIgnoreCase("zero")) {
            return dm + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT);
        } else if (des == 1) {
            return dm + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else if (d.length() == 0) {
            return dm + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + u.toLowerCase(Locale.ROOT);
        } else {
            return dm + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resutatCentenaDeMil(String cm, String dm, String um, String c, String d, String u, long des, long unit) {
        if ((dm.equals("")) && (c.equals("")) && (u.equalsIgnoreCase("zero"))) {
            return cm + " thousand";
        } else if ((c.equals("")) && (u.equalsIgnoreCase("zero"))) {
            return cm + " and " + dm + "-" + um.toLowerCase(Locale.ROOT);
        } else if (u.equalsIgnoreCase("zero")) {
            return cm + " and " + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT);
        } else if (des == 1) {
            return cm + " and " + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else if (d.length() == 0) {
            return cm + " and " + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + u.toLowerCase(Locale.ROOT);
        } else if (c.equals("")){
            return cm + " and " + dm.toLowerCase(Locale.ROOT) + um.toLowerCase(Locale.ROOT) + " " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        } else {
            return cm + " and " + dm.toLowerCase(Locale.ROOT) + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatUnitatDeMilio(String umi, String cm, String dm, String um, String c, String d, String u, long des, long unit) {
        if ((um.equalsIgnoreCase("zero thousand")) && (u.equalsIgnoreCase("zero"))) {
            return umi;
        } else if (cm.equals("")) {
            return umi + " " + um.toLowerCase(Locale.ROOT);
        } else if ((um.equalsIgnoreCase("zero thousand")) && (d.equals(""))) {
            return umi + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + " thousand "
                    + c.toLowerCase(Locale.ROOT) + " and " + u.toLowerCase(Locale.ROOT);
        } else if (um.equalsIgnoreCase("zero thousand")) {
            return umi + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + " thousand "
                    + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        } else if (des == 1) {
            return umi + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT)
                    + " " + c.toLowerCase(Locale.ROOT) + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else {
            return umi + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT)
                    + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatUnitatDeBilio(String ub, String cmi, String dmi, String umi, String cm, String dm, String um, String c, String d, String u, long des, long unit) {
        if ((umi.equalsIgnoreCase("zero million")) && (u.equalsIgnoreCase("zero"))) {
            return ub;
        } else if ((cmi.equals("")) && (u.equalsIgnoreCase("zero"))) {
            return ub + " " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT);
        } else if (des == 1) {
            return ub + " " + cmi.toLowerCase(Locale.ROOT) + " and " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and "
                    + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else {
            return ub + " " + cmi.toLowerCase(Locale.ROOT) + " and " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and "
                    + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatCentenaDeBilio(String cb, String db, String ub, String cmi, String dmi, String umi, String cm, String dm, String um, String c, String d, String u) {
        if (dmi.equals("")) {
            return cb + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " " + umi.toLowerCase(Locale.ROOT) + " "
                    + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + " thousand " + c.toLowerCase(Locale.ROOT)
                    + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        } else if (um.equalsIgnoreCase("zero thousand")) {
            return cb + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " " + cmi.toLowerCase(Locale.ROOT) + " and "
                    + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and "
                    + dm.toLowerCase(Locale.ROOT) + " thousand " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        } else {
            return cb + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " " + cmi.toLowerCase(Locale.ROOT) + " and "
                    + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT)
                    + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatUnitatDeTrilio(String ut, String cb, String db, String ub, String umi, String cm, String dm, String c, String d, String u) {
        if ((umi.equalsIgnoreCase("zero million")) && (u.equalsIgnoreCase("zero"))) {
            return ut;
        } else {
            return ut + " " + cb.toLowerCase(Locale.ROOT) + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " " + umi.toLowerCase(Locale.ROOT) + " "
                    + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + " thousand " + c.toLowerCase(Locale.ROOT)
                    + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatDesenaDeTrilio(String dt, String ut, String cb, String db, String ub, String cmi, String dmi, String umi, String cm, String dm, String um, String c, String d, String u) {
        return dt + "-" + ut.toLowerCase(Locale.ROOT) + " " + cb.toLowerCase(Locale.ROOT) + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " " + cmi.toLowerCase(Locale.ROOT)
                + " and " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + "-"
                + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
    }

    static Object resultatCentenaDeQuatrilio(String cq, String dq, String uq, String ct, String dt, String ut, String cb, String db, String ub, String cmi, String dmi, String umi, String cm, String dm, String um, String c, String d, String u) {
        if (cmi.equals("")) {
            return cq + " and " + dq.toLowerCase(Locale.ROOT) + "-" + uq.toLowerCase(Locale.ROOT) + " " + ct.toLowerCase(Locale.ROOT) + " and " + dt.toLowerCase(Locale.ROOT)
                    + "-" + ut.toLowerCase(Locale.ROOT) + " " + cb.toLowerCase(Locale.ROOT) + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " "
                    + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and " + dm.toLowerCase(Locale.ROOT) + "-"
                    + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        } else {
            return cq + " and " + dq.toLowerCase(Locale.ROOT) + "-" + uq.toLowerCase(Locale.ROOT) + " " + ct.toLowerCase(Locale.ROOT) + " and " + dt.toLowerCase(Locale.ROOT)
                    + "-" + ut.toLowerCase(Locale.ROOT) + " " + cb.toLowerCase(Locale.ROOT) + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT) + " "
                    + cmi.toLowerCase(Locale.ROOT) + " and " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and "
                    + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }

    static Object resultatUnitatDeQuintilio(String uqu, String cq, String dq, String uq, String ct, String dt, String ut, String cb, String db, String ub, String cmi, String dmi, String umi, String cm, String dm, String um, String c, String d, String u, long des, long unit) {
        if (des == 1) {
            return uqu + " " + cq.toLowerCase(Locale.ROOT) + " and " + dq.toLowerCase(Locale.ROOT) + "-" + uq.toLowerCase(Locale.ROOT) + " " + ct.toLowerCase(Locale.ROOT) + " and "
                    + dt.toLowerCase(Locale.ROOT) + "-" + ut.toLowerCase(Locale.ROOT) + " " + cb.toLowerCase(Locale.ROOT) + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT)
                    + " " + cmi.toLowerCase(Locale.ROOT) + " and " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and "
                    + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + menor20((int) (des * 10 + unit)).toLowerCase(Locale.ROOT);
        } else {
            return uqu + " " + cq.toLowerCase(Locale.ROOT) + " and " + dq.toLowerCase(Locale.ROOT) + "-" + uq.toLowerCase(Locale.ROOT) + " " + ct.toLowerCase(Locale.ROOT) + " and "
                    + dt.toLowerCase(Locale.ROOT) + "-" + ut.toLowerCase(Locale.ROOT) + " " + cb.toLowerCase(Locale.ROOT) + " and " + db.toLowerCase(Locale.ROOT) + "-" + ub.toLowerCase(Locale.ROOT)
                    + " " + cmi.toLowerCase(Locale.ROOT) + " and " + dmi.toLowerCase(Locale.ROOT) + "-" + umi.toLowerCase(Locale.ROOT) + " " + cm.toLowerCase(Locale.ROOT) + " and "
                    + dm.toLowerCase(Locale.ROOT) + "-" + um.toLowerCase(Locale.ROOT) + " " + c.toLowerCase(Locale.ROOT) + " and " + d.toLowerCase(Locale.ROOT) + "-" + u.toLowerCase(Locale.ROOT);
        }
    }



    public static long words(String s) {
        String[] ar1 = s.split(" ");

        long n = 0;
        for (int i = 0; i < ar1.length; i++) {
            n = valor(ar1[i]);
        }


        return n;
    }

    static int valor(String s) {
        if (s.contains("-")) {
            return desenaUnitat(s);
        } else {
            return menorVint(s);
        }
    }

    static int desenaUnitat(String s) {
        String[] ar2 = s.split("-");
        return 0;
    }

    static int menorVint (String s) {
        if (Objects.equals(s, "zero")) {
            return 0;
        }
        if (Objects.equals(s, "one")) {
            return 1;
        }
        if (Objects.equals(s, "two")) {
            return 2;
        }
        if (Objects.equals(s, "three")) {
            return 3;
        }
        if (Objects.equals(s, "four")) {
            return 4;
        }
        if (Objects.equals(s, "five")) {
            return 5;
        }
        if (Objects.equals(s, "six")) {
            return 6;
        }
        if (Objects.equals(s, "seven")) {
            return 7;
        }
        if (Objects.equals(s, "eight")) {
            return 8;
        }
        if (Objects.equals(s, "nine")) {
            return 9;
        }
        if (Objects.equals(s, "ten")) {
            return 10;
        }
        if (Objects.equals(s, "eleven")) {
            return 11;
        }
        if (Objects.equals(s, "twelve")) {
            return 12;
        }
        if (Objects.equals(s, "thirteen")) {
            return 13;
        }
        if (Objects.equals(s, "fourteen")) {
            return 14;
        }
        if (Objects.equals(s, "fifteen")) {
            return 15;
        }
        if (Objects.equals(s, "sixteen")) {
            return 16;
        }
        if (Objects.equals(s, "seventeen")) {
            return 17;
        }
        if (Objects.equals(s, "eighteen")) {
            return 18;
        }
        if (Objects.equals(s, "nineteen")) {
            return 19;
        }
        return 0;
    }

    static int menorCent (String s) {
        if (Objects.equals(s, "twenty")) {
            return 2;
        }
        if (Objects.equals(s, "thirty")) {
            return 3;
        }
        if (Objects.equals(s, "forty")) {
            return 4;
        }
        if (Objects.equals(s, "fifty")) {
            return 5;
        }
        if (Objects.equals(s, "sixty")) {
            return 6;
        }
        if (Objects.equals(s, "seventy")) {
            return 7;
        }
        if (Objects.equals(s, "eighty")) {
            return 8;
        }
        if (Objects.equals(s, "ninety")) {
            return 9;
        }
        return 0;
    }
}