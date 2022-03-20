package com.example.amon.inference;

public class ForwardChaining {


    public static void rule_langa_gara() {
        if(PremiseState.allPremisesState.get("merge_cu_trenul") &&
                PremiseState.allPremisesState.get("este_grabit") &&
                    PremiseState.allPremisesState.get("este_infometat")) {
            PremiseState.allPremisesState.replace("langa_gara",true);
        }

    }

    public static void rule_pe_malul_begai() {
        if(PremiseState.allPremisesState.get("priveliste_spre_rau") &&
                PremiseState.allPremisesState.get("intalnire_romantica")) {
            PremiseState.allPremisesState.replace("pe_malul_begai",true);
        }
    }

    public static void rule_langa_mall() {
        if(PremiseState.allPremisesState.get("shopping") &&
                PremiseState.allPremisesState.get("este_intalnire")) {
            System.out.println("AIACIII");
            PremiseState.allPremisesState.replace("langa_mall",true);
        }
    }

    public static void rule_Restauran_A() {
        if(PremiseState.allPremisesState.get("langa_gara") &&
                PremiseState.allPremisesState.get("fumator") &&
                    PremiseState.allPremisesState.get("buget_mic") &&
                         PremiseState.allPremisesState.get("vegetarian")) {
            PremiseState.allPremisesState.replace("Restauran_A",true);
        }

    }

    public static void generateConclusion() {


        boolean flag = false;

        while(!flag) {

        }

    }

}
