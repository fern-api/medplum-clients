export type DevicemetricOperationalstatus =
    | DevicemetricOperationalstatus.On
    | DevicemetricOperationalstatus.Off
    | DevicemetricOperationalstatus.Standby;

export const DevicemetricOperationalstatus = {
    On: "on" as DevicemetricOperationalstatus.On,
    Off: "off" as DevicemetricOperationalstatus.Off,
    Standby: "standby" as DevicemetricOperationalstatus.Standby,

    _visit: <Result>(
        value: DevicemetricOperationalstatus,
        visitor: DevicemetricOperationalstatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case DevicemetricOperationalstatus.On:
                return visitor.on();
            case DevicemetricOperationalstatus.Off:
                return visitor.off();
            case DevicemetricOperationalstatus.Standby:
                return visitor.standby();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace DevicemetricOperationalstatus {
    export type On = "on" & {
        __On: void;
    };
    export type Off = "off" & {
        __Off: void;
    };
    export type Standby = "standby" & {
        __Standby: void;
    };

    export interface _Visitor<Result> {
        on: () => Result;
        off: () => Result;
        standby: () => Result;
        _unknown: () => Result;
    }
}
