export declare type Healthcareservice_availabletimeDaysofweekItem = Healthcareservice_availabletimeDaysofweekItem.Mon | Healthcareservice_availabletimeDaysofweekItem.Tue | Healthcareservice_availabletimeDaysofweekItem.Wed | Healthcareservice_availabletimeDaysofweekItem.Thu | Healthcareservice_availabletimeDaysofweekItem.Fri | Healthcareservice_availabletimeDaysofweekItem.Sat | Healthcareservice_availabletimeDaysofweekItem.Sun;
export declare const Healthcareservice_availabletimeDaysofweekItem: {
    Mon: Healthcareservice_availabletimeDaysofweekItem.Mon;
    Tue: Healthcareservice_availabletimeDaysofweekItem.Tue;
    Wed: Healthcareservice_availabletimeDaysofweekItem.Wed;
    Thu: Healthcareservice_availabletimeDaysofweekItem.Thu;
    Fri: Healthcareservice_availabletimeDaysofweekItem.Fri;
    Sat: Healthcareservice_availabletimeDaysofweekItem.Sat;
    Sun: Healthcareservice_availabletimeDaysofweekItem.Sun;
    _visit: <Result>(value: Healthcareservice_availabletimeDaysofweekItem, visitor: Healthcareservice_availabletimeDaysofweekItem._Visitor<Result>) => Result;
};
export declare namespace Healthcareservice_availabletimeDaysofweekItem {
    type Mon = "mon" & {
        __Mon: void;
    };
    type Tue = "tue" & {
        __Tue: void;
    };
    type Wed = "wed" & {
        __Wed: void;
    };
    type Thu = "thu" & {
        __Thu: void;
    };
    type Fri = "fri" & {
        __Fri: void;
    };
    type Sat = "sat" & {
        __Sat: void;
    };
    type Sun = "sun" & {
        __Sun: void;
    };
    interface _Visitor<Result> {
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
