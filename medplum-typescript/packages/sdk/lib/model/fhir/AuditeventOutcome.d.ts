export declare type AuditeventOutcome = never;
export declare const AuditeventOutcome: {
    _visit: <Result>(_value: AuditeventOutcome, visitor: AuditeventOutcome._Visitor<Result>) => Result;
};
export declare namespace AuditeventOutcome {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
