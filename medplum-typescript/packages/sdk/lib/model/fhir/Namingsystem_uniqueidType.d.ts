export declare type Namingsystem_uniqueidType = Namingsystem_uniqueidType.Oid | Namingsystem_uniqueidType.Uuid | Namingsystem_uniqueidType.Uri | Namingsystem_uniqueidType.Other;
export declare const Namingsystem_uniqueidType: {
    Oid: Namingsystem_uniqueidType.Oid;
    Uuid: Namingsystem_uniqueidType.Uuid;
    Uri: Namingsystem_uniqueidType.Uri;
    Other: Namingsystem_uniqueidType.Other;
    _visit: <Result>(value: Namingsystem_uniqueidType, visitor: Namingsystem_uniqueidType._Visitor<Result>) => Result;
};
export declare namespace Namingsystem_uniqueidType {
    type Oid = "oid" & {
        __Oid: void;
    };
    type Uuid = "uuid" & {
        __Uuid: void;
    };
    type Uri = "uri" & {
        __Uri: void;
    };
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        oid: () => Result;
        uuid: () => Result;
        uri: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
