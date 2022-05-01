export type Namingsystem_uniqueidType =
    | Namingsystem_uniqueidType.Oid
    | Namingsystem_uniqueidType.Uuid
    | Namingsystem_uniqueidType.Uri
    | Namingsystem_uniqueidType.Other;

export const Namingsystem_uniqueidType = {
    Oid: "oid" as Namingsystem_uniqueidType.Oid,
    Uuid: "uuid" as Namingsystem_uniqueidType.Uuid,
    Uri: "uri" as Namingsystem_uniqueidType.Uri,
    Other: "other" as Namingsystem_uniqueidType.Other,

    _visit: <Result>(
        value: Namingsystem_uniqueidType,
        visitor: Namingsystem_uniqueidType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Namingsystem_uniqueidType.Oid:
                return visitor.oid();
            case Namingsystem_uniqueidType.Uuid:
                return visitor.uuid();
            case Namingsystem_uniqueidType.Uri:
                return visitor.uri();
            case Namingsystem_uniqueidType.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Namingsystem_uniqueidType {
    export type Oid = "oid" & {
        __Oid: void;
    };
    export type Uuid = "uuid" & {
        __Uuid: void;
    };
    export type Uri = "uri" & {
        __Uri: void;
    };
    export type Other = "other" & {
        __Other: void;
    };

    export interface _Visitor<Result> {
        oid: () => Result;
        uuid: () => Result;
        uri: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
