export type AuditeventOutcome = never;

export const AuditeventOutcome = {
    _visit: <Result>(
        _value: AuditeventOutcome,
        visitor: AuditeventOutcome._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace AuditeventOutcome {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
