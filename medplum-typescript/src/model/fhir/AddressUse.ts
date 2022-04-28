export type AddressUse =
    | AddressUse.Home
    | AddressUse.Work
    | AddressUse.Temp
    | AddressUse.Old
    | AddressUse.Billing;

export const AddressUse = {
    Home: "home" as AddressUse.Home,
    Work: "work" as AddressUse.Work,
    Temp: "temp" as AddressUse.Temp,
    Old: "old" as AddressUse.Old,
    Billing: "billing" as AddressUse.Billing,

    _visit: <Result>(value: AddressUse, visitor: AddressUse._Visitor<Result>): Result => {
        switch (value) {
            case AddressUse.Home: return visitor.home();
            case AddressUse.Work: return visitor.work();
            case AddressUse.Temp: return visitor.temp();
            case AddressUse.Old: return visitor.old();
            case AddressUse.Billing: return visitor.billing();
            default: return visitor._unknown();
        }
    },
};

export declare namespace AddressUse {
    export type Home = "home" & {
        __Home: void,
    };
    export type Work = "work" & {
        __Work: void,
    };
    export type Temp = "temp" & {
        __Temp: void,
    };
    export type Old = "old" & {
        __Old: void,
    };
    export type Billing = "billing" & {
        __Billing: void,
    };

    export interface _Visitor<Result> {
        home: () => Result;
        work: () => Result;
        temp: () => Result;
        old: () => Result;
        billing: () => Result;
        _unknown: () => Result;
    }
}
