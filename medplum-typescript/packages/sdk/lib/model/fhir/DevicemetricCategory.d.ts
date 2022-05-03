export declare type DevicemetricCategory = DevicemetricCategory.Measurement | DevicemetricCategory.Setting | DevicemetricCategory.Calculation | DevicemetricCategory.Unspecified;
export declare const DevicemetricCategory: {
    Measurement: DevicemetricCategory.Measurement;
    Setting: DevicemetricCategory.Setting;
    Calculation: DevicemetricCategory.Calculation;
    Unspecified: DevicemetricCategory.Unspecified;
    _visit: <Result>(value: DevicemetricCategory, visitor: DevicemetricCategory._Visitor<Result>) => Result;
};
export declare namespace DevicemetricCategory {
    type Measurement = "measurement" & {
        __Measurement: void;
    };
    type Setting = "setting" & {
        __Setting: void;
    };
    type Calculation = "calculation" & {
        __Calculation: void;
    };
    type Unspecified = "unspecified" & {
        __Unspecified: void;
    };
    interface _Visitor<Result> {
        measurement: () => Result;
        setting: () => Result;
        calculation: () => Result;
        unspecified: () => Result;
        _unknown: () => Result;
    }
}
