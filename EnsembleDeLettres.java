/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnsembleDeLettres;

/**
 *
 * @author dufaud
 */
public class EnsembleDeLettres {

    /**
     * L'ensemble de lettres est représenté dans le tableau de boolean
     */
    private static final int NB_LETTRES = 26;
    private final boolean[] present;

    /*
     public EnsembleDeLettres() {
     present = null;
     for(int i=0; i<NB_LETTRES; i++) {
     present[i] = false;
     }
     }
     */
    /**
     * construit un ensemble aléatoire de 26 éléments
     */
    public EnsembleDeLettres() {
        present = new boolean[NB_LETTRES];
        for (int i = 0; i < NB_LETTRES; i++) {
            boolean x;
            if (Math.random() < 0.5) {
                x = false;
            } else {
                x = true;
            }
            present[i] = x;
        }
    }

    /**
     * construit l'ensemble des lettres de la chaine de caractères str
     */
    public EnsembleDeLettres(String str) {
        present = new boolean[NB_LETTRES];
        for (int i = 0; i < NB_LETTRES; i++) {
            present[i] = false;
        }
        for (int i = 0; i < str.length(); i++) {
            present[str.charAt(i) - 'a'] = true;
        }
    }

    /**
     * Méthode toString
     *
     * @return une chaine de caractères
     */
    public String toString() {
        String str = "";
        str += "{ ";
        for (int i = 0; i < NB_LETTRES; i++) {
            if (present[i]) {
                str += (char) ('a' + i) + " ";
            }
        }
        str += "} ";
        return str;
    }

    /**
     * ajoute une lettre à un ensemble existant
     *
     * @param c
     */
    public void ajouter(char c) {
        if ((c - 'a') >= 0 && (c - 'a') <= NB_LETTRES) {
            present[c - 'a'] = true;
        }
    }

    /**
     * teste si l'ensemble est vide en mesurant sa longueur
     *
     * @return
     */
    public boolean isEmpty() {
        boolean bool = true;
        for (int i = 0; i < NB_LETTRES; i++) {
            if (present[i]) {
                bool = false;
                return bool;
            }
        }
        return bool;
    }

    /**
     * calcule le nombre d'éléments de l'ensemble
     *
     * @return
     */
    public int cardinal() {
        int p = 0;
        for (int i = 0; i < NB_LETTRES; i++) {
            if (present[i]) {
                p++;
            }
        }
        return p;
    }

    /**
     * Vrai si l'ensemble a est inclus dans l'ensemble b
     *
     * @param a
     * @param b
     * @return
     */
    public boolean estInclus(EnsembleDeLettres a, EnsembleDeLettres b) {
        return false;
    }

    /**
     * teste si la lettre a est présente dans l'ensemble this
     *
     * @param a
     * @return
     */
    public boolean estPresente(char a) {
        return (present[a - 'a']);
    }

    /**
     * crée un nouvel ensemble qui est l'intersection de this et de l'ensemble a
     *
     * @param a
     * @return
     */
    public EnsembleDeLettres creationIntersect(EnsembleDeLettres a) {
        EnsembleDeLettres res = new EnsembleDeLettres();
        for (int i = 0; i < NB_LETTRES; i++) {
            res.present[i] = false;
        }
        for (int i = 0; i < NB_LETTRES; i++) {
            if (this.present[i] == true && a.present[i] == true) {
                res.present[i] = true;
            }
        }
        return res;
    }

    /**
     * crée un nouvel ensemble qui est l'union de this et de l'ensemble a
     *
     * @param a
     * @return
     */
    public EnsembleDeLettres creationUnion(EnsembleDeLettres a) {
        EnsembleDeLettres res = new EnsembleDeLettres();
        for (int i = 0; i < NB_LETTRES; i++) {
            res.present[i] = false;
        }
        for (int i = 0; i < NB_LETTRES; i++) {
            if (this.present[i] || a.present[i]) {
                res.present[i] = true;
            } 
         }
        return res;
    }

    /**
     * crée un nouvel ensemble qui est la différence de this et de l'ensemble a
     *
     * @param a
     * @return
     */
    public EnsembleDeLettres creationDifference(EnsembleDeLettres a) {
        return null;
    }

    /**
     * crée un nouvel ensemble qui est l'union disjointe de this et de
     * l'ensemble a
     *
     * @param a
     * @return
     */
    public EnsembleDeLettres creationUnionDisjointe(EnsembleDeLettres a) {
        return null;
    }

    public static void main(String[] args) {

        EnsembleDeLettres e1 = new EnsembleDeLettres("azerty");
        EnsembleDeLettres e2 = new EnsembleDeLettres("qwerty");
        EnsembleDeLettres e3 = new EnsembleDeLettres("xcvb");
        EnsembleDeLettres f;
        f = e1.creationIntersect(e2);
        EnsembleDeLettres g;
        g = e1.creationUnion(e2);

        //String st = "";
        /*for (int i=0; i<NB_LETTRES; i++) {
            System.out.println("e1 " + i + " " + (char)(i-'a') + " " + e1.present[i]);
        }
         */
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        System.out.println("Intersection de e1 et e2 : " + f.toString());
        System.out.println("Union de e1 et e2 : " + g.toString());


    }

}
