import { Reference } from "./Reference";

export interface AccessPolicy_Resource {
    resourceType: string | null | undefined;
    compartment: Reference | null | undefined;
    readonly: boolean | null | undefined;
    hiddenproperties: string[] | null | undefined;
    readonlyproperties: string[] | null | undefined;
}
