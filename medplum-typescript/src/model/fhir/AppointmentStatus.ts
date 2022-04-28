export type AppointmentStatus =
    | AppointmentStatus.Proposed
    | AppointmentStatus.Pending
    | AppointmentStatus.Booked
    | AppointmentStatus.Arrived
    | AppointmentStatus.Fulfilled
    | AppointmentStatus.Cancelled
    | AppointmentStatus.Noshow
    | AppointmentStatus.Waitlist;

export const AppointmentStatus = {
    Proposed: "proposed" as AppointmentStatus.Proposed,
    Pending: "pending" as AppointmentStatus.Pending,
    Booked: "booked" as AppointmentStatus.Booked,
    Arrived: "arrived" as AppointmentStatus.Arrived,
    Fulfilled: "fulfilled" as AppointmentStatus.Fulfilled,
    Cancelled: "cancelled" as AppointmentStatus.Cancelled,
    Noshow: "noshow" as AppointmentStatus.Noshow,
    Waitlist: "waitlist" as AppointmentStatus.Waitlist,

    _visit: <Result>(value: AppointmentStatus, visitor: AppointmentStatus._Visitor<Result>): Result => {
        switch (value) {
            case AppointmentStatus.Proposed: return visitor.proposed();
            case AppointmentStatus.Pending: return visitor.pending();
            case AppointmentStatus.Booked: return visitor.booked();
            case AppointmentStatus.Arrived: return visitor.arrived();
            case AppointmentStatus.Fulfilled: return visitor.fulfilled();
            case AppointmentStatus.Cancelled: return visitor.cancelled();
            case AppointmentStatus.Noshow: return visitor.noshow();
            case AppointmentStatus.Waitlist: return visitor.waitlist();
            default: return visitor._unknown();
        }
    },
};

export declare namespace AppointmentStatus {
    export type Proposed = "proposed" & {
        __Proposed: void,
    };
    export type Pending = "pending" & {
        __Pending: void,
    };
    export type Booked = "booked" & {
        __Booked: void,
    };
    export type Arrived = "arrived" & {
        __Arrived: void,
    };
    export type Fulfilled = "fulfilled" & {
        __Fulfilled: void,
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void,
    };
    export type Noshow = "noshow" & {
        __Noshow: void,
    };
    export type Waitlist = "waitlist" & {
        __Waitlist: void,
    };

    export interface _Visitor<Result> {
        proposed: () => Result;
        pending: () => Result;
        booked: () => Result;
        arrived: () => Result;
        fulfilled: () => Result;
        cancelled: () => Result;
        noshow: () => Result;
        waitlist: () => Result;
        _unknown: () => Result;
    }
}
