export type AddressType =
    | AddressType.Postal
    | AddressType.Physical
    | AddressType.Both;

export const AddressType = {
    Postal: "postal" as AddressType.Postal,
    Physical: "physical" as AddressType.Physical,
    Both: "both" as AddressType.Both,

    _visit: <Result>(
        value: AddressType,
        visitor: AddressType._Visitor<Result>
    ): Result => {
        switch (value) {
            case AddressType.Postal:
                return visitor.postal();
            case AddressType.Physical:
                return visitor.physical();
            case AddressType.Both:
                return visitor.both();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace AddressType {
    export type Postal = "postal" & {
        __Postal: void;
    };
    export type Physical = "physical" & {
        __Physical: void;
    };
    export type Both = "both" & {
        __Both: void;
    };

    export interface _Visitor<Result> {
        postal: () => Result;
        physical: () => Result;
        both: () => Result;
        _unknown: () => Result;
    }
}
