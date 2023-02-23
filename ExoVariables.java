public class ExoVariables {
    public static void main(String[] args) {
        // Pour chaque variable, afficher sa valeur avec System.out.println();
        // Définition et assignation d'un double (nombre à virgule)
        double variableDouble = 99.99;
        System.out.println("ma variable double est :" + variableDouble);
        // Post incrémentation de d
        variableDouble++;
        System.out.println("ma variable double incrémentée est :" + variableDouble);
        // Création d'une variable contenant un booléen, initialisé à true.
        boolean variableBoolean = true;
        System.out.println("ma variable boolean est initialisé à : " + variableBoolean);
        // Affichage du contraire de sa valeur.
        System.out.println("ma variable boolean invérsée est :" + !variableBoolean);
        // Création en une ligne de trois variables de type int, avec la valeur 4
        int a, b, c;
        a = b = c = 4;
        System.out.println("la valeur de mes variables entiers: a=" + a + "; b=" + b + "; c=" + c + ".");
        // Affichage de la somme de ces trois variables
        int somme = a + b + c;
        System.out.println("somme de mes variables entiers est :" + somme);
        // Création de trois variables (var1,var2,var3) valant 3, 4 et 5
        int var1 = 7;
        int var2 = 4;
        int var3 = 5;
        System.out.println(
                "la valeur de mes variables entiers: var1=" + var1 + "; var2=" + var2 + "; var3=" + var3 + ".");
        // Afficher le résultat (booléen) de la comparaison suivante : var1 < var2 et
        // var2 < var3
        System.out.println("résultat booléen de var1<var2 : " + (var1 < var2));
        System.out.println("résultat booléen de var2<var3 : " + (var2 < var3));
        // Afficher le résultat (booléen) de la comparaison suivante : var1 différent de
        // var2 et var2 différent de var3
        System.out.println("résultat booléen de var1 different var2 : " + (var1 != var2));
        System.out.println("résultat booléen de var2 diffrent var3 : " + (var2 != var3));
        // Un petit opérateur ternaire pour finir ? Si la première variable définie
        // dans ce fichier est inférieure ou égale à la dernière
        // (de type entier) , afficher "ok" sinon afficher "ko"
        System.out.println("resultat de comparaison <= de var1 et var3 est :" + (var1 <= var3 ? "ok" : "ko"));

        float f1 = 3.14f;
        float f2 = 4.0f;
        System.out.println("resultat" + (f1 > (f2 + 1) ? "" + ++f1 : "" + f2++));
        byte x = 127;
        x++;
        System.out.println(x);
        /*
         * 127 = 01111111, 1=00000001 le dernier bit est affécté au signe 1 pour négatif
         * et 0 pour positif
         * 01111111
         * + 00000001
         * = 10000000 ==>-128
         */
        // Conversion d'un int en double
        int i1 = 4;
        double d1 = i1;

        // Conversion d'un double en int
        i1 = (int) d1;
        // Conversion d'un short en int
        short monShort = 5;
        int monInt = monShort;

        // Conversion d'un int en short
        int monInt2 = 16;
        short monShort2 = (short) monInt2;
        double typeVariable = 1.0f;
        System.out.println(((Object) typeVariable).getClass().getSimpleName());
    }

}
