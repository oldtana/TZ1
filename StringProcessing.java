package org.example;
import java.util.HashMap;

public class StringProcessing {
    private String[] lines;
    StringProcessing(String[] lines){
        this.lines=lines;
    }

public void editPurpose(){
    HashMap<Integer,String> replacement = new HashMap<>();
    replacement.put(91,"публ-нор.обяз (пос.по ВН и в связи с м-вом) согл-но ФЗ от 29.12.2006г. № 255-ФЗ об обяз. соц. страх.Реш.");
    replacement.put(95,"публ-нор.обяз.(по ВН и в связи с м-вом) согл-но ФЗ от 29.12.06 № 255-ФЗ об обяз. соц.страх Реш");
    replacement.put(94,"публ-нор.обяз (пос по врем. нетруд. в связи с НС) согл-но ФЗ от24.07.1998г. № 125-ФЗ об обяз.соц.страх. по НС, Реш.");
    replacement.put(36,"публ-нор.обяз (по врем. нетруд. НС) согл-но ФЗ от 24.07.98г. № 125-ФЗ об обяз. соц.страх НС, Реш.");
    replacement.put(92,"публ-нор.обяз (пособ. по ВН отд.кат.граж. в связи с зач. в страх.стаж нестр-х пер-в.) согл-но от 29.12.06г. №255-ФЗ об обяз.соц.страх, Реш.");
    replacement.put(96,"публ-нор.обяз (пособ. по ВН отд.кат.граж. в св-зи с зач. в страх.стаж нестр-х пер-в.), согл-но ФЗ от 29.12.06г. № 255-ФЗ об обяз. соц.страх. Реш.");
    String kbk="";
    for (int i=0;i<lines.length;i++){
        if(lines[i].contains("ZRST")){
            kbk=lines[i+3];
            break;
        }

    }
    //System.out.println(lines[2]);
    char ch1=kbk.charAt(13);
    char ch2=kbk.charAt(14);

    //kbk= String.valueOf(ch1+ch2);
    System.out.println(kbk);

    for (int i=0;i<lines.length;i++){
            if(lines[i].equals("~ZR")){
                //if((lines[i+29].contains("ПНО"))&&())
                    //lines[i+29]=lines[i+29].replaceAll("ПНО",replacement.get(91));
                break;

            }
        }
}
}
