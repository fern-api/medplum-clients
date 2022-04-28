export type ContactpointUse =
    | ContactpointUse.Home
    | ContactpointUse.Work
    | ContactpointUse.Temp
    | ContactpointUse.Old
    | ContactpointUse.Mobile;

export const ContactpointUse = {
    Home: "home" as ContactpointUse.Home,
    Work: "work" as ContactpointUse.Work,
    Temp: "temp" as ContactpointUse.Temp,
    Old: "old" as ContactpointUse.Old,
    Mobile: "mobile" as ContactpointUse.Mobile,

    _visit: <Result>(value: ContactpointUse, visitor: ContactpointUse._Visitor<Result>): Result => {
        switch (value) {
            case ContactpointUse.Home: return visitor.home();
            case ContactpointUse.Work: return visitor.work();
            case ContactpointUse.Temp: return visitor.temp();
            case ContactpointUse.Old: return visitor.old();
            case ContactpointUse.Mobile: return visitor.mobile();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ContactpointUse {
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
    export type Mobile = "mobile" & {
        __Mobile: void,
    };

    export interface _Visitor<Result> {
        home: () => Result;
        work: () => Result;
        temp: () => Result;
        old: () => Result;
        mobile: () => Result;
        _unknown: () => Result;
    }
}
