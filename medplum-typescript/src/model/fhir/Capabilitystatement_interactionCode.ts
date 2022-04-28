export type Capabilitystatement_interactionCode =
    | Capabilitystatement_interactionCode.Read
    | Capabilitystatement_interactionCode.Vread
    | Capabilitystatement_interactionCode.Update
    | Capabilitystatement_interactionCode.Patch
    | Capabilitystatement_interactionCode.Delete
    | Capabilitystatement_interactionCode.Create;

export const Capabilitystatement_interactionCode = {
    Read: "read" as Capabilitystatement_interactionCode.Read,
    Vread: "vread" as Capabilitystatement_interactionCode.Vread,
    Update: "update" as Capabilitystatement_interactionCode.Update,
    Patch: "patch" as Capabilitystatement_interactionCode.Patch,
    Delete: "delete" as Capabilitystatement_interactionCode.Delete,
    Create: "create" as Capabilitystatement_interactionCode.Create,

    _visit: <Result>(value: Capabilitystatement_interactionCode, visitor: Capabilitystatement_interactionCode._Visitor<Result>): Result => {
        switch (value) {
            case Capabilitystatement_interactionCode.Read: return visitor.read();
            case Capabilitystatement_interactionCode.Vread: return visitor.vread();
            case Capabilitystatement_interactionCode.Update: return visitor.update();
            case Capabilitystatement_interactionCode.Patch: return visitor.patch();
            case Capabilitystatement_interactionCode.Delete: return visitor.delete();
            case Capabilitystatement_interactionCode.Create: return visitor.create();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_interactionCode {
    export type Read = "read" & {
        __Read: void,
    };
    export type Vread = "vread" & {
        __Vread: void,
    };
    export type Update = "update" & {
        __Update: void,
    };
    export type Patch = "patch" & {
        __Patch: void,
    };
    export type Delete = "delete" & {
        __Delete: void,
    };
    export type Create = "create" & {
        __Create: void,
    };

    export interface _Visitor<Result> {
        read: () => Result;
        vread: () => Result;
        update: () => Result;
        patch: () => Result;
        delete: () => Result;
        create: () => Result;
        _unknown: () => Result;
    }
}
