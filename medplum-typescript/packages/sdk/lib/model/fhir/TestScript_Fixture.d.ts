import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface TestScript_Fixture {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    autocreate: boolean | null | undefined;
    autodelete: boolean | null | undefined;
    resource: Reference | null | undefined;
}
