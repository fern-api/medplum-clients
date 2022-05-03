import { ContactDetail } from "./ContactDetail";
import { ContributorType } from "./ContributorType";
import { Extension } from "./Extension";
export interface Contributor {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    type: ContributorType | null | undefined;
    name: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
}
