export declare type AddressType = AddressType.Postal | AddressType.Physical | AddressType.Both;
export declare const AddressType: {
    Postal: AddressType.Postal;
    Physical: AddressType.Physical;
    Both: AddressType.Both;
    _visit: <Result>(value: AddressType, visitor: AddressType._Visitor<Result>) => Result;
};
export declare namespace AddressType {
    type Postal = "postal" & {
        __Postal: void;
    };
    type Physical = "physical" & {
        __Physical: void;
    };
    type Both = "both" & {
        __Both: void;
    };
    interface _Visitor<Result> {
        postal: () => Result;
        physical: () => Result;
        both: () => Result;
        _unknown: () => Result;
    }
}
