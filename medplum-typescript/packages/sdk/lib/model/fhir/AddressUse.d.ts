export declare type AddressUse = AddressUse.Home | AddressUse.Work | AddressUse.Temp | AddressUse.Old | AddressUse.Billing;
export declare const AddressUse: {
    Home: AddressUse.Home;
    Work: AddressUse.Work;
    Temp: AddressUse.Temp;
    Old: AddressUse.Old;
    Billing: AddressUse.Billing;
    _visit: <Result>(value: AddressUse, visitor: AddressUse._Visitor<Result>) => Result;
};
export declare namespace AddressUse {
    type Home = "home" & {
        __Home: void;
    };
    type Work = "work" & {
        __Work: void;
    };
    type Temp = "temp" & {
        __Temp: void;
    };
    type Old = "old" & {
        __Old: void;
    };
    type Billing = "billing" & {
        __Billing: void;
    };
    interface _Visitor<Result> {
        home: () => Result;
        work: () => Result;
        temp: () => Result;
        old: () => Result;
        billing: () => Result;
        _unknown: () => Result;
    }
}
