export type DeviceStatus = DeviceStatus.Active | DeviceStatus.Inactive;

export const DeviceStatus = {
    Active: "active" as DeviceStatus.Active,
    Inactive: "inactive" as DeviceStatus.Inactive,

    _visit: <Result>(
        value: DeviceStatus,
        visitor: DeviceStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case DeviceStatus.Active:
                return visitor.active();
            case DeviceStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace DeviceStatus {
    export type Active = "active" & {
        __Active: void;
    };
    export type Inactive = "inactive" & {
        __Inactive: void;
    };

    export interface _Visitor<Result> {
        active: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
