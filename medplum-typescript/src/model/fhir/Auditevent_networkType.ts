export type Auditevent_networkType = never;

export const Auditevent_networkType = {
    _visit: <Result>(
        _value: Auditevent_networkType,
        visitor: Auditevent_networkType._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace Auditevent_networkType {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
