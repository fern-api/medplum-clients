import { Extension } from "./Extension";
import { TestScript_Capability } from "./TestScript_Capability";
import { TestScript_Link } from "./TestScript_Link";

export interface TestScript_Metadata {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    link: TestScript_Link[] | null | undefined;
    capability: TestScript_Capability[];
}
