export type Healthcareservice_availabletimeDaysofweekItem =
    | Healthcareservice_availabletimeDaysofweekItem.Mon
    | Healthcareservice_availabletimeDaysofweekItem.Tue
    | Healthcareservice_availabletimeDaysofweekItem.Wed
    | Healthcareservice_availabletimeDaysofweekItem.Thu
    | Healthcareservice_availabletimeDaysofweekItem.Fri
    | Healthcareservice_availabletimeDaysofweekItem.Sat
    | Healthcareservice_availabletimeDaysofweekItem.Sun;

export const Healthcareservice_availabletimeDaysofweekItem = {
    Mon: "mon" as Healthcareservice_availabletimeDaysofweekItem.Mon,
    Tue: "tue" as Healthcareservice_availabletimeDaysofweekItem.Tue,
    Wed: "wed" as Healthcareservice_availabletimeDaysofweekItem.Wed,
    Thu: "thu" as Healthcareservice_availabletimeDaysofweekItem.Thu,
    Fri: "fri" as Healthcareservice_availabletimeDaysofweekItem.Fri,
    Sat: "sat" as Healthcareservice_availabletimeDaysofweekItem.Sat,
    Sun: "sun" as Healthcareservice_availabletimeDaysofweekItem.Sun,

    _visit: <Result>(value: Healthcareservice_availabletimeDaysofweekItem, visitor: Healthcareservice_availabletimeDaysofweekItem._Visitor<Result>): Result => {
        switch (value) {
            case Healthcareservice_availabletimeDaysofweekItem.Mon: return visitor.mon();
            case Healthcareservice_availabletimeDaysofweekItem.Tue: return visitor.tue();
            case Healthcareservice_availabletimeDaysofweekItem.Wed: return visitor.wed();
            case Healthcareservice_availabletimeDaysofweekItem.Thu: return visitor.thu();
            case Healthcareservice_availabletimeDaysofweekItem.Fri: return visitor.fri();
            case Healthcareservice_availabletimeDaysofweekItem.Sat: return visitor.sat();
            case Healthcareservice_availabletimeDaysofweekItem.Sun: return visitor.sun();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Healthcareservice_availabletimeDaysofweekItem {
    export type Mon = "mon" & {
        __Mon: void,
    };
    export type Tue = "tue" & {
        __Tue: void,
    };
    export type Wed = "wed" & {
        __Wed: void,
    };
    export type Thu = "thu" & {
        __Thu: void,
    };
    export type Fri = "fri" & {
        __Fri: void,
    };
    export type Sat = "sat" & {
        __Sat: void,
    };
    export type Sun = "sun" & {
        __Sun: void,
    };

    export interface _Visitor<Result> {
        mon: () => Result;
        tue: () => Result;
        wed: () => Result;
        thu: () => Result;
        fri: () => Result;
        sat: () => Result;
        sun: () => Result;
        _unknown: () => Result;
    }
}
