export declare type DevicemetricOperationalstatus = DevicemetricOperationalstatus.On | DevicemetricOperationalstatus.Off | DevicemetricOperationalstatus.Standby;
export declare const DevicemetricOperationalstatus: {
    On: DevicemetricOperationalstatus.On;
    Off: DevicemetricOperationalstatus.Off;
    Standby: DevicemetricOperationalstatus.Standby;
    _visit: <Result>(value: DevicemetricOperationalstatus, visitor: DevicemetricOperationalstatus._Visitor<Result>) => Result;
};
export declare namespace DevicemetricOperationalstatus {
    type On = "on" & {
        __On: void;
    };
    type Off = "off" & {
        __Off: void;
    };
    type Standby = "standby" & {
        __Standby: void;
    };
    interface _Visitor<Result> {
        on: () => Result;
        off: () => Result;
        standby: () => Result;
        _unknown: () => Result;
    }
}
