export type DevicemetricCategory =
    | DevicemetricCategory.Measurement
    | DevicemetricCategory.Setting
    | DevicemetricCategory.Calculation
    | DevicemetricCategory.Unspecified;

export const DevicemetricCategory = {
    Measurement: "measurement" as DevicemetricCategory.Measurement,
    Setting: "setting" as DevicemetricCategory.Setting,
    Calculation: "calculation" as DevicemetricCategory.Calculation,
    Unspecified: "unspecified" as DevicemetricCategory.Unspecified,

    _visit: <Result>(
        value: DevicemetricCategory,
        visitor: DevicemetricCategory._Visitor<Result>
    ): Result => {
        switch (value) {
            case DevicemetricCategory.Measurement:
                return visitor.measurement();
            case DevicemetricCategory.Setting:
                return visitor.setting();
            case DevicemetricCategory.Calculation:
                return visitor.calculation();
            case DevicemetricCategory.Unspecified:
                return visitor.unspecified();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace DevicemetricCategory {
    export type Measurement = "measurement" & {
        __Measurement: void;
    };
    export type Setting = "setting" & {
        __Setting: void;
    };
    export type Calculation = "calculation" & {
        __Calculation: void;
    };
    export type Unspecified = "unspecified" & {
        __Unspecified: void;
    };

    export interface _Visitor<Result> {
        measurement: () => Result;
        setting: () => Result;
        calculation: () => Result;
        unspecified: () => Result;
        _unknown: () => Result;
    }
}
