export declare type DeviceStatus = DeviceStatus.Active | DeviceStatus.Inactive;
export declare const DeviceStatus: {
    Active: DeviceStatus.Active;
    Inactive: DeviceStatus.Inactive;
    _visit: <Result>(value: DeviceStatus, visitor: DeviceStatus._Visitor<Result>) => Result;
};
export declare namespace DeviceStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Inactive = "inactive" & {
        __Inactive: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
