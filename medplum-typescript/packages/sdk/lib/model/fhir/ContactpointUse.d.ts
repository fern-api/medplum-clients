export declare type ContactpointUse = ContactpointUse.Home | ContactpointUse.Work | ContactpointUse.Temp | ContactpointUse.Old | ContactpointUse.Mobile;
export declare const ContactpointUse: {
    Home: ContactpointUse.Home;
    Work: ContactpointUse.Work;
    Temp: ContactpointUse.Temp;
    Old: ContactpointUse.Old;
    Mobile: ContactpointUse.Mobile;
    _visit: <Result>(value: ContactpointUse, visitor: ContactpointUse._Visitor<Result>) => Result;
};
export declare namespace ContactpointUse {
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
    type Mobile = "mobile" & {
        __Mobile: void;
    };
    interface _Visitor<Result> {
        home: () => Result;
        work: () => Result;
        temp: () => Result;
        old: () => Result;
        mobile: () => Result;
        _unknown: () => Result;
    }
}
