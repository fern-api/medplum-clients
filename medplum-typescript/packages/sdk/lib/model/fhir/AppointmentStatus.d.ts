export declare type AppointmentStatus = AppointmentStatus.Proposed | AppointmentStatus.Pending | AppointmentStatus.Booked | AppointmentStatus.Arrived | AppointmentStatus.Fulfilled | AppointmentStatus.Cancelled | AppointmentStatus.Noshow | AppointmentStatus.Waitlist;
export declare const AppointmentStatus: {
    Proposed: AppointmentStatus.Proposed;
    Pending: AppointmentStatus.Pending;
    Booked: AppointmentStatus.Booked;
    Arrived: AppointmentStatus.Arrived;
    Fulfilled: AppointmentStatus.Fulfilled;
    Cancelled: AppointmentStatus.Cancelled;
    Noshow: AppointmentStatus.Noshow;
    Waitlist: AppointmentStatus.Waitlist;
    _visit: <Result>(value: AppointmentStatus, visitor: AppointmentStatus._Visitor<Result>) => Result;
};
export declare namespace AppointmentStatus {
    type Proposed = "proposed" & {
        __Proposed: void;
    };
    type Pending = "pending" & {
        __Pending: void;
    };
    type Booked = "booked" & {
        __Booked: void;
    };
    type Arrived = "arrived" & {
        __Arrived: void;
    };
    type Fulfilled = "fulfilled" & {
        __Fulfilled: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    type Noshow = "noshow" & {
        __Noshow: void;
    };
    type Waitlist = "waitlist" & {
        __Waitlist: void;
    };
    interface _Visitor<Result> {
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
