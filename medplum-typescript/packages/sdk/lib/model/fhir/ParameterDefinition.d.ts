import { canonical } from "./canonical";
import { code } from "./code";
import { Extension } from "./Extension";
export interface ParameterDefinition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    name: code | null | undefined;
    use: code | null | undefined;
    min: number | null | undefined;
    max: string | null | undefined;
    documentation: string | null | undefined;
    type: code | null | undefined;
    profile: canonical | null | undefined;
}
