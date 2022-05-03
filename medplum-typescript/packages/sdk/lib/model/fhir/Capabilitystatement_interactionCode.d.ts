export declare type Capabilitystatement_interactionCode = Capabilitystatement_interactionCode.Read | Capabilitystatement_interactionCode.Vread | Capabilitystatement_interactionCode.Update | Capabilitystatement_interactionCode.Patch | Capabilitystatement_interactionCode.Delete | Capabilitystatement_interactionCode.Create;
export declare const Capabilitystatement_interactionCode: {
    Read: Capabilitystatement_interactionCode.Read;
    Vread: Capabilitystatement_interactionCode.Vread;
    Update: Capabilitystatement_interactionCode.Update;
    Patch: Capabilitystatement_interactionCode.Patch;
    Delete: Capabilitystatement_interactionCode.Delete;
    Create: Capabilitystatement_interactionCode.Create;
    _visit: <Result>(value: Capabilitystatement_interactionCode, visitor: Capabilitystatement_interactionCode._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_interactionCode {
    type Read = "read" & {
        __Read: void;
    };
    type Vread = "vread" & {
        __Vread: void;
    };
    type Update = "update" & {
        __Update: void;
    };
    type Patch = "patch" & {
        __Patch: void;
    };
    type Delete = "delete" & {
        __Delete: void;
    };
    type Create = "create" & {
        __Create: void;
    };
    interface _Visitor<Result> {
        read: () => Result;
        vread: () => Result;
        update: () => Result;
        patch: () => Result;
        delete: () => Result;
        create: () => Result;
        _unknown: () => Result;
    }
}
