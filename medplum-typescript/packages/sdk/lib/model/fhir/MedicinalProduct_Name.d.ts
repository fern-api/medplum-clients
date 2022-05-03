import { Extension } from "./Extension";
import { MedicinalProduct_CountryLanguage } from "./MedicinalProduct_CountryLanguage";
import { MedicinalProduct_NamePart } from "./MedicinalProduct_NamePart";
export interface MedicinalProduct_Name {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    productName: string | null | undefined;
    namePart: MedicinalProduct_NamePart[] | null | undefined;
    countryLanguage: MedicinalProduct_CountryLanguage[] | null | undefined;
}
