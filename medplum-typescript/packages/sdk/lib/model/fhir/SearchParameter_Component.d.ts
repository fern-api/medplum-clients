import { canonical } from "./canonical";
import { Extension } from "./Extension";
export interface SearchParameter_Component {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    definition: canonical;
    expression: string | null | undefined;
}
