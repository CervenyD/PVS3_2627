package zloOfMyOwn.TestInheritance;
/*
import fileworks.DataExport;
import fileworks.DataImport;
import zloOfMyOwn.TestInheritance.CardiacSurgeon;
import zloOfMyOwn.TestInheritance.Doctor;
import zloOfMyOwn.TestInheritance.Surgeon;


// Načtěte ze souboru hospitalData informace o doktorech
// do souboru hospital.txt vypiste nasledujici informace o vsech doktorech:

// 1. Doktora s nejvetsim vydelkem
// 2. Doktora s nejmensjim vydelkem
// 3. Prumerny plat v nemocnici
// 4. Pocet realizovanych operací srdce
// 5. Pocet udelenych penalizaci nemocnici
//     - Nemocnice je penalizovana za kazdy zakrok doktora, na ktery nema kvalifikaci

// Bonus:
//   Vypiste 5 nejlepe placenych doktoru v nemocnici
//   Procentualni zastoupeni zamestnancu. (příklad: 50% Doktoři, 35% Chirurgové, 15% Kardiochirurgové)
//   Kdo způsobil největší penalizaci nemocnici

public class Hospital {

    static int penalizace = 0; // Za kazdej spatnej zakrok se incrementne

    static void validateJob(Doctor d, String jobType)
    {

        if (d instanceof CardiacSurgeon)
        {
            if (!jobType.contains("C")) penalizace++;
        }
        else if (d instanceof Surgeon)
        {
            if (!jobType.contains("S")) penalizace++;
        }
        else // pro basic Doctora
        {
            if (!jobType.contains("D")) penalizace++;
        }



        // TODO: implementujte logiku validace práce:
        // Doktor může dělat práci typu `jobType` jen pokud je kvalifikovan
        // C -> cardiacSurgery
        // S -> surgery
        // D -> diagnose
    }

    public static void main(String[] args) {
        DataImport dImp = new DataImport("data/hospitalData.txt");
        DataExport dExp = new DataExport("data/hospital.txt");

        String line;
        String[] info;
        while(dImp.hasNext())
        {

            line = dImp.readLine();
            info = line.split(";");


            switch (info[1])
            {
                case "Doctor":
                    Doctor doc = new Doctor(info[0]);
                    break;
                case "Surgeon":
                    Surgeon knifeDoc = new Surgeon(info[0]);
                    break;
                case "CardiacSurgeon":
                    CardiacSurgeon heartDoc = new CardiacSurgeon(info[0]);
                    break;
            }
            for (String kusInfa : info)
            {
                if (kusInfa.length()!= 1)
                {
                    continue;
                }
                validateJob(     ,kusInfa);



            }


        }






        // TODO: napsat test

        // nezapomenout na úklid
        dImp.finishImport();
        dExp.finishExport();
    }
}
*/