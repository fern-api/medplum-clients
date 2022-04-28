export type MessagedefinitionResponserequired =
    | MessagedefinitionResponserequired.Always
    | MessagedefinitionResponserequired.Never;

export const MessagedefinitionResponserequired = {
    Always: "always" as MessagedefinitionResponserequired.Always,
    Never: "never" as MessagedefinitionResponserequired.Never,

    _visit: <Result>(value: MessagedefinitionResponserequired, visitor: MessagedefinitionResponserequired._Visitor<Result>): Result => {
        switch (value) {
            case MessagedefinitionResponserequired.Always: return visitor.always();
            case MessagedefinitionResponserequired.Never: return visitor.never();
            default: return visitor._unknown();
        }
    },
};

export declare namespace MessagedefinitionResponserequired {
    export type Always = "always" & {
        __Always: void,
    };
    export type Never = "never" & {
        __Never: void,
    };

    export interface _Visitor<Result> {
        always: () => Result;
        never: () => Result;
        _unknown: () => Result;
    }
}
